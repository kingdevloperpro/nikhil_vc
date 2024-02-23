package com.ads.sdk.fdsf12;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;

public interface defd5f5df4 {


    @GET("getRequest.json")
    Call<JsonObject> doCall();

    @GET("getSafe.json")
    Call<JsonObject> doSafe();
}