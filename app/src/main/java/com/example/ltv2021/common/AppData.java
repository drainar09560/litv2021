package com.example.ltv2021.common;

public class AppData {
    private static AppData instance;

    public static AppData getInstance() {
        if(instance==null)
            instance =new AppData();
        return instance;

    }

    public AppData(){

    }
}
