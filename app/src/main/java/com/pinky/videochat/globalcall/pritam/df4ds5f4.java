package com.pinky.videochat.globalcall.pritam;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import com.ads.sdk.sfsf45f4.fsdfdsf445;
import com.ads.sdk.fggfg;
import com.pinky.videochat.globalcall.BuildConfig;
import com.pinky.videochat.globalcall.R;
import com.pinky.videochat.globalcall.fsffvcc;
import com.pinky.videochat.globalcall.aakhdi.f4sdf48sd5f4;
import com.pinky.videochat.globalcall.ratdiii.dfg4f4g;


public class df4ds5f4 extends fggfg {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ggfgfgsss);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (checkSelfPermission(Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(new String[]{Manifest.permission.POST_NOTIFICATIONS}, 101);
                return;
            } else {
                loadSplash(BuildConfig.DEBUG, BuildConfig.VERSION_CODE);
            }
        } else {
            loadSplash(BuildConfig.DEBUG, BuildConfig.VERSION_CODE);
        }
    }


    @Override
    public void onComplete() {

        manageVip();

        if (new fsdfdsf445(this).getKeyTermscreen().equals("1")) {
            if (new f4sdf48sd5f4().isTerms()) {
                startActivity(new Intent(df4ds5f4.this, fsffvcc.class).putExtra("issplash", 1));
            } else {
                startActivity(new Intent(df4ds5f4.this, dfg4f4g.class).putExtra("issplash", 1));
            }
        } else {
            startActivity(new Intent(df4ds5f4.this, dfg4f4g.class).putExtra("issplash", 1));
        }
        finish();

    }

    private void manageVip() {

        if (new f4sdf48sd5f4().getVipType().equals("in_app_gold")) {
            new fsdfdsf445(this).redeemGoldPlan();
//            new fsdfdsf445(this).setAdsFlag(false);
//            new fsdfdsf445(this).set_IncomingWelcome_Fix();
        } else if (new f4sdf48sd5f4().getVipType().equals("in_app_silver")) {
            new fsdfdsf445(this).redeemSilverPlan();
        } else if (new f4sdf48sd5f4().getVipType().equals("in_app_bronze")) {
            new fsdfdsf445(this).redeemBronzePlan();
            SharedPreferences sh = getSharedPreferences("RandomSF", MODE_APPEND);
            int vc_count = sh.getInt("KEY_RAND", 0);
            if (vc_count == 7) {
                new f4sdf48sd5f4().setVipType("null");
                Toast.makeText(this, "Bronze Premium Expire! You reached your call limit.", Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    public void onBackPressed() {
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            switch (requestCode) {
                case 101: {
                    if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                        loadSplash(BuildConfig.DEBUG, BuildConfig.VERSION_CODE);
                    } else {
                        loadSplash(BuildConfig.DEBUG, BuildConfig.VERSION_CODE);
                    }
                    return;
                }
            }
        }
    }


}
