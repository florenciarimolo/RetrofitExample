package com.example.florenciarf.retrofitexample;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by florenciarf on 27/11/16.
 */

public interface ApiService {

    @GET("item/8863.json")
    Call<HackerNews> getMyJSON();
}
