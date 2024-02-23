package com.ads.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.ads.sdk.fsadf5.fedfdf11;
import com.ads.sdk.fsadf5.sfdf44;
import com.ads.sdk.fsadf5.fdsf63f43;
import com.ads.sdk.sfsf45f4.fsdfdsf445;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class gfgf {

    private static gfgf instance;

    public static gfgf getManager() {
        if (instance == null) {
            instance = new gfgf();
        }
        return instance;
    }

    public void initialize(Application mContext, Class<?> splashClass) {
        MobileAds.initialize(mContext.getApplicationContext(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AudienceNetworkAds.initialize(mContext);
        new sfdf44(mContext, splashClass);
    }

    public static boolean isOnline(Activity activity) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) activity.getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public void preLoadAds(Activity activity) {

        if (!new fsdfdsf445(activity).getAdmobInterstitialID().isEmpty() ) {

            if (!new fsdfdsf445(activity).getAdmobInterStatus().equals("0")) {
                fdsf63f43.getManager(activity).loadAd(activity,true);
            }

            if (!new fsdfdsf445(activity).getAdmobInterStatus().equals("0")) {
                fdsf63f43.getManager(activity).loadBackAd(activity);
            }
        }

        if (!new fsdfdsf445(activity).getAdmobNative().equals("0") &&
                !new fsdfdsf445(activity).getAdmobNativeID().isEmpty()) {
            fedfdf11.getInstance(activity).preLoadNativeAds(activity,0);
        }
    }
}
