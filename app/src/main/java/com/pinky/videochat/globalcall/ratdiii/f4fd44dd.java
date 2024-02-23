package com.pinky.videochat.globalcall.ratdiii;

import static com.pinky.videochat.globalcall.ratdiii.dfg4f4g.incoming_counter;
import static com.pinky.videochat.globalcall.ratdiii.dfg4f4g.isVectorShow;
import static com.pinky.videochat.globalcall.pritam.gfd54g45fg.native_ShowAds;
import static com.pinky.videochat.globalcall.aakhdi.dfsdfdf45545.connectInComing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.ads.sdk.fdgfiiii;
import com.ads.sdk.sfsf45f4.fsdfdsf445;
import com.pinky.videochat.globalcall.R;

public class f4fd44dd extends AppCompatActivity {

    private AppCompatButton age_next;
    private RadioButton r1, r2, r3;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myuky);

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


        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        radioGroup = findViewById(R.id.radioGroup);
        age_next = findViewById(R.id.age_next);

        age_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (new fsdfdsf445(f4fd44dd.this).getIncoming_Counter().equalsIgnoreCase(String.valueOf(incoming_counter))) {
                    connectInComing(f4fd44dd.this);
                } else {
                    startActivity(new Intent(f4fd44dd.this, jhytjhyj4.class));
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

        if (!isVectorShow) {
            ((ImageView) findViewById(R.id.vector_pro)).setVisibility(View.GONE);
        }

        if (new fsdfdsf445(this).getKeyOnresumenativeshow().equals("1")) {
            native_ShowAds(this, findViewById(R.id.native_container), 1);
        }
    }
}