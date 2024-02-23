package com.ads.sdk.f1df1;

import android.content.Context;

import com.ads.sdk.sfsf45f4.fsdfdsf445;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class fd2f2f2 {
    private static Retrofit retrofit;

    public static Retrofit getRetrofitInstance(Context context) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(new fsdfdsf445(context).getKeyNotification_Link())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}