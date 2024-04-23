package com.example.kita_kita;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUpForm extends AppCompatActivity {
    private EditText firstName;
    private EditText lastName;
    private EditText username;
    private EditText password;
    private EditText age;
    private EditText contact;
    private EditText businessCode;
    private EditText email;
    private Button signUpBtn;
    private RadioGroup jobRbtnGroup;
    private RadioButton businessOwner;
    private RadioButton manager;
    private RadioButton staff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up_form);

        firstName = findViewById(R.id.inputFirstNameSignUp);
        lastName = findViewById(R.id.inputLastNameSignUp);
        username = findViewById(R.id.inputUsernameSignUp);
        password = findViewById(R.id.inputPasswordSignUp);
        age = findViewById(R.id.inputAgeSignUp);
        contact = findViewById(R.id.inputContactSignUp);
        businessCode = findViewById(R.id.inputBusinessCodeSignUp);
        email = findViewById(R.id.inputEmailSignUp);
        signUpBtn = findViewById(R.id.signUpBtn);
        jobRbtnGroup = findViewById(R.id.jobRbtnGroup);
        businessOwner = findViewById(R.id.businessOwnerRbtn);
        manager = findViewById(R.id.managerRbtn);
        staff = findViewById(R.id.staffRbtn);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}