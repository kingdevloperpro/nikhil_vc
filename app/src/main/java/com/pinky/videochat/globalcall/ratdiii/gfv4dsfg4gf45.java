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
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.ads.sdk.fdgfiiii;
import com.ads.sdk.sfsf45f4.fsdfdsf445;
import com.pinky.videochat.globalcall.R;


public class gfv4dsfg4gf45 extends AppCompatActivity {

    private AppCompatButton gender_next;
    private LinearLayout ll_male, ll_female;
    private ImageView chk_male, chk_female;
    private boolean checker = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dfghfghgh);

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


        gender_next = findViewById(R.id.gender_next);
        ll_male = findViewById(R.id.ll_male);
        ll_female = findViewById(R.id.ll_female);
        chk_male = findViewById(R.id.chk_male);
        chk_female = findViewById(R.id.chk_female);

        ll_male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checker = true;
                chk_male.setImageResource(R.drawable.check);
                chk_female.setImageResource(R.drawable.uncheck);
            }
        });

        ll_female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checker = true;
                chk_male.setImageResource(R.drawable.uncheck);
                chk_female.setImageResource(R.drawable.check);
            }
        });

        gender_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checker) {
                    if (new fsdfdsf445(gfv4dsfg4gf45.this).getIncoming_Counter().equalsIgnoreCase(String.valueOf(incoming_counter))) {
                        connectInComing(gfv4dsfg4gf45.this);
                    } else {
                        startActivity(new Intent(gfv4dsfg4gf45.this, f4fd44dd.class));
                    }
                } else {
                    Toast.makeText(gfv4dsfg4gf45.this, "select gender first!", Toast.LENGTH_SHORT).show();
                }
            }
        });
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

    @Override
    public void onBackPressed() {
        fdgfiiii.ShowInterstitialAdsOnBack(this);
    }


}