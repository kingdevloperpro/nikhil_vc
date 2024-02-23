package com.pinky.videochat.globalcall.aakhdi;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.pinky.videochat.globalcall.R;

public class gdfg596595 extends AppCompatActivity {

    private WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dfgdfggh);

        WebView webView = (WebView) findViewById(R.id.webView);
        wv = webView;
        webView.getSettings().setJavaScriptEnabled(true);

        int links = getIntent().getIntExtra("link",0);

        if (links==1){
            wv.loadUrl("file:///android_asset/term_of_use.html");
        }
        if (links==2){
            wv.loadUrl("file:///android_asset/privacy_policy.html");
        }
        if (links==3){
            wv.loadUrl("file:///android_asset/app_community_guideline.html");
        }
    }
}