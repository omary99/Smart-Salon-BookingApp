package com.example.smartsaloonbookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MySmartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_smart);
        getSupportActionBar().setTitle("My Smart Profile");
    }
}