package com.example.android4a.Controller;

import java.util.List;

import com.example.android4a.Modèle.Data;
import com.example.android4a.Vue.FourthFragment;
import com.example.android4a.GetData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainController {

    private GetData getData;

    private final FourthFragment view;

    public MainController(FourthFragment view, GetData getData) {
        this.view = view;
        this.getData = getData;
    }

    public void start() {
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
