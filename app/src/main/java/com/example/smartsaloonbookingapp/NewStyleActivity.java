package com.example.smartsaloonbookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NewStyleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_style);
        getSupportActionBar().setTitle("New Hot Styles");
    }
}