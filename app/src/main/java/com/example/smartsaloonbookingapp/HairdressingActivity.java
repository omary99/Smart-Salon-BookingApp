package com.example.smartsaloonbookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HairdressingActivity extends AppCompatActivity {
    Button mBtnHairdressingOne, mBtnHairdressingTwo, mBtnHairdressingThree, mBtnHairdressingFour;
    Button mBtnHairdressingBookOne, mBtnHairdressingBookTwo, mBtnHairdressingBookThree, mBtnHairdressingBookFour;
    Button mBtnHairdressingBookFive, mBtnHairdressingBookSix, mBtnHairdressingBookSeven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hairdressing);
        getSupportActionBar().setTitle("Smart Salon Hairdressing Style");

        // Buttons of full cards
        mBtnHairdressingOne = findViewById(R.id.btn_hairdressing_one);
        mBtnHairdressingTwo = findViewById(R.id.btn_hairdressing_two);
        mBtnHairdressingThree = findViewById(R.id.btn_hairdressing_three);
        mBtnHairdressingFour = findViewById(R.id.btn_hairdressing_four);

        //Button of booking hairdressing
        mBtnHairdressingBookOne = findViewById(R.id.btn_hairdressing_booking_one);
        mBtnHairdressingBookTwo = findViewById(R.id.btn_hairdressing_booking_two);
        mBtnHairdressingBookThree = findViewById(R.id.btn_hairdressing_booking_three);
        mBtnHairdressingBookFour = findViewById(R.id.btn_hairdressing_booking_four);
        mBtnHairdressingBookFive = findViewById(R.id.btn_hairdressing_booking_five);
        mBtnHairdressingBookSix = findViewById(R.id.btn_hairdressing_booking_six);
        mBtnHairdressingBookSeven = findViewById(R.id.btn_hairdressing_booking_seven);

          // Click listeners for buttons of full hairdressing cards
        mBtnHairdressingOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HairdressingActivity.this, "Hairdressing One Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        mBtnHairdressingTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HairdressingActivity.this, "Hairdressing Two Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        mBtnHairdressingThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HairdressingActivity.this, "Hairdressing Three Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        mBtnHairdressingFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HairdressingActivity.this, "Hairdressing Four Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        // Click Listeners for buttons of the hairdressing booking

        mBtnHairdressingBookOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnHairdressingBookTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnHairdressingBookThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnHairdressingBookFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnHairdressingBookFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnHairdressingBookSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnHairdressingBookSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });
    }
}