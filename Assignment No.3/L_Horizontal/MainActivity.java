package com.example.l_horizontal;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnView, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnView = findViewById(R.id.btnView);
        btnBack = findViewById(R.id.btnBack);

        btnView.setOnClickListener(v -> {
            Toast.makeText(this, "Viewing Notification", Toast.LENGTH_SHORT).show();
        });

        btnBack.setOnClickListener(v -> {
            Toast.makeText(this, "Back Pressed", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}
