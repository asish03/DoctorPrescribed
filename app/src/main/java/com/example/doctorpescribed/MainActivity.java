package com.example.doctorpescribed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    public void doctorclk(View view)
    {
        Intent dct = new Intent(this, doctorlogin.class);
        startActivity(dct);
    }
    public void patientclk(View view)
    {
        Intent pat = new Intent(this, patientlogin.class);
        startActivity(pat);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
