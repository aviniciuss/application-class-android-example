package br.com.applicationclassexample;

import android.app.Application;
import android.util.Log;

public class MyApplication extends Application {

    public String username = "";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("LOG", "onCreate()");
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        // <= API 13
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        // >= API 14
        Log.i("LOG", "onTrimMemory("+level+")");
        Log.i("LOG", "TRIM_MEMORY_BACKGROUND: "+TRIM_MEMORY_BACKGROUND);
        Log.i("LOG", "TRIM_MEMORY_COMPLETE: "+TRIM_MEMORY_COMPLETE);
        Log.i("LOG", "TRIM_MEMORY_MODERATE: "+TRIM_MEMORY_MODERATE);
        Log.i("LOG", "TRIM_MEMORY_RUNNING_CRITICAL: "+TRIM_MEMORY_RUNNING_CRITICAL);
        Log.i("LOG", "TRIM_MEMORY_RUNNING_LOW: "+TRIM_MEMORY_RUNNING_LOW);
        Log.i("LOG", "TRIM_MEMORY_RUNNING_MODERATE: "+TRIM_MEMORY_RUNNING_MODERATE);
        Log.i("LOG", "TRIM_MEMORY_UI_HIDDEN: "+TRIM_MEMORY_UI_HIDDEN);
    }
}
