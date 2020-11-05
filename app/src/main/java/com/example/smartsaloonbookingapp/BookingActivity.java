package com.example.smartsaloonbookingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class BookingActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    RadioButton radioPriceSimple, radioPriceNormal, radioPriceSemiLuxury, radioPriceLuxury, radioPriceVeryLuxury;
    Spinner spinnerOne, spinnerTwo;
    EditText edtDate;
    Button mBtnSave;
    TextView mTvService, mTvStyle;

    DatabaseReference databaseReference;
    String item;
    Booking booking;
    String Price = "";
    String SalonService, ServiceStyle, ServicePrice, ServiceDate;

    String [] salonServices = {"Choose Salon Services", "Hairdressing", "Hairstyle", "Massage", "Makeup", "Nails", "Scrub"};
    String [] salonStyle  = {"Choose Service Style",
            "Hair Blow drys", "Hair Re-styles", "Permanent and semi-permanent hair colouring", "Plait Bob Style",
            "Plait Yeboyebo Style", "Basic Manicure Nails", "French Manicure Nails", "Sugar Body Scrubs",
            "Salt Body Scrubs", "Deep tissue massage", "Aromatherapy tissue massage"
    };
    ProgressDialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        spinnerOne = findViewById(R.id.spinner_one);
        spinnerTwo = findViewById(R.id.spinner_two);
        radioPriceSimple = findViewById(R.id.radio_simple);
        radioPriceNormal = findViewById(R.id.radio_normal);
        radioPriceLuxury = findViewById(R.id.radio_luxury);
        radioPriceSemiLuxury = findViewById(R.id.radio_semiLuxury);
        radioPriceVeryLuxury = findViewById(R.id.radio_veryLuxury);
        edtDate = findViewById(R.id.edt_date);
        mBtnSave = findViewById(R.id.btn_save);
        mTvService = findViewById(R.id.tv_service);
        mTvStyle = findViewById(R.id.tv_style);


        dialog = new ProgressDialog(this);
        dialog.setTitle("Booking");
        dialog.setMessage("Please wait...");
        spinnerOne.setOnItemSelectedListener(this);
        spinnerTwo.setOnItemSelectedListener(this);



        ArrayAdapter arrayAdapterOne = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,salonServices);
        arrayAdapterOne.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerOne.setAdapter(arrayAdapterOne);


        ArrayAdapter arrayAdapterTwo = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,salonStyle);
        arrayAdapterTwo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTwo.setAdapter(arrayAdapterTwo);

        mBtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                SaveValue(item);
                final String serviceDate = edtDate.getText().toString();
                ServiceDate = serviceDate;


                if (radioPriceSimple.isChecked()) {
                    Price = "10000/=";
                }  if (radioPriceNormal.isChecked()) {
                    Price = "15000/=";
                }  if (radioPriceSemiLuxury.isChecked()) {
                    Price = "25000/=";
                }  if (radioPriceLuxury.isChecked()) {
                    Price = "35000/=";
                }  if (radioPriceVeryLuxury.isChecked()) {
                    Price = "50000/=";
                }
                ServicePrice = Price;
                Log.d("price_radio", "Selected radio price: "+Price);
                SaveValue();
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        item = spinnerOne.getSelectedItem().toString();
        mTvService.setText(item);
        SalonService = item;
        Log.d("price_radio", "Selected spinner one item: "+item);

        item = spinnerTwo.getSelectedItem().toString();
        mTvStyle.setText(item);
        ServiceStyle = item;
        Log.d("price_radio", "Selected spinner two item: "+item);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    void SaveValue(){
        if (item =="Choose Salon Services"){
            Toast.makeText(this, "Please Select item", Toast.LENGTH_SHORT).show();
        }else {
           Booking book_data = new Booking(SalonService, ServiceStyle, ServicePrice, ServiceDate);
           DatabaseReference ref = FirebaseDatabase.getInstance().getReference().child("Bookings/"+System.currentTimeMillis());
           dialog.show();
           ref.setValue(book_data).addOnCompleteListener(new OnCompleteListener<Void>() {
               @Override
               public void onComplete(@NonNull Task<Void> task) {
                    dialog.dismiss();
                    if (task.isSuccessful()){
                        Toast.makeText(BookingActivity.this, "Booking successful", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
                    }else {
                        Toast.makeText(BookingActivity.this, "Booking failed", Toast.LENGTH_SHORT).show();
                    }
               }
           });
        }
    }
}

