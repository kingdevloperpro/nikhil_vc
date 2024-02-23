package com.ads.sdk;

import static com.ads.sdk.sfsf45f4.fsdfdsf445.app_back_count_click;
import static com.ads.sdk.sfsf45f4.fsdfdsf445.app_combo_counter;
import static com.ads.sdk.sfsf45f4.fsdfdsf445.app_count_click;
import static com.ads.sdk.sfsf45f4.fsdfdsf445.isComboActive;

import android.app.Activity;

import com.ads.sdk.fsadf5.fdsf63f43;
import com.ads.sdk.sfsf45f4.fsdfdsf445;
import com.ads.sdk.fgd1fg52g.g1fg1;

public class fdgfiiii {

    public static void ShowInterstitialAdsOnCreate(Activity activity) {

        if (isComboActive) {
            if (app_combo_counter == Integer.parseInt(new fsdfdsf445(activity).getComboCount())) {
                callingInter(activity);
                app_combo_counter = 0;
            } else {
                app_combo_counter = app_combo_counter + 1;
            }
        } else {
            callingInter(activity);
        }


    }

    private static void callingInter(Activity activity) {
        fdsf63f43.getManager(activity).showInterAd(activity, new g1fg1() {
            @Override
            public void onShowAdComplete() {
                fdsf63f43.getManager(activity).showFacebookAds(activity);
            }
        }, app_count_click);
    }



    public static void ShowInterstitialAdsOnBack(Activity activity) {
        fdsf63f43.getManager(activity).ShowInterBackAd(activity, new g1fg1() {
            @Override
            public void onShowAdComplete() {
                activity.finish();
            }
        }, app_back_count_click);
    }
}