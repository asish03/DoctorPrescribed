package com.example.doctorpescribed;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class patientlogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientlogin);
    }
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void clkpatientlogin(View view)
    {
        Button patlogin = (Button)findViewById(R.id.patloginbtn);
        EditText username = (EditText)findViewById(R.id.pataadhar);
        EditText dob = (EditText)findViewById(R.id.patdob);
//        CalendarView dob = (CalendarView) findViewById(R.id.patdob);
        int counter=3;
        if(username.getText().toString().equals("123456789") && dob.getText().toString().equals( "10/10/2020"))
        {
//            correct password body
            Toast.makeText(this, "Redirecting....", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent( this, patient_nav.class);
            startActivity(intent);
        }else
        {
//            wrong password body
            Toast.makeText(this, "Wrong Credentials..", Toast.LENGTH_SHORT).show();
            username.setVisibility(View.VISIBLE);
            username.setBackgroundColor(Color.parseColor("#ff9999"));
            dob.setBackgroundColor(Color.parseColor("#ff9999"));
            counter--;
//            username.setText(Integer.toString(counter));

            if (counter == 0)
            {
                patlogin.setEnabled(false);
            }
        }
    }
}
