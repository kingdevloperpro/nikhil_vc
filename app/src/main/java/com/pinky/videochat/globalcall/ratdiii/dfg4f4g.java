package com.pinky.videochat.globalcall.ratdiii;

import static com.pinky.videochat.globalcall.pritam.gfd54g45fg.native_ShowAds;
import static com.pinky.videochat.globalcall.aakhdi.dfsdfdf45545.connectInComing;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.ads.sdk.fdgfiiii;
import com.ads.sdk.sfsf45f4.fsdfdsf445;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.DexterError;
import com.karumi.dexter.listener.PermissionRequestErrorListener;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.pinky.videochat.globalcall.R;
import com.pinky.videochat.globalcall.fsdf54;
import com.pinky.videochat.globalcall.konkhajur.fd4f4f4;
import com.pinky.videochat.globalcall.aakhdi.f4sdf48sd5f4;

import java.util.List;


public class dfg4f4g extends AppCompatActivity {

    public static boolean isVectorShow = true;
    private AppCompatButton welcome;

    //incoming call
    public static int incoming_counter = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ggedgrg);
        
        fsdf54.changeVectorStatus(this);

        if (new f4sdf48sd5f4().isTerms() && new fsdfdsf445(dfg4f4g.this).getKeyTermscreen().equals("1")) {
            new f4sdf48sd5f4().stopTerms();
            fdgfiiii.ShowInterstitialAdsOnCreate(this);
        }


        if (new fsdfdsf445(this).getKeyOnresumenativeshow().equals("0")) {
            native_ShowAds(this, findViewById(R.id.native_container), 1);
        }


        welcome = findViewById(R.id.welcome);


        welcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requestPR();
            }
        });

    }

    private void goNextScreen() {
        if (new fsdfdsf445(dfg4f4g.this).getIncoming_Welcome().equalsIgnoreCase("1") && incoming_counter == -1) {
            connectInComing(dfg4f4g.this);
        } else {
            if (new fsdfdsf445(dfg4f4g.this).getIncoming_Counter().equalsIgnoreCase(String.valueOf(incoming_counter))) {
                connectInComing(dfg4f4g.this);
            } else {
                if (new fsdfdsf445(dfg4f4g.this).getIsLongApp().equalsIgnoreCase("1")) {
                    startActivity(new Intent(dfg4f4g.this, gfv4dsfg4gf45.class));
                } else {
                    startActivity(new Intent(dfg4f4g.this, fd4f4f4.class));
                }
            }
        }
    }


    @Override
    public void onBackPressed() {
        if (new fsdfdsf445(this).getKeyExitscreen().equals("1")) {
            startActivity(new Intent(dfg4f4g.this, j4j4g5.class).putExtra("issplash", 1));
        } else {
            tagAgainToExit();
        }
    }


    boolean doubleBackToExitPressedOnce = false;

    private void tagAgainToExit() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }


    private void requestPR() {

        Dexter.withActivity(dfg4f4g.this).withPermissions(Manifest.permission.CAMERA).withListener(new MultiplePermissionsListener() {
            @Override
            public void onPermissionsChecked(MultiplePermissionsReport report) {
                if (report.areAllPermissionsGranted()) {
                    goNextScreen();
                } else if (report.isAnyPermissionPermanentlyDenied()) {
                    showSettingsDialog();
                }
            }

            @Override
            public void onPermissionRationaleShouldBeShown(List permissions, PermissionToken token) {
                token.continuePermissionRequest();
            }
        }).withErrorListener(new PermissionRequestErrorListener() {
            @Override
            public void onError(DexterError error) {
                Toast.makeText(getApplicationContext(), "Error" + error.toString(), Toast.LENGTH_SHORT).show();
            }
        }).onSameThread().check();

    }

    private void showSettingsDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(dfg4f4g.this, R.style.Theme_Dllg);
        builder.setTitle("Need Permissions");
        builder.setMessage("This App needs CAMERA Permission to Use Video Call Feature. You can Grant them in App NetSettings.");
        builder.setPositiveButton("GOTO SETTINGS", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                openSettings();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.show();
    }

    private void openSettings() {
        Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        Uri uri = Uri.fromParts("package", getPackageName(), null);
        intent.setData(uri);
        startActivityForResult(intent, 101);
    }
}