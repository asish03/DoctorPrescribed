package com.example.doctorpescribed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class doctorlogin extends AppCompatActivity {
    private Object doctor_nav;

    public void dctloginclk(View view)
    {
        Intent dctlog = new Intent(this,doctor_nav.getClass());
        startActivity(dctlog);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorlogin);
    }
}
