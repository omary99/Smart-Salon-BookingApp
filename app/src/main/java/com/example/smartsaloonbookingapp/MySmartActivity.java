package com.example.smartsaloonbookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MySmartActivity extends AppCompatActivity {
    Button mBtnWishList, mBtnStoreFollowed, mBtnRecentlyViewed, mBtnAddressManagement, mBtnInviteFriend, mBtnServiceCenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_smart);
        getSupportActionBar().setTitle("My Smart Profile");

         mBtnWishList = findViewById(R.id.btn_wish_list);
         mBtnStoreFollowed = findViewById(R.id.btn_store_followed);
         mBtnRecentlyViewed = findViewById(R.id.btn_recently_viewed);
         mBtnAddressManagement = findViewById(R.id.btn_address_management);
         mBtnInviteFriend = findViewById(R.id.btn_invite_friends);
         mBtnServiceCenter = findViewById(R.id.btn_service_center);

         mBtnWishList.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(MySmartActivity.this, "Wish List Button Clicked", Toast.LENGTH_SHORT).show();
             }
         });

        mBtnStoreFollowed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MySmartActivity.this, "Store Followed Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        mBtnRecentlyViewed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MySmartActivity.this, "Recently Viewed Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        mBtnAddressManagement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MySmartActivity.this, "Address Management Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        mBtnInviteFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MySmartActivity.this, "Invite Friends Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        mBtnServiceCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MySmartActivity.this, "Service Center Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });


    }
}