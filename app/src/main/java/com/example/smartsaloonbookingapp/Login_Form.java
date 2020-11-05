package com.example.smartsaloonbookingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login_Form extends AppCompatActivity {
    TextInputEditText mEdtEmail, mEdtPassword;
    Button mBtnLogin, mBtnSignup;
    private FirebaseAuth firebaseAuth;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__form);
        getSupportActionBar().setTitle("Login Form");

        mEdtEmail = findViewById(R.id.edt_mail);
        mEdtPassword = findViewById(R.id.edt_password);
        progressBar = findViewById(R.id.progressBar);
        mBtnLogin=findViewById(R.id.btn_login);
        mBtnSignup=findViewById(R.id.btn_register);

        firebaseAuth = FirebaseAuth.getInstance();

        //Login button click event
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String email = mEdtEmail.getText().toString().trim();
                String password = mEdtPassword.getText().toString().trim();

                if (TextUtils.isEmpty(email)){
                    Toast.makeText(Login_Form.this, "Please Enter Email", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)){
                    Toast.makeText(Login_Form.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (password.length()<6){
                    Toast.makeText(Login_Form.this, "Password is too short", Toast.LENGTH_SHORT).show();
                }
                progressBar.setVisibility(View.VISIBLE);

                firebaseAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(Login_Form.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressBar.setVisibility(View.GONE);
                                if (task.isSuccessful()) {
                                    startActivity(new Intent(getApplicationContext(),DashboardActivity.class));
                                    Toast.makeText(Login_Form.this, "Login Complete", Toast.LENGTH_SHORT).show();

                                } else {
                                    Toast.makeText(Login_Form.this, "Login Failed or User not Available", Toast.LENGTH_SHORT).show();

                                }
                            }
                        });
            }
        });

        //Register button click event
        mBtnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Signup_Form.class));
            }
        });
    }


}