package com.example.android4a;

import com.example.android4a.Modèle.Data;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetData {

    @GET("positions.json")
    Call<List<Data>> getPositions(@Query("search") String searchValue);
}
