package com.sai.androidq;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface RecyclerInterface {
    String JSONURL =  "http://lms.genetech.co.in:8055/api/";
    @POST("Phylocationlookup")
    @Headers("Content-Type: application/json")
    Call<String> getUser(@Body String body);
}
