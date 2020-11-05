package com.example.smartsaloonbookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MassageActivity extends AppCompatActivity {
    Button mBtnMassageBookOne, mBtnMassageBookTwo, mBtnMassageBookThree, mBtnMassageBookFour, mBtnMassageBookFive,
            mBtnMassageBookSix, mBtnMassageBookSeven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_massage);
        getSupportActionBar().setTitle("Smart Salon Massage Style");

        mBtnMassageBookOne = findViewById(R.id.btn_massage_booking_one);
        mBtnMassageBookTwo = findViewById(R.id.btn_massage_booking_two);
        mBtnMassageBookThree = findViewById(R.id.btn_massage_booking_three);
        mBtnMassageBookFour = findViewById(R.id.btn_massage_booking_four);
        mBtnMassageBookFive = findViewById(R.id.btn_massage_booking_five);
        mBtnMassageBookSix = findViewById(R.id.btn_massage_booking_six);
        mBtnMassageBookSeven = findViewById(R.id.btn_massage_booking_seven);

        mBtnMassageBookOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnMassageBookTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnMassageBookThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnMassageBookFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnMassageBookFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnMassageBookSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnMassageBookSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });
    }
}