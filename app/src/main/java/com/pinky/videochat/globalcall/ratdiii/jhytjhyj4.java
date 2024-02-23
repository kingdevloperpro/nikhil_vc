package com.pinky.videochat.globalcall.ratdiii;

import static com.pinky.videochat.globalcall.ratdiii.dfg4f4g.incoming_counter;
import static com.pinky.videochat.globalcall.pritam.gfd54g45fg.native_ShowAds;
import static com.pinky.videochat.globalcall.aakhdi.dfsdfdf45545.connectInComing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ads.sdk.fdgfiiii;
import com.ads.sdk.sfsf45f4.fsdfdsf445;
import com.pinky.videochat.globalcall.R;

public class jhytjhyj4 extends AppCompatActivity {

    LinearLayout videocall, videocall_advice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gdfgdfg);

        findViewById(R.id.img_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        incoming_counter++;

        fsdfdsf445.show_anim_header(this, (RelativeLayout) findViewById(R.id.rl_anim_header));
        fdgfiiii.ShowInterstitialAdsOnCreate(this);
        if (new fsdfdsf445(this).getKeyOnresumenativeshow().equals("0")) {
            native_ShowAds(this, findViewById(R.id.native_container), 2);
        }


        videocall = findViewById(R.id.videocall);
        videocall_advice = findViewById(R.id.videocall_advice);

        videocall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (new fsdfdsf445(jhytjhyj4.this).getIncoming_Counter().equalsIgnoreCase(String.valueOf(incoming_counter))) {
                    connectInComing(jhytjhyj4.this);
                } else {
                    startActivity(new Intent(jhytjhyj4.this, fdgdfgdf44.class));
                }
            }
        });


        videocall_advice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (new fsdfdsf445(jhytjhyj4.this).getIncoming_Counter().equalsIgnoreCase(String.valueOf(incoming_counter))) {
                    connectInComing(jhytjhyj4.this);
                } else {
                    startActivity(new Intent(jhytjhyj4.this, fdf5dd.class));
                }
            }
        });
    }


    @Override
    public void onBackPressed() {
        fdgfiiii.ShowInterstitialAdsOnBack(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (new fsdfdsf445(this).getKeyOnresumenativeshow().equals("1")) {
            native_ShowAds(this, findViewById(R.id.native_container), 2);
        }
    }
}