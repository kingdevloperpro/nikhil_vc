package com.ads.sdk.sfsf45f4;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.browser.customtabs.CustomTabsIntent;

import com.ads.sdk.R;
import com.ads.sdk.f1df1.model.NotificationDatum;
import com.bumptech.glide.Glide;
import com.google.gson.JsonObject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class fsdfdsf445 {

    //multiple fb
    public static int fb_inter_index = 1;
    public static int fb_native_index = 1;
    public static int fb_banner_index = 1;


    private static final String TAG = fsdfdsf445.class.getSimpleName();

    SharedPreferences preferences;


    public fsdfdsf445(Context activity) {
        preferences = activity.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
    }

    private static final String PREFERENCE_NAME = "ads_sdk";
    private static final String KEY_INSTALL_TYPE = "install_type";
    private static final String KEY_PRIVACY_LINK = "Team_Pinky_Producation_House_privacyLink"; //
    private static final String KEY_ADS_FLAG = "Team_Pinky_Producation_House_adShow_Sts";  //
    private static final String KEY_UPDATE_APP = "Team_Pinky_Producation_House_updateDialog";  //
    private static final String KEY_UPDATE_VERSION_CODE = "Team_Pinky_Producation_House_verCode";

    private static final String KEY_FIX_COUNTRY = "Team_Pinky_Producation_House_launchCountryName"; //
    private static final String KEY_SWIPE_COUNTRY = "Team_Pinky_Producation_House_swipCountryName";//
    private static final String KEY_SWIPE_MAIN = "Team_Pinky_Producation_House_swipMain";//

    public static String KEY_FORWARD_INTER_ALTERNATIVE = "Team_Pinky_Producation_House_forwardInterstitialF"; //
    private static final String KEY_BACKWARD_INTER_ALTERNATIVE = "Team_Pinky_Producation_House_backwardInterstitialB";//

    //added ADMOB
    private static final String KEY_ADMOB_INTER_STATUS = "Team_Pinky_Producation_House_inter_Sts";
    private static final String KEY_ADMOB_BACK_STATUS = "Team_Pinky_Producation_House_back_Sts";
    private static final String KEY_ADMOB_NATIVE_STATUS = "Team_Pinky_Producation_House_native_Sts";
    private static final String KEY_ADMOB_BANNER_STATUS = "Team_Pinky_Producation_House_banner_Sts";
    private static final String KEY_ADMOB_APPOPEN_STATUS = "Team_Pinky_Producation_House_appOpen_Sts";
    private static final String KEY_ADMOB_NATIVE = "Team_Pinky_Producation_House_nativeBigAd";
    private static final String KEY_ADMOB_BANNER = "Team_Pinky_Producation_House_nativeBannerAd";
    private static final String KEY_INTERSTITIAL_FREQUENCY = "Team_Pinky_Producation_House_forwardClick"; //
    private static final String KEY_INTERSTITIAL_BACK_FREQUENCY = "Team_Pinky_Producation_House_backClick"; //
    private static final String KEY_COMBO_FREQUENCY = "Team_Pinky_Producation_House_comboClick"; //
    private static final String KEY_AD_DIALOG = "Team_Pinky_Producation_House_admob_ad_dailog";
    private static final String KEY_APP_OPEN_AD_SEC = "Team_Pinky_Producation_House_app_open_ad_sec";

    //added FB
    private static final String KEY_FB_ADSHOW_STATUS = "Team_Pinky_Producation_House_fb_adshowStatus";//
    private static final String KEY_FB_BANNER_AD_ID_1 = "Team_Pinky_Producation_House_fb_bannerId_1";
    private static final String KEY_FB_BANNER_AD_ID_2 = "Team_Pinky_Producation_House_fb_bannerId_2";
    private static final String KEY_FB_BANNER_AD_ID_3 = "Team_Pinky_Producation_House_fb_bannerId_3";
    private static final String KEY_FB_BANNER_AD_ID_4 = "Team_Pinky_Producation_House_fb_bannerId_4";
    private static final String KEY_FB_BANNER_AD_ID_5 = "Team_Pinky_Producation_House_fb_bannerId_5";
    private static final String KEY_FB_BANNER_AD_ID_6 = "Team_Pinky_Producation_House_fb_bannerId_6";
    private static final String KEY_FB_INTERSTITIAL_AD_ID_1 = "Team_Pinky_Producation_House_fb_interstitialId_1";
    private static final String KEY_FB_INTERSTITIAL_AD_ID_2 = "Team_Pinky_Producation_House_fb_interstitialId_2";
    private static final String KEY_FB_INTERSTITIAL_AD_ID_3 = "Team_Pinky_Producation_House_fb_interstitialId_3";
    private static final String KEY_FB_INTERSTITIAL_AD_ID_4 = "Team_Pinky_Producation_House_fb_interstitialId_4";
    private static final String KEY_FB_INTERSTITIAL_AD_ID_5 = "Team_Pinky_Producation_House_fb_interstitialId_5";
    private static final String KEY_FB_INTERSTITIAL_AD_ID_6 = "Team_Pinky_Producation_House_fb_interstitialId_6";
    private static final String KEY_FB_NATIVE_AD_ID_1 = "Team_Pinky_Producation_House_fb_nativeId_1";
    private static final String KEY_FB_NATIVE_AD_ID_2 = "Team_Pinky_Producation_House_fb_nativeId_2";
    private static final String KEY_FB_NATIVE_AD_ID_3 = "Team_Pinky_Producation_House_fb_nativeId_3";
    private static final String KEY_FB_NATIVE_AD_ID_4 = "Team_Pinky_Producation_House_fb_nativeId_4";
    private static final String KEY_FB_NATIVE_AD_ID_5 = "Team_Pinky_Producation_House_fb_nativeId_5";
    private static final String KEY_FB_NATIVE_AD_ID_6 = "Team_Pinky_Producation_House_fb_nativeId_6";

    /*For Ad Color*/
    private static String KEY_NATIVE_BUTTON_COLOR = "Team_Pinky_Producation_House_ad_nativebutton";
    private static String KEY_NATIVE_TAG_COLOR = "Team_Pinky_Producation_House_ad_nativeTAG";
    private static String KEY_NATIVE_BG_COLOR = "Team_Pinky_Producation_House_ad_nativebg";
    private static String KEY_NATIVE_TITLE_COLOR = "Team_Pinky_Producation_House_ad_nativetitle";
    private static String KEY_NATIVE_DESC_COLOR = "Team_Pinky_Producation_House_ad_nativedescription";
    private static String KEY_NATIVE_SPACEBOX = "Team_Pinky_Producation_House_native_spacebox";
    private static String KEY_NATIVE_SPACEBOX_COLOR = "Team_Pinky_Producation_House_native_spacebox_color";

    /*For ads Ids*/
    private static final String KEY_ADMOB_APPOPEN_AD_ID = "Team_Pinky_Producation_House_appOpenAdId";//
    private static final String KEY_ADMOB_BANNER_AD_ID = "Team_Pinky_Producation_House_bannerAdId";//
    private static final String KEY_ADMOB_INTERSTITIAL_AD_ID = "Team_Pinky_Producation_House_interstitialAdId"; //
    private static final String KEY_ADMOB_NATIVE_AD_ID = "Team_Pinky_Producation_House_nativeAdId"; //
    private static final String KEY_ONRESUMENATIVESHOW = "Team_Pinky_Producation_House_onResumeNativeShow"; //

    //custom
    private static String KEY_CUSTOM_ADSHOW_STATUS = "Team_Pinky_Producation_House_customAd_Sts";
    private static String KEY_CUSTOM_APPOPEN_AD = "Team_Pinky_Producation_House_customAppOpen_Sts";
    private static String KEY_CUSTOM_INTER_AD = "Team_Pinky_Producation_House_customInterstitial_Sts";
    private static String KEY_CUSTOM_BACK_AD = "Team_Pinky_Producation_House_customBack_Sts";
    private static String KEY_CUSTOM_NATIVE_AD = "Team_Pinky_Producation_House_customNativeBanner_Sts";
    private static String KEY_CUSTOM_CLOSE_AD = "Team_Pinky_Producation_House_Custom_close_ad";

    //other
    private static String KEY_STATUSSAVER = "Team_Pinky_Producation_House_statusSaver";
    private static String KEY_TERMSCREEN = "Team_Pinky_Producation_House_termScreen";
    private static String KEY_STARTSCREEN = "Team_Pinky_Producation_House_startScreen";
    private static String KEY_EXITSCREEN = "Team_Pinky_Producation_House_exitScreen";
    private static String KEY_PERMISSIONSCREEN = "Team_Pinky_Producation_House_permissionScreen";
    private static String KEY_VIDEOPLAYER = "Team_Pinky_Producation_House_videoPlayer";

    //notification
    private static String KEY_NOTIFICATION_STATUS = "Team_Pinky_Producation_House_notification_status";
    private static String KEY_NOTIFICATION_LINK = "Team_Pinky_Producation_House_notification_link";
    public static List<NotificationDatum> notificationDatumList = new ArrayList<>();
    public static String Glob_Notification_Minutes = "10";

    //qureka
    private static String KEY_QUREKABUTTONVIEW = "Team_Pinky_Producation_House_qurekabuttonview";
    private static String KEY_PREDCHAMPBUTTONVIEW = "Team_Pinky_Producation_House_predchampbuttonview";
    private static String KEY_MGLBUTTONVIEW = "Team_Pinky_Producation_House_mglbuttonview";
    private static String KEY_HEADERVIEW = "Team_Pinky_Producation_House_headerview";
    private static String KEY_QUREKALINK = "Team_Pinky_Producation_House_qurekaLink";
    private static String KEY_PREDCHAMPLINK = "Team_Pinky_Producation_House_predchampLink";
    private static String KEY_MGLLINK = "Team_Pinky_Producation_House_mglLink";
    private static String KEY_QUREKAIMAGELINK = "Team_Pinky_Producation_House_qurekaImageLink";
    private static String KEY_PREDCHAMPIMAGELINK = "Team_Pinky_Producation_House_predchampImageLink";
    private static String KEY_MGLIMAGELINK = "Team_Pinky_Producation_House_mglImageLink";
    private static String KEY_HEADERLINK = "Team_Pinky_Producation_House_HeaderLink";
    private static String KEY_HEADERIMAGELINK = "Team_Pinky_Producation_House_qurekaHeaderImagelink";

    private static String KEY_CUSTOMAPPLINK = "Team_Pinky_Producation_House_custom_open_link_on_termscreen";
    private static String KEY_CUSTOMAPPBUTTON = "Team_Pinky_Producation_House_custom_open_link";


    private static String KEY_EXITNATIVE = "Team_Pinky_Producation_House_exitNative_sts";

    private static String KEY_NEW_COUNTRY = "Team_Pinky_Producation_House_countryScreen";
    private static String KEY_NEW_LANGUAGE = "Team_Pinky_Producation_House_app_language_Screen";

    private static String KEY_VIEWPAGER_INTER = "ViewPager_Inter_Counter";


    //video call
    private static String KEY_VC_INCOMING_WELCOME = "videoCall_Incoming_Welcome";
    private static String KEY_VC_INCOMING_COUNTER = "videoCall_Incoming_Counter";
    private static String KEY_VC_INCOMING_LONGAPP = "videoCall_IsLongApp";
    private static String KEY_VC_ON_OFF = "videoCall_OnOff";

    //in-app
    private static String KEY_IN_APP_MODE = "InApp_Mode";
    private static String KEY_IN_APP_PRICE_GOLD = "InApp_Price_Gold";
    private static String KEY_IN_APP_PRICE_SILVER = "InApp_Price_Silver";
    private static String KEY_IN_APP_PRICE_BRONZE = "InApp_Price_Bronze";
    private static String KEY_IN_APP_UPI_ID = "InApp_Upi_Id";
    private static String KEY_IN_APP_UPI_NAME = "InApp_Upi_Name";
    private static String KEY_IN_APP_UPI_DESC = "InApp_Upi_Desc";

    //hd videos
    private static String KEY_HOT_VIDEO_1 = "hotvideoLink1";
    private static String KEY_HOT_VIDEO_2 = "hotvideoLink2";


    public void setAdsResponse(JsonObject object) {
        if (object != null) {


            checkNotNull(object, KEY_PRIVACY_LINK, "Team_Pinky_Producation_House_privacyLink"); //
            checkNotNull(object, KEY_UPDATE_APP, "Team_Pinky_Producation_House_updateDialog"); //
            checkNotNull(object, KEY_UPDATE_VERSION_CODE, "Team_Pinky_Producation_House_verCode"); //

            checkNotNull(object, KEY_ADS_FLAG, "Team_Pinky_Producation_House_adShow_Sts"); //
            checkNotNull(object, KEY_INTERSTITIAL_FREQUENCY, "Team_Pinky_Producation_House_forwardClick"); //
            checkNotNull(object, KEY_INTERSTITIAL_BACK_FREQUENCY, "Team_Pinky_Producation_House_backClick"); //
            checkNotNull(object, KEY_COMBO_FREQUENCY, "Team_Pinky_Producation_House_comboClick"); //

            checkNotNull(object, KEY_FORWARD_INTER_ALTERNATIVE, "Team_Pinky_Producation_House_forwardInterstitialF");//
            checkNotNull(object, KEY_BACKWARD_INTER_ALTERNATIVE, "Team_Pinky_Producation_House_backwardInterstitialB");//
            //admob
            checkNotNull(object, KEY_ADMOB_INTER_STATUS, "Team_Pinky_Producation_House_inter_Sts");//
            checkNotNull(object, KEY_ADMOB_BACK_STATUS, "Team_Pinky_Producation_House_back_Sts");//
            checkNotNull(object, KEY_ADMOB_NATIVE_STATUS, "Team_Pinky_Producation_House_native_Sts");
            checkNotNull(object, KEY_ADMOB_APPOPEN_STATUS, "Team_Pinky_Producation_House_appOpen_Sts");
            checkNotNull(object, KEY_ADMOB_BANNER_STATUS, "Team_Pinky_Producation_House_banner_Sts");
            checkNotNull(object, KEY_ADMOB_NATIVE, "Team_Pinky_Producation_House_nativeBigAd");
            checkNotNull(object, KEY_ADMOB_BANNER, "Team_Pinky_Producation_House_nativeBannerAd");
            //fB
            checkNotNull(object, KEY_FB_ADSHOW_STATUS, "Team_Pinky_Producation_House_fb_adshowStatus");
            checkNotNull(object, KEY_FB_BANNER_AD_ID_1, "Team_Pinky_Producation_House_fb_bannerId_1");
            checkNotNull(object, KEY_FB_BANNER_AD_ID_2, "Team_Pinky_Producation_House_fb_bannerId_2");
            checkNotNull(object, KEY_FB_BANNER_AD_ID_3, "Team_Pinky_Producation_House_fb_bannerId_3");
            checkNotNull(object, KEY_FB_BANNER_AD_ID_4, "Team_Pinky_Producation_House_fb_bannerId_4");
            checkNotNull(object, KEY_FB_BANNER_AD_ID_5, "Team_Pinky_Producation_House_fb_bannerId_5");
            checkNotNull(object, KEY_FB_BANNER_AD_ID_6, "Team_Pinky_Producation_House_fb_bannerId_6");
            checkNotNull(object, KEY_FB_INTERSTITIAL_AD_ID_1, "Team_Pinky_Producation_House_fb_interstitialId_1");
            checkNotNull(object, KEY_FB_INTERSTITIAL_AD_ID_2, "Team_Pinky_Producation_House_fb_interstitialId_2");
            checkNotNull(object, KEY_FB_INTERSTITIAL_AD_ID_3, "Team_Pinky_Producation_House_fb_interstitialId_3");
            checkNotNull(object, KEY_FB_INTERSTITIAL_AD_ID_4, "Team_Pinky_Producation_House_fb_interstitialId_4");
            checkNotNull(object, KEY_FB_INTERSTITIAL_AD_ID_5, "Team_Pinky_Producation_House_fb_interstitialId_5");
            checkNotNull(object, KEY_FB_INTERSTITIAL_AD_ID_6, "Team_Pinky_Producation_House_fb_interstitialId_6");
            checkNotNull(object, KEY_FB_NATIVE_AD_ID_1, "Team_Pinky_Producation_House_fb_nativeId_1");
            checkNotNull(object, KEY_FB_NATIVE_AD_ID_2, "Team_Pinky_Producation_House_fb_nativeId_2");
            checkNotNull(object, KEY_FB_NATIVE_AD_ID_3, "Team_Pinky_Producation_House_fb_nativeId_3");
            checkNotNull(object, KEY_FB_NATIVE_AD_ID_4, "Team_Pinky_Producation_House_fb_nativeId_4");
            checkNotNull(object, KEY_FB_NATIVE_AD_ID_5, "Team_Pinky_Producation_House_fb_nativeId_5");
            checkNotNull(object, KEY_FB_NATIVE_AD_ID_6, "Team_Pinky_Producation_House_fb_nativeId_6");

            checkNotNull(object, KEY_CUSTOM_ADSHOW_STATUS, "Team_Pinky_Producation_House_customAd_Sts"); //
            checkNotNull(object, KEY_CUSTOM_APPOPEN_AD, "Team_Pinky_Producation_House_customAppOpen_Sts"); //
            checkNotNull(object, KEY_CUSTOM_INTER_AD, "Team_Pinky_Producation_House_customInterstitial_Sts"); //
            checkNotNull(object, KEY_CUSTOM_BACK_AD, "Team_Pinky_Producation_House_customBack_Sts"); //
            checkNotNull(object, KEY_CUSTOM_NATIVE_AD, "Team_Pinky_Producation_House_customNativeBanner_Sts"); //
            checkNotNull(object, KEY_CUSTOM_CLOSE_AD, "Team_Pinky_Producation_House_Custom_close_ad"); //

            checkNotNull(object, KEY_FIX_COUNTRY, "Team_Pinky_Producation_House_launchCountryName");//
            checkNotNull(object, KEY_SWIPE_COUNTRY, "Team_Pinky_Producation_House_swipCountryName");//
            checkNotNull(object, KEY_SWIPE_MAIN, "Team_Pinky_Producation_House_swipMain"); //

            checkNotNull(object, KEY_ADMOB_APPOPEN_AD_ID, "Team_Pinky_Producation_House_appOpenAdId"); //
            checkNotNull(object, KEY_ADMOB_BANNER_AD_ID, "Team_Pinky_Producation_House_bannerAdId"); //
            checkNotNull(object, KEY_ADMOB_INTERSTITIAL_AD_ID, "Team_Pinky_Producation_House_interstitialAdId"); //
            checkNotNull(object, KEY_ADMOB_NATIVE_AD_ID, "Team_Pinky_Producation_House_nativeAdId"); //
            checkNotNull(object, KEY_NATIVE_SPACEBOX, "Team_Pinky_Producation_House_native_spacebox");
            checkNotNull(object, KEY_ONRESUMENATIVESHOW, "Team_Pinky_Producation_House_onResumeNativeShow");


            checkNotNull(object, KEY_NATIVE_BUTTON_COLOR, "Team_Pinky_Producation_House_ad_nativebutton");
            checkNotNull(object, KEY_NATIVE_TAG_COLOR, "Team_Pinky_Producation_House_ad_nativeTAG");
            checkNotNull(object, KEY_NATIVE_BG_COLOR, "Team_Pinky_Producation_House_ad_nativebg");
            checkNotNull(object, KEY_NATIVE_TITLE_COLOR, "Team_Pinky_Producation_House_ad_nativetitle");
            checkNotNull(object, KEY_NATIVE_DESC_COLOR, "Team_Pinky_Producation_House_ad_nativedescription");
            checkNotNull(object, KEY_NATIVE_SPACEBOX_COLOR, "Team_Pinky_Producation_House_native_spacebox_color");

            checkNotNull(object, KEY_STATUSSAVER, "Team_Pinky_Producation_House_statusSaver");
            checkNotNull(object, KEY_TERMSCREEN, "Team_Pinky_Producation_House_termScreen");
            checkNotNull(object, KEY_STARTSCREEN, "Team_Pinky_Producation_House_startScreen");
            checkNotNull(object, KEY_EXITSCREEN, "Team_Pinky_Producation_House_exitScreen");
            checkNotNull(object, KEY_PERMISSIONSCREEN, "Team_Pinky_Producation_House_permissionScreen");
            checkNotNull(object, KEY_VIDEOPLAYER, "Team_Pinky_Producation_House_videoPlayer");

            checkNotNull(object, KEY_QUREKABUTTONVIEW, "Team_Pinky_Producation_House_qurekabuttonview");
            checkNotNull(object, KEY_PREDCHAMPBUTTONVIEW, "Team_Pinky_Producation_House_predchampbuttonview");
            checkNotNull(object, KEY_MGLBUTTONVIEW, "Team_Pinky_Producation_House_mglbuttonview");
            checkNotNull(object, KEY_HEADERVIEW, "Team_Pinky_Producation_House_headerview");
            checkNotNull(object, KEY_QUREKALINK, "Team_Pinky_Producation_House_qurekaLink");
            checkNotNull(object, KEY_PREDCHAMPLINK, "Team_Pinky_Producation_House_predchampLink");
            checkNotNull(object, KEY_MGLLINK, "Team_Pinky_Producation_House_mglLink");
            checkNotNull(object, KEY_QUREKAIMAGELINK, "Team_Pinky_Producation_House_qurekaImageLink");
            checkNotNull(object, KEY_PREDCHAMPIMAGELINK, "Team_Pinky_Producation_House_predchampImageLink");
            checkNotNull(object, KEY_MGLIMAGELINK, "Team_Pinky_Producation_House_mglImageLink");
            checkNotNull(object, KEY_HEADERLINK, "Team_Pinky_Producation_House_HeaderLink");
            checkNotNull(object, KEY_HEADERIMAGELINK, "Team_Pinky_Producation_House_qurekaHeaderImagelink");

            checkNotNull(object, KEY_EXITNATIVE, "Team_Pinky_Producation_House_exitNative_sts");

            checkNotNull(object, KEY_NEW_COUNTRY, "Team_Pinky_Producation_House_countryScreen");
            checkNotNull(object, KEY_NEW_LANGUAGE, "Team_Pinky_Producation_House_app_language_Screen");
            checkNotNull(object, KEY_VIEWPAGER_INTER, "ViewPager_Inter_Counter");


            checkNotNull(object, KEY_AD_DIALOG, "Team_Pinky_Producation_House_admob_ad_dailog");
            checkNotNull(object, KEY_APP_OPEN_AD_SEC, "Team_Pinky_Producation_House_app_open_ad_sec");

            //notification
            checkNotNull(object, KEY_NOTIFICATION_STATUS, "Team_Pinky_Producation_House_notification_status");
            checkNotNull(object, KEY_NOTIFICATION_LINK, "Team_Pinky_Producation_House_notification_link");

            checkNotNull(object, KEY_CUSTOMAPPLINK, "Team_Pinky_Producation_House_custom_open_link_on_termscreen");
            checkNotNull(object, KEY_CUSTOMAPPBUTTON, "Team_Pinky_Producation_House_custom_open_link");

            //vc
            checkNotNull(object, KEY_VC_INCOMING_WELCOME, "videoCall_Incoming_Welcome");
            checkNotNull(object, KEY_VC_INCOMING_COUNTER, "videoCall_Incoming_Counter");
            checkNotNull(object, KEY_VC_INCOMING_LONGAPP, "videoCall_IsLongApp");
            checkNotNull(object, KEY_VC_ON_OFF, "videoCall_OnOff");

            //in_app
            checkNotNull(object, KEY_IN_APP_MODE, "InApp_Mode");
            checkNotNull(object, KEY_IN_APP_PRICE_GOLD, "InApp_Price_Gold");
            checkNotNull(object, KEY_IN_APP_PRICE_SILVER, "InApp_Price_Silver");
            checkNotNull(object, KEY_IN_APP_PRICE_BRONZE, "InApp_Price_Bronze");

            checkNotNull(object, KEY_IN_APP_UPI_ID, "InApp_Upi_Id");
            checkNotNull(object, KEY_IN_APP_UPI_NAME, "InApp_Upi_Name");
            checkNotNull(object, KEY_IN_APP_UPI_DESC, "InApp_Upi_Desc");

            //hd videos
            checkNotNull(object, KEY_HOT_VIDEO_1, "hotvideoLink1");
            checkNotNull(object, KEY_HOT_VIDEO_2, "hotvideoLink2");

            getCountClick();
            getCountClickBack();
            manageCombo();
        }
    }

    private void manageCombo() {
        if (getFbAdshowStatus().equals("1") && getAdmobInterStatus().equals("1")) {
            isComboActive = true;
        } else {
            isComboActive = false;
        }
    }

    private void checkNotNull(JsonObject object, String key, String jsonKey) {
        try {
            preferences.edit().putString(key, object.get(jsonKey).getAsString()).apply();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    //notification
    public String getKeyNotification_Status() {
        return preferences.getString(KEY_NOTIFICATION_STATUS, "0");
    }

    public String getKeyNotification_Link() {
        return preferences.getString(KEY_NOTIFICATION_LINK, "null");
    }

    public String getKeyOnresumenativeshow() {
        return preferences.getString(KEY_ONRESUMENATIVESHOW, "0");
    }

    public String getKeyCustomapplink() {
        return preferences.getString(KEY_CUSTOMAPPLINK, "0");
    }

    public String getKeyCustomappbutton() {
        return preferences.getString(KEY_CUSTOMAPPBUTTON, "0");
    }

    public String getKeyExitscreen() {
        return preferences.getString(KEY_EXITSCREEN, "0");
    }

    public String getKeyQurekabuttonview() {
        return preferences.getString(KEY_QUREKABUTTONVIEW, "0");
    }

    public String getKeyPredchampbuttonview() {
        return preferences.getString(KEY_PREDCHAMPBUTTONVIEW, "0");
    }

    public String getKeyMglbuttonview() {
        return preferences.getString(KEY_MGLBUTTONVIEW, "0");
    }

    public String getKeyHeaderview() {
        return preferences.getString(KEY_HEADERVIEW, "0");
    }

    public String getKeyQurekalink() {
        return preferences.getString(KEY_QUREKALINK, "0");
    }

    public String getKeyPredchamplink() {
        return preferences.getString(KEY_PREDCHAMPLINK, "0");
    }

    public String getKeyMgllink() {
        return preferences.getString(KEY_MGLLINK, "0");
    }

    public String getKeyQurekaimagelink() {
        return preferences.getString(KEY_QUREKAIMAGELINK, "0");
    }

    public String getKeyPredchampimagelink() {
        return preferences.getString(KEY_PREDCHAMPIMAGELINK, "0");
    }

    public String getKeyMglimagelink() {
        return preferences.getString(KEY_MGLIMAGELINK, "0");
    }

    public String getKeyHeaderlink() {
        return preferences.getString(KEY_HEADERLINK, "0");
    }

    public String getKeyHeaderimagelink() {
        return preferences.getString(KEY_HEADERIMAGELINK, "0");
    }

    public String getKeyTermscreen() {
        return preferences.getString(KEY_TERMSCREEN, "0");
    }

    public String getKeyStartscreen() {
        return preferences.getString(KEY_STARTSCREEN, "0");
    }

    public String getKeyPermissionscreen() {
        return preferences.getString(KEY_PERMISSIONSCREEN, "0");
    }

    public String getKeyVideoPlayer() {
        return preferences.getString(KEY_VIDEOPLAYER, "0");
    }

    public String getIncoming_Welcome() {
        return preferences.getString(KEY_VC_INCOMING_WELCOME, "0");
    }

    public String getKeyStatussaver() {
        return preferences.getString(KEY_STATUSSAVER, "0");
    }

    public String getForwardInter() {
        return preferences.getString(KEY_FORWARD_INTER_ALTERNATIVE, "0");
    }

    public String getAdmobBackInter() {
        return preferences.getString(KEY_BACKWARD_INTER_ALTERNATIVE, "0");
    }

    public String getAdmobNative() {
        return preferences.getString(KEY_ADMOB_NATIVE, "0");
    }

    public String getAdmobBanner() {
        return preferences.getString(KEY_ADMOB_BANNER, "0");
    }

    public String getAdmobNativeStatus() {
        return preferences.getString(KEY_ADMOB_NATIVE_STATUS, "0");
    }

    public String getAdmobInterStatus() {
        return preferences.getString(KEY_ADMOB_INTER_STATUS, "0");
    }

    public String getAdmobBackStatus() {
        return preferences.getString(KEY_ADMOB_BACK_STATUS, "0");
    }

    public String getAdmobBannerStatus() {
        return preferences.getString(KEY_ADMOB_BANNER_STATUS, "0");
    }

    public String getAdmobAppopenStatusStatus() {
        return preferences.getString(KEY_ADMOB_APPOPEN_STATUS, "0");
    }


    public String getAdDialog() {
        return preferences.getString(KEY_AD_DIALOG, "0");
    }

    public String getAppOpenADSec() {
        return preferences.getString(KEY_APP_OPEN_AD_SEC, "");
    }

    //fb
    public String getFbAdshowStatus() {
        return preferences.getString(KEY_FB_ADSHOW_STATUS, "0");
    }

    public String getFbBannerID() {


        if (fb_banner_index == 1) {
            fb_banner_index = fb_banner_index + 1;
            return preferences.getString(KEY_FB_BANNER_AD_ID_1, "0");
        } else if (fb_banner_index == 2) {
            fb_banner_index = fb_banner_index + 1;
            return preferences.getString(KEY_FB_BANNER_AD_ID_2, "0");
        } else if (fb_banner_index == 3) {
            fb_banner_index = fb_banner_index + 1;
            return preferences.getString(KEY_FB_BANNER_AD_ID_3, "0");
        } else if (fb_banner_index == 4) {
            fb_banner_index = fb_banner_index + 1;
            return preferences.getString(KEY_FB_BANNER_AD_ID_4, "0");
        } else if (fb_banner_index == 5) {
            fb_banner_index = fb_banner_index + 1;
            return preferences.getString(KEY_FB_BANNER_AD_ID_5, "0");
        } else if (fb_banner_index == 6) {
            fb_banner_index = 1;
            return preferences.getString(KEY_FB_BANNER_AD_ID_6, "0");
        } else {
            fb_banner_index = 1;
            return preferences.getString(KEY_FB_BANNER_AD_ID_1, "0");
        }
    }

    public String getFbNativeID() {

        if (fb_native_index == 1) {
            fb_native_index = fb_native_index + 1;
            return preferences.getString(KEY_FB_NATIVE_AD_ID_1, "0");
        } else if (fb_native_index == 2) {
            fb_native_index = fb_native_index + 1;
            return preferences.getString(KEY_FB_NATIVE_AD_ID_2, "0");
        } else if (fb_native_index == 3) {
            fb_native_index = fb_native_index + 1;
            return preferences.getString(KEY_FB_NATIVE_AD_ID_3, "0");
        } else if (fb_native_index == 4) {
            fb_native_index = fb_native_index + 1;
            return preferences.getString(KEY_FB_NATIVE_AD_ID_4, "0");
        } else if (fb_native_index == 5) {
            fb_native_index = fb_native_index + 1;
            return preferences.getString(KEY_FB_NATIVE_AD_ID_5, "0");
        } else if (fb_native_index == 6) {
            fb_native_index = 1;
            return preferences.getString(KEY_FB_NATIVE_AD_ID_6, "0");
        } else {
            fb_native_index = 1;
            return preferences.getString(KEY_FB_NATIVE_AD_ID_1, "0");
        }
    }

    public String getFbInterID() {

        if (fb_inter_index == 1) {
            fb_inter_index = fb_inter_index + 1;
            return preferences.getString(KEY_FB_INTERSTITIAL_AD_ID_1, "0");
        } else if (fb_inter_index == 2) {
            fb_inter_index = fb_inter_index + 1;
            return preferences.getString(KEY_FB_INTERSTITIAL_AD_ID_2, "0");
        } else if (fb_inter_index == 3) {
            fb_inter_index = fb_inter_index + 1;
            return preferences.getString(KEY_FB_INTERSTITIAL_AD_ID_3, "0");
        } else if (fb_inter_index == 4) {
            fb_inter_index = fb_inter_index + 1;
            return preferences.getString(KEY_FB_INTERSTITIAL_AD_ID_4, "0");
        } else if (fb_inter_index == 5) {
            fb_inter_index = fb_inter_index + 1;
            return preferences.getString(KEY_FB_INTERSTITIAL_AD_ID_5, "0");
        } else if (fb_inter_index == 6) {
            fb_inter_index = 1;
            return preferences.getString(KEY_FB_INTERSTITIAL_AD_ID_6, "0");
        } else {
            fb_inter_index = 1;
            return preferences.getString(KEY_FB_INTERSTITIAL_AD_ID_1, "0");
        }
    }

    //custom
    public String getCustomAdshowStatus() {
        return preferences.getString(KEY_CUSTOM_ADSHOW_STATUS, "0");
    }

    public String getCustomNative() {
        return preferences.getString(KEY_CUSTOM_NATIVE_AD, "0");
    }

    public String getCustomInter() {
        return preferences.getString(KEY_CUSTOM_INTER_AD, "0");
    }

    public String getCustomBack() {
        return preferences.getString(KEY_CUSTOM_BACK_AD, "0");
    }

    public String getCustomCloseAd() {
        return preferences.getString(KEY_CUSTOM_CLOSE_AD, "0");
    }

    /*For Other*/
    public String getPrivacyLink() {
        return preferences.getString(KEY_PRIVACY_LINK, "https/www.google.com/");
    }

    public Boolean getAppUpdateFlag() {
        return preferences.getString(KEY_UPDATE_APP, "0").equals("1");
    }

    public Integer getUpdateVersionCode() {
        return Integer.parseInt(preferences.getString(KEY_UPDATE_VERSION_CODE, "1"));
    }

    public String getInstallType() {
        return preferences.getString(KEY_INSTALL_TYPE, "1");
    }

    public void setInstallType() {
        if (getInstallType().equals("1"))
            preferences.edit().putString(KEY_INSTALL_TYPE, "2").apply();
    }

    /*For ads*/
    public Boolean getAdsFlag() {
        return preferences.getString(KEY_ADS_FLAG, "0").equals("1");
    }

    public void setAdsFlag(boolean b) {
        if (b) {
            preferences.edit().putString(KEY_ADS_FLAG, "1").apply();
        } else {
            preferences.edit().putString(KEY_ADS_FLAG, "0").apply();
        }

    }

    public static int app_count_click = -1;
    public static int app_back_count_click = -1;
    public static int app_combo_counter = 0;
    public static boolean isComboActive = false;

    public String getComboCount() {
        return preferences.getString(KEY_COMBO_FREQUENCY, "0");
    }

    public Integer getCountClick() {
        int value = 0;
        if (!preferences.getString(KEY_INTERSTITIAL_FREQUENCY, "0").isEmpty()) {
            value = Integer.parseInt(preferences.getString(KEY_INTERSTITIAL_FREQUENCY, "0"));
        }
        app_count_click = value;
        return value;
    }

    public Integer getCountClickBack() {
        int value = 0;
        if (!preferences.getString(KEY_INTERSTITIAL_BACK_FREQUENCY, "0").isEmpty()) {
            value = Integer.parseInt(preferences.getString(KEY_INTERSTITIAL_BACK_FREQUENCY, "0"));
        }
        app_back_count_click = value;
        return value;
    }

    public String getAdmobAppOpenID() {
        return preferences.getString(KEY_ADMOB_APPOPEN_AD_ID, "0");
    }

    public String getAdmobBannerID() {
        return preferences.getString(KEY_ADMOB_BANNER_AD_ID, "");
    }

    public String getAdmobInterstitialID() {
        return preferences.getString(KEY_ADMOB_INTERSTITIAL_AD_ID, "");
    }

    public String getAdmobNativeID() {
        return preferences.getString(KEY_ADMOB_NATIVE_AD_ID, "");
    }

    public String getNativeBtnColor() {
        return preferences.getString(KEY_NATIVE_BUTTON_COLOR, "#ff1744");
    }

    public String getKeyNativeTagColor() {
        return preferences.getString(KEY_NATIVE_TAG_COLOR, "#ff1744");
    }

    public String getNativeBgColor() {
        return preferences.getString(KEY_NATIVE_BG_COLOR, "#FAEBD7");
    }

    public String getNativeTitleColor() {
        return preferences.getString(KEY_NATIVE_TITLE_COLOR, "#000000");
    }

    public String getNativeDecColor() {
        return preferences.getString(KEY_NATIVE_DESC_COLOR, "#000000");
    }

    public String getNativeSpaceboxColor() {
        return preferences.getString(KEY_NATIVE_SPACEBOX_COLOR, "#FFFFFF");
    }

    public String getNativeSpacebox() {
        return preferences.getString(KEY_NATIVE_SPACEBOX, "0");
    }

    public Boolean getFixCountry() {
        return preferences.getString(KEY_FIX_COUNTRY, "0").equals("1");
    }

    public String getSwipeCountry() {
        return preferences.getString(KEY_SWIPE_COUNTRY, "0");
    }

    public String getSwipeMain() {
        return preferences.getString(KEY_SWIPE_MAIN, "0");
    }

    public String getCountryStatus() {
        return preferences.getString(KEY_NEW_COUNTRY, "0");
    }

    public String getKeyExitnative_Status() {
        return preferences.getString(KEY_EXITNATIVE, "0");
    }

    public String getLanguageStatus() {
        return preferences.getString(KEY_NEW_LANGUAGE, "0");
    }


    public String getKeyViewpagerInter() {
        return preferences.getString(KEY_VIEWPAGER_INTER, "3");
    }


    public static void show_anims_3btn(final Activity activity, RelativeLayout rl_qureka_container, RelativeLayout rl_pred_container, RelativeLayout rl_mgl_container) {
        if (new fsdfdsf445(activity).getKeyQurekabuttonview().equals("1")) {
            rl_qureka_container.setVisibility(View.VISIBLE);
            View view = activity.getLayoutInflater().inflate(R.layout.sfds1fds1f, null);
            rl_qureka_container.addView(view);
            ImageView iv_anim = (ImageView) view.findViewById(R.id.iv_anim);
            Glide.with(activity).load(new fsdfdsf445(activity).getKeyQurekaimagelink()).centerInside().into(iv_anim);
            iv_anim.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    isAppLive(activity, new fsdfdsf445(activity).getKeyQurekalink());

                }
            });
        } else {
            rl_qureka_container.setVisibility(View.GONE);
        }
        if (new fsdfdsf445(activity).getKeyPredchampbuttonview().equals("1")) {
            rl_pred_container.setVisibility(View.VISIBLE);
            View view = activity.getLayoutInflater().inflate(R.layout.sfds1fds1f, null);
            rl_pred_container.addView(view);
            ImageView iv_anim = (ImageView) view.findViewById(R.id.iv_anim);
            Glide.with(activity).load(new fsdfdsf445(activity).getKeyPredchampimagelink()).centerInside().into(iv_anim);
            iv_anim.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    isAppLive(activity, new fsdfdsf445(activity).getKeyPredchamplink());
                }
            });
        } else {
            rl_pred_container.setVisibility(View.GONE);
        }
        if (new fsdfdsf445(activity).getKeyMglbuttonview().equals("1")) {
            rl_mgl_container.setVisibility(View.VISIBLE);
            View view = activity.getLayoutInflater().inflate(R.layout.sfds1fds1f, null);
            rl_mgl_container.addView(view);
            ImageView iv_anim = (ImageView) view.findViewById(R.id.iv_anim);
            Glide.with(activity).load(new fsdfdsf445(activity).getKeyMglimagelink()).centerInside().into(iv_anim);
            iv_anim.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    isAppLive(activity, new fsdfdsf445(activity).getKeyMgllink());
                }
            });
        } else {
            rl_mgl_container.setVisibility(View.GONE);
        }
    }

    public static void show_Gift(final Activity activity, RelativeLayout rl_anim_container) {
        if (new fsdfdsf445(activity).getKeyHeaderview().equals("1")) {
            rl_anim_container.setVisibility(View.VISIBLE);
            rl_anim_container.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    isAppLive(activity, new fsdfdsf445(activity).getKeyHeaderlink());
                }
            });
        } else {
            rl_anim_container.setVisibility(View.GONE);
        }
    }

    public static void play_quiz(final Activity activity) {
        isAppLive(activity, new fsdfdsf445(activity).getKeyHeaderlink());
    }

    public static void show_anim_header(final Activity activity, RelativeLayout rl_anim_container) {
        if (new fsdfdsf445(activity).getKeyHeaderview().equals("1")) {
            rl_anim_container.setVisibility(View.VISIBLE);
            View view = activity.getLayoutInflater().inflate(R.layout.fs4f5df, null);
            rl_anim_container.addView(view);
            ImageView iv_anim = (ImageView) view.findViewById(R.id.iv_anim);
            Glide.with(activity).load(new fsdfdsf445(activity).getKeyHeaderimagelink()).centerInside().into(iv_anim);
            iv_anim.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    isAppLive(activity, new fsdfdsf445(activity).getKeyHeaderlink());
                }
            });
        } else {
            rl_anim_container.setVisibility(View.GONE);
        }
    }

    public static void openChromeCustomTabUrl(final Context context, String webUrl) {
        try {
            if (isAppInstalled1(context, "com.android.chrome")) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                int coolorInt = Color.parseColor("#FFFFFF");
                builder.setToolbarColor(coolorInt);
                builder.setStartAnimations(context, R.anim.sdk_slide_in_right, R.anim.sdk_slide_out_left);
                builder.setExitAnimations(context, R.anim.sdk_slide_in_left, R.anim.sdk_slide_out_right);
                CustomTabsIntent customTabsIntent = builder.build();
                customTabsIntent.intent.setPackage("com.android.chrome");
                customTabsIntent.intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                customTabsIntent.launchUrl(context, Uri.parse(webUrl));
            } else {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                int coolorInt = Color.parseColor("#FFFFFF");
                builder.setToolbarColor(coolorInt);
                builder.setStartAnimations(context, R.anim.sdk_slide_in_right, R.anim.sdk_slide_out_left);
                builder.setExitAnimations(context, R.anim.sdk_slide_in_left, R.anim.sdk_slide_out_right);
                CustomTabsIntent customTabsIntent = builder.build();
                customTabsIntent.intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                customTabsIntent.launchUrl(context, Uri.parse(webUrl));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static boolean isAppInstalled1(Context context, String packageName) {
        try {
            context.getPackageManager().getApplicationInfo(packageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public static boolean isAppLive(Context context, String keyHeaderlink) {
        if (keyHeaderlink.contains("play.google")) {
            new AsyncTask<Void, Boolean, Boolean>() {
                private String[] str;

                @Override
                protected Boolean doInBackground(Void... voids) {
                    boolean b = isAppLiveOnPlayStore(keyHeaderlink);
                    return b;
                }

                @Override
                protected void onPostExecute(Boolean aBoolean) {
                    super.onPostExecute(aBoolean);
                    if (aBoolean) {
                        str = keyHeaderlink.split("=");
                        Uri uri = Uri.parse("market://details?id=" + str[1]);
                        Intent myAppLinkToMarket = new Intent(Intent.ACTION_VIEW, uri);
                        try {
                            myAppLinkToMarket.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            context.startActivity(myAppLinkToMarket);
                        } catch (ActivityNotFoundException e) {
                            Toast.makeText(context, "Please Check Internet Connection", Toast.LENGTH_LONG).show();
                        }
                    } else {
                        openChromeCustomTabUrl(context, keyHeaderlink);
                    }

                }
            }.execute();
        } else {
            openChromeCustomTabUrl(context, keyHeaderlink);
        }
        return false;
    }

    public static boolean isAppLiveOnPlayStore(String appid) {
        try {
            HttpURLConnection conn = (HttpURLConnection) (new URL(appid))
                    .openConnection();
            conn.setUseCaches(false);
            conn.connect();
            int status = conn.getResponseCode();
            conn.disconnect();
            return status == 200;
        } catch (Exception e) {
//            Log.e("isAppLiveOnPlayStore", e.toString());
        }
        return false;
    }


    //video call
    public void set_IncomingWelcome_Fix() {
        preferences.edit().putString(KEY_VC_INCOMING_WELCOME, "1").apply();
    }

    public String getIncoming_Counter() {
        return preferences.getString(KEY_VC_INCOMING_COUNTER, "0");
    }

    public String getIsLongApp() {
        return preferences.getString(KEY_VC_INCOMING_LONGAPP, "0");
    }

    public String getVideo_call() {
        return preferences.getString(KEY_VC_ON_OFF, "0");
    }


    //in-app
    public String getKeyInAppMode() {
        return preferences.getString(KEY_IN_APP_MODE, "0");
    }

    public String getKeyInAppPriceGold() {
        return preferences.getString(KEY_IN_APP_PRICE_GOLD, "0");
    }

    public String getKeyInAppPriceSilver() {
        return preferences.getString(KEY_IN_APP_PRICE_SILVER, "0");
    }

    public String getKeyInAppPriceBronze() {
        return preferences.getString(KEY_IN_APP_PRICE_BRONZE, "0");
    }

    public String getKeyInAppUpiId() {
        return preferences.getString(KEY_IN_APP_UPI_ID, "0");
    }

    public String getKeyInAppUpiName() {
        return preferences.getString(KEY_IN_APP_UPI_NAME, "0");
    }

    public String getKeyInAppUpiDesc() {
        return preferences.getString(KEY_IN_APP_UPI_DESC, "0");
    }


    //hot videos
    public String getKeyHotVideo1() {
        return preferences.getString(KEY_HOT_VIDEO_1, "0");
    }

    public String getKeyHotVideo2() {
        return preferences.getString(KEY_HOT_VIDEO_2, "0");
    }


    public void redeemGoldPlan() {
        preferences.edit().putString(KEY_VC_INCOMING_WELCOME, "1").apply();
        preferences.edit().putString(KEY_VC_INCOMING_LONGAPP, "0").apply();

        preferences.edit().putString(KEY_ADMOB_APPOPEN_STATUS, "0").apply();
        preferences.edit().putString(KEY_ADMOB_INTER_STATUS, "0").apply();
        preferences.edit().putString(KEY_ADMOB_BACK_STATUS, "0").apply();
        preferences.edit().putString(KEY_ADMOB_NATIVE_STATUS, "0").apply();
        preferences.edit().putString(KEY_ADMOB_BANNER_STATUS, "0").apply();
        preferences.edit().putString(KEY_FB_ADSHOW_STATUS, "0").apply();
        preferences.edit().putString(KEY_CUSTOM_ADSHOW_STATUS, "0").apply();
    }

    public void redeemSilverPlan() {
        preferences.edit().putString(KEY_ADMOB_APPOPEN_STATUS, "0").apply();
        preferences.edit().putString(KEY_ADMOB_INTER_STATUS, "0").apply();
        preferences.edit().putString(KEY_ADMOB_BACK_STATUS, "0").apply();
        preferences.edit().putString(KEY_ADMOB_NATIVE_STATUS, "0").apply();
        preferences.edit().putString(KEY_ADMOB_BANNER_STATUS, "0").apply();
        preferences.edit().putString(KEY_FB_ADSHOW_STATUS, "0").apply();
        preferences.edit().putString(KEY_CUSTOM_ADSHOW_STATUS, "0").apply();
    }

    public void redeemBronzePlan() {

    }
}
