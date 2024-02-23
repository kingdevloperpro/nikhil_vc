package com.ads.sdk.f1df1;

import com.ads.sdk.f1df1.model.ModelNotify;

import retrofit2.Call;
import retrofit2.http.GET;

public interface fsd1f {
    @GET("notification.json")
    Call<ModelNotify> getNotifyData();
}