package com.example.kita_kita.utils;

import static androidx.core.content.ContextCompat.startActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Utils {
    public static void toast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static boolean isEmpty(EditText text) {
        return String.valueOf(text.getText()).isEmpty();
    }

    public static String getText(EditText text) {
        return String.valueOf(text.getText());
    }
}
