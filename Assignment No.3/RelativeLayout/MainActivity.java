package com.example.relativelayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnCenter, btnTop, btnBottom, btnLeft, btnRight, btnBottomLeft, btnBottomRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnCenter = findViewById(R.id.btnCenter);
        btnTop = findViewById(R.id.btnTop);
        btnBottom = findViewById(R.id.btnBottom);
        btnLeft = findViewById(R.id.btnLeft);
        btnRight = findViewById(R.id.btnRight);
        btnBottomLeft = findViewById(R.id.btnBottomLeft);
        btnBottomRight = findViewById(R.id.btnBottomRight);

        btnCenter.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Center Button Clicked", Toast.LENGTH_SHORT).show()
        );

        btnTop.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Top Button Clicked", Toast.LENGTH_SHORT).show()
        );

        btnBottom.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Bottom Button Clicked", Toast.LENGTH_SHORT).show()
        );

        btnLeft.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Left Button Clicked", Toast.LENGTH_SHORT).show()
        );

        btnRight.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Right Button Clicked", Toast.LENGTH_SHORT).show()
        );

        btnBottomLeft.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Bottom Left Button Clicked", Toast.LENGTH_SHORT).show()
        );

        btnBottomRight.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Bottom Right Button Clicked", Toast.LENGTH_SHORT).show()
        );
    }
}
