package com.abhilasha.androidclass.assignmetone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class registrationform extends AppCompatActivity {

    EditText name,email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrationform);
        name= findViewById(R.id.name);
        email= findViewById(R.id.email);
        password= findViewById(R.id.password);

    }

    public void openDataActivity(View view)
    {
        String Name= name.getText().toString();
        String Email= email.getText().toString();
        String Password= password.getText().toString();

        Intent intent =new Intent(registrationform.this,DataActivity.class);

        intent.putExtra("name",Name);
        intent.putExtra("email",Email);
        intent.putExtra("password",Password);

        startActivity(intent);


    }
}