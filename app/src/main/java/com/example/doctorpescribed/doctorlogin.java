package com.example.doctorpescribed;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class doctorlogin extends AppCompatActivity {
    private Object doctor_nav;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorlogin);
    }
    public void dctloginclk(View view)
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
//        Intent dctlog = new Intent(this, com.example.doctorpescribed.doctor_nav.class);
//        startActivity(dctlog);

    }

}
