package com.example.samplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    EditText username1;
    EditText password1;
    Button loginbtn;
    TextView tv;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   //admin and admin
    username1= (EditText) findViewById(R.id.username);
    password1=(EditText) findViewById(R.id.password);
  loginbtn=(Button) findViewById(R.id.loginbtn);
        tv = findViewById(R.id.tv);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username1.getText().toString().equals("admin") && password1.getText().equals("12345")) {

                    tv.setText("Login Successful");

                } else
                    tv.setText("");
                Toast.makeText(MainActivity.this, "LOGIN FAILED !!!", Toast.LENGTH_SHORT).show();
            }
        });

    }
    }