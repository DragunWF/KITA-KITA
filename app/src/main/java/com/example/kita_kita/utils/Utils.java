package com.example.kita_kita.utils;

import android.content.Context;
import android.widget.EditText;
import android.widget.Toast;

public class Utils {
    public static void toast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static boolean isEmpty(EditText text) {
        return String.valueOf(text.getText()).isEmpty();
    }
}
