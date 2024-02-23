package com.ads.sdk.fsadf5;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;

import com.ads.sdk.sfsf45f4.fdfdsff44;
import com.ads.sdk.sfsf45f4.fsdfdsf445;


public class sfdf44 implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {
    private Activity currentActivity;
    private Class<?> splashClass;
    private static final String TAG = "sfdf44";

    sfffdf44f sfffdf44f;

    public sfdf44(Application application, Class<?> aClass) {
        splashClass = aClass;
        application.registerActivityLifecycleCallbacks(this);
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
        sfffdf44f = new sfffdf44f();
    }

    @Override
    public void onStart(@NonNull LifecycleOwner owner) {
        DefaultLifecycleObserver.super.onStart(owner);

        if (fdfdsff44.isNetworkAvailable(currentActivity) && new fsdfdsf445(currentActivity).getAdsFlag() && !new fsdfdsf445(currentActivity).getAdmobAppOpenID().isEmpty() &&!currentActivity.getClass().getSimpleName().equals("Activity_ScanQRCode")) {
            sfffdf44f.showAdIfAvailable(currentActivity, splashClass);
        }
    }

    @Override
    public void onDestroy(@NonNull LifecycleOwner owner) {
        DefaultLifecycleObserver.super.onDestroy(owner);
    }

    @Override
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {

    }

    @Override
    public void onActivityStarted(@NonNull Activity activity) {
        currentActivity = activity;
    }

    @Override
    public void onActivityResumed(@NonNull Activity activity) {

    }

    @Override
    public void onActivityPaused(@NonNull Activity activity) {

    }

    @Override
    public void onActivityStopped(@NonNull Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {

    }

    @Override
    public void onActivityDestroyed(@NonNull Activity activity) {

    }

}
