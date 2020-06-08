package com.example.doctorpescribed;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.nio.file.Path;

public class new_ac extends AppCompatActivity {

    EditText firstname, lastname, Mobno, Dob, Dept, email, Pwd, cnfpwd;
    Button btnsave;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_ac);

        firstname=findViewById(R.id.edit_fn);
        lastname=findViewById(R.id.edit_ln);
        Mobno=findViewById(R.id.edit_mob);
        Dob=findViewById(R.id.edit_dob);
        Dept=findViewById(R.id.edit_dpt);
        email=findViewById(R.id.edit_email);
        Pwd=findViewById(R.id.edit_pwd);
        cnfpwd=findViewById(R.id.edit_cpwd);
        btnsave=findViewById(R.id.btn_save);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                rootNode= FirebaseDatabase.getInstance();
                reference= rootNode.getReference("userhelper");

                String fname=firstname.getText().toString();
                String lname=lastname.getText().toString();
                String dob=Dob.getText().toString();
                String dept=Dept.getText().toString();
                String mobno=Mobno.getText().toString();
                String username=email.getText().toString();
                String pwd=Pwd.getText().toString();
                String cpwd=cnfpwd.getText().toString();

                userhelper userhelper=new userhelper();

                reference.child(mobno).setValue("First data storage");
            }
        });
    }
}