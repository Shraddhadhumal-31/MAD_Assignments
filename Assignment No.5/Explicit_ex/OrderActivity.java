package com.example.explicit_ex;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity {

    TextView tvOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        tvOrder = findViewById(R.id.tvOrder);

        String food = getIntent().getStringExtra("FOOD_ITEM");

        tvOrder.setText("Your order: " + food + " is placed successfully!");
    }
}