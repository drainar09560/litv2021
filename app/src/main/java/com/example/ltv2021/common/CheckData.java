package com.example.ltv2021.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;

public class CheckData {
    public static boolean checkMail(String mail){
        return mail.matches("[a-z0-9]+@[a-z0-9]+.[a-z]{1,3}");
    }

    public static void makeMessage(String message, Context context)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Error");
        builder.setMessage(message);
        builder.show();

    }

    public static void authConfirmed(final Activity activity, String login, String pass){

    }
}
