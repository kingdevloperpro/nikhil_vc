package com.ads.sdk.fdsf12;

import android.content.Context;

import com.ads.sdk.sfsf45f4.fdfdsff44;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class sadfdf23d14 {

    private static Retrofit retrofit = null;

    public static Retrofit getClient(Context applicationContext, String packageName) {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).hostnameVerifier(new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession session) {
                HostnameVerifier hv = HttpsURLConnection.getDefaultHostnameVerifier();
                return hv.verify(fdfdsff44.apiHost(applicationContext, packageName), session);
            }
        }).build();

        retrofit = new Retrofit.Builder()
                .baseUrl(fdfdsff44.baseURL(applicationContext, packageName))
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }


}