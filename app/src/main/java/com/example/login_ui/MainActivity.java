package com.example.login_ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signUpButton = findViewById(R.id.sign_up_btn);
        signUpButton.setOnClickListener(view -> {
            // Start the registration activity when the Sign Up button is clicked
            Intent intent = new Intent(MainActivity.this, Registration.class);
            startActivity(intent);
        });
    }
}

