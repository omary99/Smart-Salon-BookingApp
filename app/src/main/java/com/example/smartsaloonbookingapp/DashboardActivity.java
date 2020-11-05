package com.example.smartsaloonbookingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardActivity extends AppCompatActivity {
    Button mBtnHairdressing, mBtnHairstyle, mBtnMakeup, mBtnScrub, mBtnNails, mBtnMassage;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getSupportActionBar().setTitle("Smart Salon Dashboard");

        mBtnHairdressing = findViewById(R.id.btn_hairdressing_four);
        mBtnHairstyle = findViewById(R.id.btn_hairstyle);
        mBtnMakeup = findViewById(R.id.btn_makeup);
        mBtnMassage = findViewById(R.id.btn_massage);
        mBtnNails = findViewById(R.id.btn_nails);
        mBtnScrub = findViewById(R.id.btn_scrub);
        bottomNavigationView = findViewById(R.id.bottom_navigation_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_new_service:
                        startActivity(new Intent(getApplicationContext(), NewStyleActivity.class));
                        break;

                    case R.id.action_my_booking:
                        startActivity(new Intent(getApplicationContext(), MyBookActivity.class));
                        break;

                    case R.id.action_my_smart:
                        startActivity(new Intent(getApplicationContext(), MySmartActivity.class));
                        break;
                }
                return true;
            }
        });

        //click events of button
        mBtnHairdressing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HairdressingActivity.class));
            }
        });

        mBtnHairstyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              startActivity(new Intent(getApplicationContext(),HairstyleActivity.class));
            }
        });

        mBtnScrub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ScrubActivity.class));
            }
        });

        mBtnNails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), NailsActivity.class));
            }
        });

        mBtnMakeup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(getApplicationContext(), MakeupActivity.class));
            }
        });

        mBtnMassage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MassageActivity.class));
            }
        });
    }
}