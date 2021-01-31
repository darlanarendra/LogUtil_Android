package com.narenrecw.logutil;

import android.util.Log;

public class LogDebug {

    private static final String TAG = LogDebug.class.getSimpleName();

    public static void g(String message){
        Log.d(TAG, message);
    }
}
