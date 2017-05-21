package com.korosmatick.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        final TextView etUsername = (TextView) findViewById(R.id.username);
        final TextView etAge = (TextView) findViewById(R.id.age);

        final TextView WelcomeMessage = (TextView) findViewById(R.id.tvWelcomeMsg);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String username = intent.getStringExtra("username");
        int age = intent.getIntExtra("age", 0);

        String message = name + "welcome to your home page";
        WelcomeMessage.setText(message);
        etUsername.setText(username);
        etAge.setText(String.valueOf(age));
    }
}
