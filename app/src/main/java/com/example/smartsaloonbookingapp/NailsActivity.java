package com.example.smartsaloonbookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NailsActivity extends AppCompatActivity {
    Button mBtnNailOne, mBtnNailTwo, mBtnNailThree, mBtnNailFour, mBtnNailFive, mBtnNailSix, mBtnNailSeven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nails);
        getSupportActionBar().setTitle("Smart Salon Nails Style");

        mBtnNailOne = findViewById(R.id.btn_nail_booking_one);
        mBtnNailTwo = findViewById(R.id.btn_nail_booking_two);
        mBtnNailThree = findViewById(R.id.btn_nail_booking_three);
        mBtnNailFour = findViewById(R.id.btn_nail_booking_four);
        mBtnNailFive = findViewById(R.id.btn_nail_booking_five);
        mBtnNailSix = findViewById(R.id.btn_nail_booking_six);
        mBtnNailSeven = findViewById(R.id.btn_nail_booking_seven);

        mBtnNailOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnNailTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnNailThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnNailFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnNailFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnNailSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnNailSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });
    }
}