package com.example.portfolio;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEdit = findViewById(R.id.btnEdit);

        btnEdit.setOnClickListener(v -> {
            Toast.makeText(this, "Edit Profile Clicked", Toast.LENGTH_SHORT).show();
        });
    }
}
