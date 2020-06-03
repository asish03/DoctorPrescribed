package com.example.doctorpescribed;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class doctorlogin extends AppCompatActivity
{
    public EditText username,password;
    Button btnlogin;
    FirebaseAuth mFirebaseAuth;
    private  FirebaseAuth.AuthStateListener mAuthlistener;

    private Object doctor_nav;

    public void dr_forgot_password(View view)
    {
        Intent dr_forgt_pass = new Intent(this,dr_password_reset.class);
        startActivity(dr_forgt_pass);

    }

    public void dr_create_account(View view)
    {
        Intent dr_reg = new Intent(this,new_ac.class);
        startActivity(dr_reg);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_login);

        mFirebaseAuth = FirebaseAuth.getInstance();
        username = findViewById(R.id.usernametxt);
        password = findViewById(R.id.doctorpwdtxt);
        btnlogin = findViewById(R.id.dctloginbtn);
        mAuthlistener = new FirebaseAuth.AuthStateListener() {

            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser mFirebaseUser = mFirebaseAuth.getCurrentUser();
                if (mFirebaseUser != null) {
                    Toast.makeText(doctorlogin.this, "You are logged in", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(doctorlogin.this, doctor_nav.class);
                    startActivity(i);

                } else {
                    Toast.makeText(doctorlogin.this, "Please Login", Toast.LENGTH_SHORT).show();
                }
            }
        };
        btnlogin.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=username.getText().toString();
                String pwd=password.getText().toString();
                if(email.isEmpty()) {
                    username.setError("Please enter email id");
                    username.requestFocus();
                }
                else if (pwd.isEmpty()){
                    password.setError("Please enter your password");
                    password.requestFocus();
                }
                else if (email.isEmpty() && pwd.isEmpty()){
                    Toast.makeText(doctorlogin.this,"Fields are Empty!",Toast.LENGTH_SHORT);
                }
                else if (!(email.isEmpty() && pwd.isEmpty()))
                {
                    mFirebaseAuth.signInWithEmailAndPassword(email,pwd).addOnCompleteListener(doctorlogin.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!(task.isSuccessful())){
                                Toast.makeText(doctorlogin.this, "Login Error, Please Login Again", Toast.LENGTH_SHORT).show();
                            }
                            else {
                                Intent intToHome = new Intent(doctorlogin.this, doctor_nav.class);
                                startActivity(intToHome);
                            }
                        }
                    });
                }
                else{
                    Toast.makeText(doctorlogin.this, "Error Occured!", Toast.LENGTH_SHORT).show();

                }
            }

        }));

    }
    protected void onstart()
    {
        super.onStart();
        mFirebaseAuth.addAuthStateListener(mAuthlistener);
    }
}
