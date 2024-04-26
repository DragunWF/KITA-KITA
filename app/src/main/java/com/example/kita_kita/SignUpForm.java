package com.example.kita_kita;

import android.app.AlertDialog;
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
        int ageNum;
        try {
            ageNum = Integer.parseInt(String.valueOf(age.getText()));
        } catch (NumberFormatException nfe) {
            toast("Invalid age input!");
            return;
        }

        if (Utils.isEmpty(firstName)) {
            toast("First Name field cannot be empty!");
        } else if (Utils.isEmpty(lastName)) {
            toast("Last Name field cannot be empty!");
        } else if (Utils.isEmpty(username)) {
            toast("Username field cannot be empty!");
        } else if (Utils.isEmpty(password)) {
            toast("Password field cannot be empty!");
        } else if (Utils.isEmpty(age) || ageNum <= 0) {
            toast("Age cannot be empty and must be a positive number!");
        } else if (Utils.isEmpty(contact)) {
            toast("Contact field cannot be empty!");
        } else if (Utils.isEmpty(email)) {
            toast("Email field cannot be empty!");
        } else if (!businessOwner.isChecked() && !manager.isChecked() && !staff.isChecked()) {
            toast("Please select at least one job/position!");
        } else if (manager.isChecked() && staff.isChecked() && Utils.isEmpty(businessCode)) {
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

    private void dialogBox() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(String.format("First Name: %s\nLast Name: %s\nUsername: %s\nPassword: %s\nJob Position: %s\n" +
                                         "Age: %s\nContact Number: %s\n Email: %s"
                                         , Utils.getText(firstName), Utils.getText(lastName)
                                         , Utils.getText(username), hidePassword(password)
                                         , jobPosition(), Utils.getText(age)
                                         , Utils.getText(contact), Utils.getText(email)))
                                         .setTitle("Credential Validator");
        builder.create().show();
    }

    private String hidePassword(EditText password) {
        StringBuilder pass = new StringBuilder(Utils.getText(password));
        for (int i = 0; i < pass.length(); i++) {
            pass.setCharAt(i, '*');
        }
        return String.valueOf(pass);
    }

    private String jobPosition() {
        if (businessOwner.isChecked()) {
            return "Business Owner";
        } else if (manager.isChecked()) {
            return "Manager";
        } else if (staff.isChecked()) {
            return "Staff";
        }
        return null;
    }

    private void toast(String message) {
        Utils.toast(this, message);
    }
}