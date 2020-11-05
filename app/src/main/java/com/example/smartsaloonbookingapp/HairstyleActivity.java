package com.example.smartsaloonbookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HairstyleActivity extends AppCompatActivity {
    Button mBtnHairstyleBookOne, mBtnHairstyleBookTwo, mBtnHairstyleBookThree, mBtnHairstyleBookFour, mBtnHairstyleBookFive,
            mBtnHairstyleBookSix, mBtnHairstyleBookSeven, mBtnHairstyleBookEight, mBtnHairstyleBookNine, mBtnHairstyleBookTen,
            mBtnHairstyleBookEleven, mBtnHairstyleBookTwelve, mBtnHairstyleBookTherteen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hairstyle);
        getSupportActionBar().setTitle("Smart Salon Hairstyle");

        //Button fetching
        mBtnHairstyleBookOne = findViewById(R.id.btn_hairstyle_booking_one);
        mBtnHairstyleBookTwo = findViewById(R.id.btn_hairstyle_booking_two);
        mBtnHairstyleBookThree = findViewById(R.id.btn_hairstyle_booking_three);
        mBtnHairstyleBookFour = findViewById(R.id.btn_hairstyle_booking_four);
        mBtnHairstyleBookFive = findViewById(R.id.btn_hairstyle_booking_five);
        mBtnHairstyleBookSix = findViewById(R.id.btn_hairstyle_booking_six);
        mBtnHairstyleBookSeven = findViewById(R.id.btn_hairstyle_booking_seven);
        mBtnHairstyleBookEight = findViewById(R.id.btn_hairstyle_booking_eight);
        mBtnHairstyleBookNine = findViewById(R.id.btn_hairstyle_booking_nine);
        mBtnHairstyleBookTen = findViewById(R.id.btn_hairstyle_booking_ten);
        mBtnHairstyleBookEleven = findViewById(R.id.btn_hairstyle_booking_eleven);
        mBtnHairstyleBookTwelve = findViewById(R.id.btn_hairstyle_booking_twelve);
        mBtnHairstyleBookTherteen = findViewById(R.id.btn_hairstyle_booking_therteen);

        //Button click listeners
        mBtnHairstyleBookOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnHairstyleBookTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnHairstyleBookThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnHairstyleBookFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnHairstyleBookFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnHairstyleBookSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnHairstyleBookSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnHairstyleBookEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnHairstyleBookNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnHairstyleBookTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnHairstyleBookEleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnHairstyleBookTwelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });

        mBtnHairstyleBookTherteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookingActivity.class));
            }
        });




    }
}