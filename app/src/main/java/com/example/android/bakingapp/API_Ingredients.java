package com.example.android.bakingapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by HaZa on 29-Apr-18.
 */

public interface API_Ingredients {

    String BASE_URL="https://d17h27t6h515a5.cloudfront.net/";

    @GET("topher/2017/May/59121517_baking/baking.json")
    Call<List<Recipe>> getRecipes();
}

