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

public class fdf5dd extends AppCompatActivity {

    LinearLayout guide_1, guide_2, guide_3, guide_4, guide_5, guide_6, guide_7, guide_8, guide_9, guide_0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gdsfgdf);

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

        init();

        guide_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(fdf5dd.this, fd4f4f4.class));
            }
        });

        guide_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next(1);
            }
        });
        guide_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next(2);
            }
        });
        guide_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next(3);
            }
        });
        guide_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next(4);
            }
        });
        guide_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next(5);
            }
        });
        guide_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next(6);
            }
        });
        guide_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next(7);
            }
        });
        guide_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next(8);
            }
        });
    }

    public void init() {
        guide_1 = findViewById(R.id.guide_1);
        guide_2 = findViewById(R.id.guide_2);
        guide_3 = findViewById(R.id.guide_3);
        guide_4 = findViewById(R.id.guide_4);
        guide_5 = findViewById(R.id.guide_5);
        guide_6 = findViewById(R.id.guide_6);
        guide_7 = findViewById(R.id.guide_7);
        guide_8 = findViewById(R.id.guide_8);
        guide_9 = findViewById(R.id.guide_1);
        guide_0 = findViewById(R.id.guide_0);
    }

    public void next(int count) {
        if (new fsdfdsf445(fdf5dd.this).getIncoming_Counter().equalsIgnoreCase(String.valueOf(incoming_counter))) {
            connectInComing(fdf5dd.this);
        } else {
            Intent intent = new Intent(fdf5dd.this, g1fdg4g4f4.class);
            intent.putExtra("counter", count);
            startActivity(intent);
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
            native_ShowAds(this, findViewById(R.id.native_container), 2);
        }
    }
}