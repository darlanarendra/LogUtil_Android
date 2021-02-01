package com.bluewhales.bayarea;

import android.util.Log;

public class Logging {

    public static final String TAG = Logging.class.getSimpleName();
    public static void d(String message){
        Log.v(TAG, message);
    }
}

