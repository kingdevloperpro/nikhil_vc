package com.pinky.videochat.globalcall.ratdiii;

import static com.pinky.videochat.globalcall.pritam.gfd54g45fg.native_ShowAds;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ads.sdk.fdgfiiii;
import com.ads.sdk.sfsf45f4.fsdfdsf445;
import com.pinky.videochat.globalcall.R;


public class j4j4g5 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dfgefgdfg);


        fsdfdsf445.show_Gift(this, (RelativeLayout) findViewById(R.id.rl_anim_header));

        fdgfiiii.ShowInterstitialAdsOnCreate(this);
        if (new fsdfdsf445(this).getKeyOnresumenativeshow().equals("0")) {
            native_ShowAds(this, findViewById(R.id.native_container), 1);
        }

        findViewById(R.id.llYes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });

        findViewById(R.id.llNo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    @Override
    public void onBackPressed() {
        fdgfiiii.ShowInterstitialAdsOnBack(this);
    }
}