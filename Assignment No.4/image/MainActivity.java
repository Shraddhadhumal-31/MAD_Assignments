package com.example.image;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView img1, img2, img3;
    View layout;
    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.mainLayout);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        backBtn = findViewById(R.id.backBtn);

        img1.setOnClickListener(v -> layout.setBackgroundColor(Color.RED));
        img2.setOnClickListener(v -> layout.setBackgroundColor(Color.GREEN));
        img3.setOnClickListener(v -> layout.setBackgroundColor(Color.YELLOW));

        backBtn.setOnClickListener(v -> {
            Toast.makeText(this, "Back Pressed", Toast.LENGTH_SHORT).show();
            finish(); 
        });
    }
}
