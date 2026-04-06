package com.example.constraintlayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnEmail, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEmail = findViewById(R.id.btnEmail);
        btnBack = findViewById(R.id.btnBack);

        btnEmail.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Sending Email...", Toast.LENGTH_SHORT).show();
        });
        btnBack.setOnClickListener(v -> {
            finish();
        });
    }
}
