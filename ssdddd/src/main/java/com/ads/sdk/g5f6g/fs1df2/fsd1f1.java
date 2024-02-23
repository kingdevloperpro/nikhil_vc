package com.ads.sdk.g5f6g.fs1df2;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class fsd1f1 {

//    public static final String BASE_URL = "http://ip-api.com/";

    public static jghkgj getGeoApiService(Context context, String pk) {
        return new Retrofit.Builder()
                .baseUrl(fsdf1.baseURL(context, pk))
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(jghkgj.class);
    }

}
