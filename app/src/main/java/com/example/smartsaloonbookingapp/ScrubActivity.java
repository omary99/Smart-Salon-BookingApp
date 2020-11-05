package com.example.smartsaloonbookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ScrubActivity extends AppCompatActivity {
    Button mBtnScrubOne, mBtnScrubTwo, mBtnScrubThree, mBtnScrubFour, mBtnScrubFive, mBtnScrubSix, mBtnScrubSeven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrub);
        getSupportActionBar().setTitle("Smart Salon Scrubs Style");

        mBtnScrubOne = findViewById(R.id.btn_scrub_booking_one);
        mBtnScrubTwo = findViewById(R.id.btn_scrub_booking_two);
        mBtnScrubThree = findViewById(R.id.btn_scrub_booking_three);
        mBtnScrubFour = findViewById(R.id.btn_scrub_booking_four);
        mBtnScrubFive = findViewById(R.id.btn_scrub_booking_five);
        mBtnScrubSix = findViewById(R.id.btn_scrub_booking_six);
        mBtnScrubSeven = findViewById(R.id.btn_scrub_booking_seven);

        mBtnScrubOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnScrubTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnScrubThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnScrubFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnScrubFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnScrubSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnScrubSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

    }
}