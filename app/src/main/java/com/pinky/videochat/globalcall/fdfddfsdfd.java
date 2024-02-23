package com.pinky.videochat.globalcall;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.ads.sdk.fdgfiiii;
import com.pinky.videochat.globalcall.ratdiii.dfg4f4g;

public class fdfddfsdfd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gdegdf);

        fdgfiiii.ShowInterstitialAdsOnCreate(this);

        findViewById(R.id.tv_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(fdfddfsdfd.this, dfg4f4g.class).putExtra("issplash", 2));
                finish();
            }
        });

        findViewById(R.id.tv_decline).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }

    @Override
    public void onBackPressed() {
    }
}