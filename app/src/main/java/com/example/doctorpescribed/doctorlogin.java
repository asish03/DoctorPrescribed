package com.example.doctorpescribed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class doctorlogin extends AppCompatActivity
{
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
    }
//<<<<<<< HEAD
    public void dctloginclks(View view)
    {
        Button drlogin = (Button)findViewById(R.id.dctloginbtn);
        EditText username = (EditText)findViewById(R.id.usernametxt);
        EditText password = (EditText)findViewById(R.id.doctorpwdtxt);
        int counter=3;
        if(username.getText().toString().equals("Asish") && password.getText().toString().equals("password"))
        {
//            correct password body
            Toast.makeText(this, "Redirecting....", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent( this, doctor_nav.class);
            startActivity(intent);
        }else
        {
//            wrong password body
            Toast.makeText(this, "Wrong Credentials..", Toast.LENGTH_SHORT).show();
            username.setVisibility(View.VISIBLE);
            username.setBackgroundColor(Color.parseColor("#ff9999"));
            password.setBackgroundColor(Color.parseColor("#ff9999"));
            counter--;
//            username.setText(Integer.toString(counter));

            if (counter == 0)
            {
                drlogin.setEnabled(false);
            }
        }

    }

//=======
//>>>>>>> parent of 33867ef... login to doctor navigation bar successful
}
