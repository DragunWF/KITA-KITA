package com.example.kita_kita;

import android.content.Intent;
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

import com.example.kita_kita.utils.Utils;

// import Data.Database;

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

        signUpBtn.setOnClickListener(v -> validateInput());
    }

    private void validateInput() {
        int ageNum = Integer.parseInt(String.valueOf(age.getText()));
        if (isEmpty(firstName)) {
            toast("First Name field cannot be empty!");
        } else if (isEmpty(lastName)) {
            toast("Last Name field cannot be empty!");
        } else if (isEmpty(username)) {
            toast("Username field cannot be empty!");
        } else if (isEmpty(password)) {
            toast("Password field cannot be empty!");
        } else if (isEmpty(age) || ageNum <= 0) {
            toast("Age cannot be empty and must be a positive number!");
        } else if (isEmpty(contact)) {
            toast("Contact field cannot be empty!");
        } else if (isEmpty(email)) {
            toast("Email field cannot be empty!");
        } else if (!businessOwner.isChecked() && !manager.isChecked() && !staff.isChecked()) {
            toast("Please select at least one job/position!");
        } else if (manager.isChecked() && staff.isChecked() && isEmpty(businessCode)) {
            toast("You have to enter a valid business code!");
        } else {
            // TODO: Make the users go to the needed page
            if (businessOwner.isChecked()) {
                new Intent(this, BusinessCode.class);
            } else {
                // TODO: Send user to other page
            }
        }
    }

    private boolean isEmpty(EditText text) {
        return String.valueOf(text.getText()).isEmpty();
    }

    private void toast(String message) {
        Utils.toast(this, message);
    }
}