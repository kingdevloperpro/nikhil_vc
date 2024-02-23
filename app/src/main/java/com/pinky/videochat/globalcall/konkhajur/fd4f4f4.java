package com.pinky.videochat.globalcall.konkhajur;

import static com.pinky.videochat.globalcall.ratdiii.dfg4f4g.isVectorShow;
import static com.pinky.videochat.globalcall.pritam.gfd54g45fg.isNetworkConnected;
import static com.pinky.videochat.globalcall.pritam.gfd54g45fg.native_ShowAds;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.ads.sdk.fdgfiiii;
import com.ads.sdk.sfsf45f4.fsdfdsf445;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;
import com.pinky.videochat.globalcall.R;
import com.pinky.videochat.globalcall.morli.MainActivity;
import com.pinky.videochat.globalcall.aakhdi.f4sdf48sd5f4;

public class fd4f4f4 extends AppCompatActivity {

    private TextView note;
    private boolean backer = false;
    private LottieAnimationView lottie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sadfasfaf);

        if (!isVectorShow) {
            ((ImageView) findViewById(R.id.vector_pro)).setVisibility(View.GONE);
        }

        findViewById(R.id.img_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        note = findViewById(R.id.note);
        lottie = findViewById(R.id.lottie);

        fsdfdsf445.show_anim_header(this, (RelativeLayout) findViewById(R.id.rl_anim_header));
        fdgfiiii.ShowInterstitialAdsOnCreate(this);
        if (new fsdfdsf445(this).getKeyOnresumenativeshow().equals("0")) {
            native_ShowAds(this, findViewById(R.id.native_container), 1);
        }


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                backer = true;
                if (new fsdfdsf445(fd4f4f4.this).getVideo_call().equalsIgnoreCase("1")) {
                    lottie.setAnimation("suc.json");
                    lottie.playAnimation();
                    lottie.loop(true);
                    note.setTextColor(getResources().getColor(R.color.green));
                    note.setText("Video Call Connected!");
                    TextView button = findViewById(R.id.my_button);
                    button.setVisibility(View.VISIBLE);
                    button.setText("JOIN");
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            if (isNetworkConnected(fd4f4f4.this)) {
                                Show_Dialog();
                            }
                        }
                    });

                } else {
                    lottie.setAnimation("failed.json");
                    lottie.loop(true);
                    lottie.setRepeatMode(LottieDrawable.RESTART);
                    lottie.playAnimation();
                    note.setTextColor(Color.RED);
                    note.setText("People not found!");
                    TextView button = findViewById(R.id.my_button);
                    button.setVisibility(View.VISIBLE);
                    button.setText("TRY AGAIN");
                    button.setBackground(getResources().getDrawable(R.drawable.ad_exit_three));
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (isNetworkConnected(fd4f4f4.this))
                                startActivity(new Intent(fd4f4f4.this, fd4f4f4.class));
                            finish();
                        }
                    });
                }
            }
        }, 6000);
    }

    private void Show_Dialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(fd4f4f4.this);
        final View view = getLayoutInflater().inflate(R.layout.sdfsdfsdf, null);
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.setCancelable(true);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        TextView txt_con = view.findViewById(R.id.txt_con);
        txt_con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();

                if (new fsdfdsf445(fd4f4f4.this).getKeyInAppMode().equals("1")) {

                    if (new f4sdf48sd5f4().getVipType().equals("in_app_gold") || new f4sdf48sd5f4().getVipType().equals("in_app_silver") || new f4sdf48sd5f4().getVipType().equals("in_app_bronze")) {
                        startActivity(new Intent(fd4f4f4.this, g4fdg4f4g.class));
                        finish();
                    } else {
                        if (new f4sdf48sd5f4().isFreeTrailActive()) {
                            new f4sdf48sd5f4().setFreeTrail(false);
                            startActivity(new Intent(fd4f4f4.this, g4fdg4f4g.class));
                            finish();
                        } else {
                            startActivity(new Intent(fd4f4f4.this, MainActivity.class));
                        }
                    }

                } else {
                    startActivity(new Intent(fd4f4f4.this, g4fdg4f4g.class));
                    finish();
                }


            }
        });
        dialog.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (new fsdfdsf445(this).getKeyOnresumenativeshow().equals("1")) {
            native_ShowAds(this, findViewById(R.id.native_container), 1);
        }
    }


    @Override
    public void onBackPressed() {
        if (backer) {
            try {
                fdgfiiii.ShowInterstitialAdsOnBack(this);
            } catch (Exception e) {
                finish();
                e.printStackTrace();
            }
        }
    }
}