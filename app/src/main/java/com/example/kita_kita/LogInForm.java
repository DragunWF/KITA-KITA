package com.example.kita_kita;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.kita_kita.utils.Utils;

public class LogInForm extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_log_in_form);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        username = findViewById(R.id.inputUsernameLogin);
        password = findViewById(R.id.inputPasswordLogin);
        loginBtn = findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(v -> {
            if (Utils.isEmpty(username)) {
                toast("Username cannot be empty!");
            } else if (Utils.isEmpty(password)) {
                toast("Password cannot be empty!");
            } else {
                // TODO: Direct user to the main activity
            }
        });
    }

    private void toast(String message) {
        Utils.toast(this, message);
    }
}