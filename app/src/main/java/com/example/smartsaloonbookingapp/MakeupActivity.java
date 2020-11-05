package com.example.smartsaloonbookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MakeupActivity extends AppCompatActivity {
    Button mBtnMakeupBookOne, mBtnMakeupBookTwo, mBtnMakeupBookThree, mBtnMakeupBookFour, mBtnMakeupBookFive, mBtnMakeupBookSix,
            mBtnMakeupBookSeven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makeup);
        getSupportActionBar().setTitle("Smart Salon Makeup Style");

        mBtnMakeupBookOne = findViewById(R.id.btn_makeup_booking_one);
        mBtnMakeupBookTwo = findViewById(R.id.btn_makeup_booking_two);
        mBtnMakeupBookThree = findViewById(R.id.btn_makeup_booking_three);
        mBtnMakeupBookFour = findViewById(R.id.btn_makeup_booking_four);
        mBtnMakeupBookFive = findViewById(R.id.btn_makeup_booking_five);
        mBtnMakeupBookSix = findViewById(R.id.btn_makeup_booking_six);
        mBtnMakeupBookSeven = findViewById(R.id.btn_makeup_booking_seven);

        mBtnMakeupBookOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));            }
        });

        mBtnMakeupBookTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnMakeupBookThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnMakeupBookFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnMakeupBookFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnMakeupBookSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnMakeupBookSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

    }
}