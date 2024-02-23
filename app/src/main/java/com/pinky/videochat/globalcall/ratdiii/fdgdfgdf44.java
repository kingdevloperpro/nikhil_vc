package com.pinky.videochat.globalcall.ratdiii;

import static com.pinky.videochat.globalcall.ratdiii.dfg4f4g.incoming_counter;
import static com.pinky.videochat.globalcall.ratdiii.dfg4f4g.isVectorShow;
import static com.pinky.videochat.globalcall.pritam.gfd54g45fg.native_ShowAds;
import static com.pinky.videochat.globalcall.aakhdi.dfsdfdf45545.connectInComing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ads.sdk.fdgfiiii;
import com.ads.sdk.sfsf45f4.fsdfdsf445;
import com.pinky.videochat.globalcall.R;
import com.pinky.videochat.globalcall.konkhajur.fd4f4f4;

public class fdgdfgdf44 extends AppCompatActivity {

    private LinearLayout room1, room2, room3, room4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gg);

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
            native_ShowAds(this, findViewById(R.id.native_container), 1);
        }


        room1 = findViewById(R.id.room1);
        room2 = findViewById(R.id.room2);
        room3 = findViewById(R.id.room3);
        room4 = findViewById(R.id.room4);

        room1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });
        room2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });
        room3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });
        room4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });
    }

    private void next() {
        if (new fsdfdsf445(fdgdfgdf44.this).getIncoming_Counter().equalsIgnoreCase(String.valueOf(incoming_counter))) {
            connectInComing(fdgdfgdf44.this);
        } else {
            startActivity(new Intent(fdgdfgdf44.this, fd4f4f4.class));
        }
    }

    @Override
    public void onBackPressed() {
        fdgfiiii.ShowInterstitialAdsOnBack(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (!isVectorShow) {
            ((ImageView) findViewById(R.id.vector_pro)).setVisibility(View.GONE);
        }

        if (new fsdfdsf445(this).getKeyOnresumenativeshow().equals("1")) {
            native_ShowAds(this, findViewById(R.id.native_container), 1);
        }
    }
}