package com.example.lawapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class UserRegistryActivity extends AppCompatActivity {

    private String email;

    private String password;

    private String name;

    private String gender;

    private String birthdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registry);
    }
}