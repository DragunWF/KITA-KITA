package com.example.kita_kita.data;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Database {
    private DatabaseReference mDatabase;
    public void writeRegisterData(String username, String password, String firstName, String lastName, int age, int contact, String email, String position) {
        mDatabase = FirebaseDatabase.getInstance("https://mobile-projects-a5f6f-default-rtdb.firebaseio.com/").getReference();
        Account user = new Account(username, password, firstName,
                                   lastName, age, contact, email, position);
        mDatabase.child("user").child(user.getUsername()).setValue(user);
    }
}
