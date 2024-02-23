package com.ads.sdk.f1df1;

import static com.ads.sdk.sfsf45f4.fsdfdsf445.notificationDatumList;
import static com.ads.sdk.f1df1.fd1dsf1.notify_Pos;

import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;

import com.ads.sdk.R;

public class df1df1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fwdfsd);

        String url = notificationDatumList.get(notify_Pos).getNotifyLink();
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(this, Uri.parse(url));
        finish();
    }
}