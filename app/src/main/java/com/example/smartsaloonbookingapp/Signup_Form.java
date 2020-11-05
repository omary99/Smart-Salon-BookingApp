package com.example.smartsaloonbookingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Signup_Form extends AppCompatActivity {
    TextInputEditText mEdtFullName, mEdtUserName, mEdtEmail, mEdtPassword, mEdtConfirmPassword;
    Button mBtnSignUp;
    ProgressBar progressBar;
    RadioButton radioGenderMale, radioGenderFemale;

    DatabaseReference databaseReference;
    String gender = "";
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup__form);
        getSupportActionBar().setTitle("Signup Form");

        mEdtFullName = findViewById(R.id.edt_fullname);
        mEdtUserName = findViewById(R.id.edt_username);
        mEdtEmail = findViewById(R.id.edt_mail);
        mEdtPassword = findViewById(R.id.edt_password);
        mEdtConfirmPassword = findViewById(R.id.edt_confirmpassword);
        progressBar = findViewById(R.id.progressBar);
        mBtnSignUp=findViewById(R.id.btn_register);
        radioGenderFemale = findViewById(R.id.radio_female);
        radioGenderMale = findViewById(R.id.radio_male);

        //database click listeners
        databaseReference = FirebaseDatabase.getInstance().getReference("User");

        // firebase click listeners
        firebaseAuth = FirebaseAuth.getInstance();

        //Register click event
        mBtnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Database actions
                final String fullName = mEdtFullName.getText().toString();
                final String userName = mEdtUserName.getText().toString();

                if (radioGenderMale.isChecked()) {
                    gender = "Male";
                }
                if (radioGenderFemale.isChecked()) {
                    gender = "Female";
                }

//                //Authentication actions
                final String email = mEdtEmail.getText().toString().trim();
                String password = mEdtPassword.getText().toString().trim();
                String confirmPassword = mEdtConfirmPassword.getText().toString().trim();

                if (TextUtils.isEmpty(email)){
                    Toast.makeText(Signup_Form.this, "Please Enter Email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(fullName)){
                    Toast.makeText(Signup_Form.this, "Please Enter fullName", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(userName)){
                    Toast.makeText(Signup_Form.this, "Please Enter userName", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)){
                    Toast.makeText(Signup_Form.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(confirmPassword)){
                    Toast.makeText(Signup_Form.this, "Please Enter Confirm Password", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (password.length()<6){
                    Toast.makeText(Signup_Form.this, "Password is too short", Toast.LENGTH_SHORT).show();
                }

                progressBar.setVisibility(View.VISIBLE);

                if (password.equals(confirmPassword)){
                    firebaseAuth.createUserWithEmailAndPassword(email, password)
                            .addOnCompleteListener(Signup_Form.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    progressBar.setVisibility(View.GONE);
                                    if (task.isSuccessful()) {

                                        User information = new User(
                                                fullName,
                                                userName,
                                                email,
                                                gender);

                                        FirebaseDatabase.getInstance().getReference("User").child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                                .setValue(information).addOnCompleteListener(new OnCompleteListener<Void>() {
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task) {
                                                Toast.makeText(Signup_Form.this, "Registration Complete", Toast.LENGTH_SHORT).show();
                                                startActivity(new Intent(getApplicationContext(), Login_Form.class));
                                            }
                                        });
                                    } else {
                                        Toast.makeText(Signup_Form.this, "Authentication Failed", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
            }
        });
            }
        }