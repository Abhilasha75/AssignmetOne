package com.abhilasha.androidclass.assignmetone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DataActivity extends AppCompatActivity {

    TextView name,email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        Toast.makeText(this, "WELCOME!!", Toast.LENGTH_SHORT).show();


        name= findViewById(R.id.textname);
        email= findViewById(R.id.email);
        password= findViewById(R.id.password);

        Intent intent= getIntent();
        String d_name=intent.getStringExtra("name");
        String d_email=intent.getStringExtra("email");
        String d_password=intent.getStringExtra("password");


        name.setText(d_name);
        email.setText(d_email);
        password.setText(d_password);



    }
}