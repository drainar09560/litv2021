package com.example.ltv2021.common;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class AppData {
    private static AppData instance;

    public static AppData getInstance(Context context) {
        if(instance==null)
            instance =new AppData(context.getApplicationContext());
        return instance;

    }

    public RequestQueue queue;
    public AppData(Context context){
        queue = Volley.newRequestQueue(context);
    }
}
