package com.example.kita_kita;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BusinessCode extends AppCompatActivity {
    private Button doneBtn;
    private TextView generatedCodeText;
    private String generatedCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_business_code);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        generatedCodeText = findViewById(R.id.generatedCode);
        generatedCode = String.valueOf(generatedCodeText.getText());

        doneBtn = findViewById(R.id.doneBtnBusinessCode);
        doneBtn.setOnClickListener(v -> {
            // TODO: Send user to the main activity
            // new Intent(BusinessCode.this, );
        });
    }
}