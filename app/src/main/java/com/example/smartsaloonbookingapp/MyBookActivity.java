package com.example.smartsaloonbookingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MyBookActivity extends AppCompatActivity {
    ListView myListView;
    List<Booking> bookingList;

    DatabaseReference BookingDbRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_book);
        getSupportActionBar().setTitle("My Booking Services");

        myListView = findViewById(R.id.myListView);
        bookingList = new ArrayList<>();

        BookingDbRef = FirebaseDatabase.getInstance().getReference("Bookings");

        BookingDbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                   bookingList.clear();

                   for (DataSnapshot bookingDataSnap : dataSnapshot.getChildren()){
                       Booking booking = bookingDataSnap.getValue(Booking.class);
                       bookingList.add(booking);
                   }

                   ListAdapter adapter = new ListAdapter(MyBookActivity.this, bookingList);
                   myListView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }
}