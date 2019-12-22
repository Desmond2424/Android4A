package com.example.android4a;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainController {

    static final String BASE_URL = "https://jobs.github.com/";

    private final FourthFragment view;

    public MainController(FourthFragment view) {
        this.view = view;
    }

    public void start() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        GetData getData = retrofit.create(GetData.class);

        Call<List<Data>> call = getData.getPositions("node");
        call.enqueue(new Callback<List<Data>>() {
            @Override
            public void onResponse(Call<List<Data>> call, Response<List<Data>> response) {
                List<Data> list = response.body();
                view.loadList(list);
            }

            @Override
            public void onFailure(Call<List<Data>> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
