package com.ads.sdk;

import static com.ads.sdk.g5f6g.fs1df2.fsd1f1.getGeoApiService;
import static com.ads.sdk.sfsf45f4.fsdfdsf445.Glob_Notification_Minutes;
import static com.ads.sdk.sfsf45f4.fsdfdsf445.app_back_count_click;
import static com.ads.sdk.sfsf45f4.fsdfdsf445.app_count_click;
import static com.ads.sdk.sfsf45f4.fsdfdsf445.notificationDatumList;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.ads.sdk.sdfd4f5df.addatacustom;
import com.ads.sdk.g5f6g.fdsf6.fsedf1;
import com.ads.sdk.g5f6g.fdsf6.sfdds6f456df;
import com.ads.sdk.g5f6g.fs1df2.f1df2;
import com.ads.sdk.g5f6g.fs1df2.jghkgj;
import com.ads.sdk.g5f6g.model.IpSettings;
import com.ads.sdk.g5f6g.model.LocArray;
import com.ads.sdk.g5f6g.model.NetSettings;
import com.ads.sdk.fsadf5.sfffdf44f;
import com.ads.sdk.fdsf12.sadfdf23d14;
import com.ads.sdk.fdsf12.defd5f5df4;
import com.ads.sdk.sfsf45f4.fdfdsff44;
import com.ads.sdk.sfsf45f4.fsdfdsf445;
import com.ads.sdk.fgd1fg52g.g1fg1;
import com.ads.sdk.f1df1.fsd1f;
import com.ads.sdk.f1df1.fd1dsf1;
import com.ads.sdk.f1df1.fd2f2f2;
import com.ads.sdk.f1df1.model.ModelNotify;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public abstract class fggfg extends AppCompatActivity {
    private static final String TAG = fggfg.class.getSimpleName();

    private static final int REQUEST_CODE_POST_NOTIFICATION = 30;
    private static int totalAdInc;
    private static Random r;
    private JsonArray jsonArray;


    //verify
    String iType = "";
    public boolean excludeChecker = false;
    public boolean includeChecker = false;
    private int globalVerionCode = 1;


    public abstract void onComplete();

    public void loadSplash(Boolean debug, int versionCode) {
        fdfdsff44.DEBUG = debug;
        globalVerionCode = versionCode;
        if (!fdfdsff44.isNetworkAvailable(fggfg.this)) {

            new AlertDialog.Builder(fggfg.this)
                    .setTitle("No Internet")
                    .setCancelable(false)
                    .setMessage("Please check your internet connection and try again.")
                    .setPositiveButton("Try Again", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            loadSplash(debug, versionCode);
                        }
                    }).setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int i) {
                            dialog.dismiss();
                            finishAffinity();
                        }
                    }).setIcon(android.R.drawable.ic_dialog_alert).show();
        } else {

            //check Safety..
            sfdds6f456df sInterface = fsedf1.getClient(getApplicationContext(), getApplicationContext().getPackageName()).create(sfdds6f456df.class);
            Call<NetSettings> callSetting = sInterface.doCall();
            callSetting.enqueue(new Callback<NetSettings>() {
                @Override
                public void onResponse(Call<NetSettings> call, Response<NetSettings> response) {
                    IpSettings app_settings = response.body().getSettings();

                    iType = app_settings.getLocType();
                    verifyUser(app_settings.getLocArray());
                }

                @Override
                public void onFailure(Call<NetSettings> call, Throwable t) {
                    safeCalling();
                }
            });


        }
    }

    private void verifyUser(List<LocArray> iArray) {
        jghkgj apiService = getGeoApiService(getApplicationContext(), getApplicationContext().getPackageName());
        apiService.getLocation().enqueue(new retrofit2.Callback<f1df2>() {
            @Override
            public void onResponse(Call<f1df2> call, Response<f1df2> response) {
                String uCountryCode = response.body().getCountryCode();
                String uStateCode = response.body().getRegion();
                String uCityName = response.body().getCity();


                switch (iType) {
                    case "include":
                        for (int k = 0; k < iArray.size(); k++) {
                            if (uCountryCode.equalsIgnoreCase(iArray.get(k).getCountryCode()) ||
                                    uStateCode.equalsIgnoreCase(iArray.get(k).getStateCode()) ||
                                    uCityName.equalsIgnoreCase(iArray.get(k).getCityName())) {
                                k = 999;
                                includeChecker = true;
                            }
                        }

                        if (includeChecker) {
                            safeCalling();
                        } else {
                            calling();
                        }
                        break;

                    case "exclude":
                        for (int j = 0; j < iArray.size(); j++) {
                            if (uCountryCode.equalsIgnoreCase(iArray.get(j).getCountryCode()) ||
                                    uStateCode.equalsIgnoreCase(iArray.get(j).getStateCode()) ||
                                    uCityName.equalsIgnoreCase(iArray.get(j).getCityName())) {
                                j = 999;
                                excludeChecker = true;
                            }
                        }

                        if (excludeChecker) {
                            safeCalling();
                        } else {
                            calling();
                        }
                        break;

                    default:
                        safeCalling();
                        break;
                }
            }

            @Override
            public void onFailure(Call<f1df2> call, Throwable t) {
                safeCalling();
            }
        });
    }

    private void calling() {
        //call Normal..
        defd5f5df4 defd5f5df4 = sadfdf23d14.getClient(getApplicationContext(), getApplicationContext().getPackageName()).create(defd5f5df4.class);
        Call<JsonObject> call = defd5f5df4.doCall();
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                new fsdfdsf445(fggfg.this).setInstallType();
                if (response.body() != null && response.body().get("status").getAsBoolean()) {
                    JsonObject app_seeting = response.body().get("data").getAsJsonObject();
                    new fsdfdsf445(fggfg.this).setAdsResponse(app_seeting);
                    jsonArray = app_seeting.getAsJsonArray("Team_Pinky_Producation_House_customAdData");
                    getSplashMoreAppData(jsonArray, fggfg.this);
                }

                if (new fsdfdsf445(fggfg.this).getAppUpdateFlag() && new fsdfdsf445(fggfg.this).getUpdateVersionCode() > globalVerionCode) {
                    new AlertDialog.Builder(fggfg.this)
                            .setTitle("New Version Available")
                            .setCancelable(false)
                            .setMessage("It looks like you have an old version of the app, Please update the app and enjoy our latest features.")
                            .setPositiveButton("Update now", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                    fdfdsff44.rateUs(fggfg.this);
                                    finishAffinity();
                                }
                            }).setNegativeButton("Later", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                    checkVpnEnable();
                                }
                            }).show();
                } else {
                    checkVpnEnable();
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
//                    Log.e("@@TAG", "onFailure: " + t.getMessage());
                new fsdfdsf445(fggfg.this).setInstallType();
                checkVpnEnable();
            }
        });
    }

    private void safeCalling() {
        //call Normal..
        defd5f5df4 defd5f5df4 = sadfdf23d14.getClient(getApplicationContext(), getApplicationContext().getPackageName()).create(defd5f5df4.class);
        Call<JsonObject> call = defd5f5df4.doSafe();
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                new fsdfdsf445(fggfg.this).setInstallType();
                if (response.body() != null && response.body().get("status").getAsBoolean()) {
                    JsonObject app_seeting = response.body().get("data").getAsJsonObject();
                    new fsdfdsf445(fggfg.this).setAdsResponse(app_seeting);
                    jsonArray = app_seeting.getAsJsonArray("Team_Pinky_Producation_House_customAdData");
                    getSplashMoreAppData(jsonArray, fggfg.this);
                }

                if (new fsdfdsf445(fggfg.this).getAppUpdateFlag() && new fsdfdsf445(fggfg.this).getUpdateVersionCode() > globalVerionCode) {
                    new AlertDialog.Builder(fggfg.this)
                            .setTitle("New Version Available")
                            .setCancelable(false)
                            .setMessage("It looks like you have an old version of the app, Please update the app and enjoy our latest features.")
                            .setPositiveButton("Update now", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                    fdfdsff44.rateUs(fggfg.this);
                                    finishAffinity();
                                }
                            }).setNegativeButton("Later", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                    checkVpnEnable();
                                }
                            }).show();
                } else {
                    checkVpnEnable();
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
//                    Log.e("@@TAG", "onFailure: " + t.getMessage());
                new fsdfdsf445(fggfg.this).setInstallType();
                checkVpnEnable();
            }
        });
    }

    public static ArrayList<addatacustom> customAdData = new ArrayList<>();

    public void getSplashMoreAppData(JsonArray response, Activity activity) {
        if (customAdData != null) {
            customAdData.clear();
        }
        if (response != null) {
            for (int i = 0; i < response.size(); i++) {
                JsonObject object = (JsonObject) response.get(i);
                customAdData.add(new addatacustom(object.get("Team_Pinky_Producation_House_cust_id").getAsString(), object.get("Team_Pinky_Producation_House_cust_name").getAsString(), object.get("Team_Pinky_Producation_House_cust_url").getAsString(), object.get("Team_Pinky_Producation_House_cust_appopen_image").getAsString(), object.get("Team_Pinky_Producation_House_cust_interstitial_image").getAsString(), object.get("Team_Pinky_Producation_House_cust_small_native_image").getAsString(), object.get("Team_Pinky_Producation_House_cust_native_image").getAsString()));
            }
            //notification
            if (new fsdfdsf445(fggfg.this).getKeyNotification_Status().equals("1")) {
//                Log.e("@@notify", "notification mode >>> ACTIVE");

                //get notification data
                fsd1f fsd1f = fd2f2f2.getRetrofitInstance(getApplicationContext()).create(fsd1f.class);
                Call<ModelNotify> call = fsd1f.getNotifyData();
                call.enqueue(new Callback<ModelNotify>() {
                    @Override
                    public void onResponse(Call<ModelNotify> call, Response<ModelNotify> response) {
                        if (response.isSuccessful()) {
                            ModelNotify notification = response.body();
//                            Log.e("@@notify", "time: " + notification.getNotificationTime());
                            Glob_Notification_Minutes = notification.getNotificationTime();
                            if (notification.getNotificationData().size() > 0) {
                                notificationDatumList = notification.getNotificationData();
//                                Log.e("@@notify", "data added successful!");


                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (!fd1dsf1.IS_ACTIVITY_RUNNING) {
                                            try {
                                                startService();
                                            } catch (Exception e) {
//                                                Log.e("@@notify", "error1: " + e.getMessage());
                                            }
                                        }


                                    }
                                }, 1000);

                            } else {
//                                Log.e("@@notify", "error: data 0");
                            }
                        } else {
//                            Log.e("@@notify", "onFailure: " + "response failed!");
                        }
                    }

                    @Override
                    public void onFailure(Call<ModelNotify> call, Throwable t) {
//                        Log.e("@@notify", "onFailure: " + t.getMessage());
                    }
                });

            } else {
//                Log.e("@@notify", "notification mode >>> DISABLE");
            }
        }
    }

    public void startService() {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            Intent pushIntent = new Intent(this, fd1dsf1.class);
            startForegroundService(pushIntent);
        } else {
            Intent pushIntent = new Intent(this, fd1dsf1.class);
            startService(pushIntent);
        }

    }

    public static addatacustom getMyCustomAd() {
        addatacustom customAdModel = null;
        if (totalAdInc == customAdData.size()) {
            totalAdInc = 0;
        }
        customAdModel = customAdData.get(totalAdInc);
        totalAdInc++;
        return customAdModel;
    }

    public static int getRandomNum() {
        int size = customAdData.size();
        int min = 0;
        int max = size - 1;
        r = new Random();
        int output = r.nextInt((max - min) + 1) + min;
        return output;
    }

    private void checkVpnEnable() {
        loadAd();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == REQUEST_CODE_POST_NOTIFICATION) {
            loadAd();
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CODE_POST_NOTIFICATION) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) == PackageManager.PERMISSION_GRANTED) {
                loadAd();
            } else {
                new AlertDialog.Builder(fggfg.this)
                        .setTitle("Permission settings")
                        .setCancelable(false)
                        .setMessage("Notification permission is not enabled. Do you want to go to settings menu?")
                        .setPositiveButton("NetSettings", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.parse("package:" + getPackageName()));
                                try {
                                    startActivityForResult(intent, REQUEST_CODE_POST_NOTIFICATION);
                                } catch (ActivityNotFoundException e) {
                                    e.printStackTrace();
                                    loadAd();
                                }
                            }
                        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                loadAd();
                            }
                        }).show();
            }
        }
    }

    private void loadAd() {
        if (fdfdsff44.isNetworkAvailable(fggfg.this) && new fsdfdsf445(fggfg.this).getAdsFlag()) {
            if (new fsdfdsf445(fggfg.this).getAdmobInterStatus().equals("1")) {
                if (new fsdfdsf445(fggfg.this).getCountClick() != 0) {
                    app_count_click = app_count_click + 1;
                }
            } else if (new fsdfdsf445(fggfg.this).getCustomAdshowStatus().equals("1")) {
                if (new fsdfdsf445(fggfg.this).getCountClick() != 0) {
                    app_count_click = app_count_click + 1;
                }
            }

            if (new fsdfdsf445(fggfg.this).getAdmobInterStatus().equals("1")) {
                if (new fsdfdsf445(fggfg.this).getCountClickBack() != 0) {
                    app_back_count_click = app_back_count_click + 1;
                }
            } else if (new fsdfdsf445(fggfg.this).getCustomAdshowStatus().equals("1")) {
                if (new fsdfdsf445(fggfg.this).getCountClickBack() != 0) {
                    app_back_count_click = app_back_count_click + 1;
                }
            }
            gfgf.getManager().preLoadAds(fggfg.this);
            if (!new fsdfdsf445(fggfg.this).getAdmobAppOpenID().isEmpty() && new fsdfdsf445(fggfg.this).getAdmobAppopenStatusStatus().equals("1")) {
                new sfffdf44f().loadSplashAd(fggfg.this, new g1fg1() {
                    @Override
                    public void onShowAdComplete() {
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                onComplete();
                            }
                        }, 50);
                    }
                });
            } else {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        onComplete();
                    }
                }, 50);
            }
        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    onComplete();
                }
            }, 50);
        }
    }

    @Override
    public void onBackPressed() {
    }
}
