package com.example.tablelayout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etTime, etFirstName, etLastName;
    RatingBar ratingBar;
    Button btnSubmit, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTime = findViewById(R.id.etTime);
        etFirstName = findViewById(R.id.etFirstName);
        etLastName = findViewById(R.id.etLastName);
        ratingBar = findViewById(R.id.ratingBar);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnBack = findViewById(R.id.btnBack);

        btnSubmit.setOnClickListener(v -> {
            String time = etTime.getText().toString();
            String fname = etFirstName.getText().toString();
            String lname = etLastName.getText().toString();
            float rating = ratingBar.getRating();

            if (time.isEmpty() || fname.isEmpty() || lname.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this,
                        "Time: " + time +
                                "\nName: " + fname + " " + lname +
                                "\nRating: " + rating,
                        Toast.LENGTH_LONG).show();
            }
        });

        btnBack.setOnClickListener(v -> {
            Toast.makeText(this, "Back Pressed", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}
