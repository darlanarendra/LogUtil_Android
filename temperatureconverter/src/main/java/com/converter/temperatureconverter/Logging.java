package com.converter.temperatureconverter;

import android.util.Log;

public class Logging {


    private static final String TAG = Logging.class.getSimpleName();

    public static void d(String message){
        Log.v(TAG, message);
    }
}
