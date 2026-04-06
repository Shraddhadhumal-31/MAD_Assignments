package com.example.absolutelayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etName, etAge, etMobile;
    Button btnSubmit, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etAge = findViewById(R.id.etAge);
        etMobile = findViewById(R.id.etMobile);
        btnSubmit = findViewById(R.id.btnSubmit);
        back = findViewById(R.id.back);

        btnSubmit.setOnClickListener(v -> {

            String name = etName.getText().toString();
            String age = etAge.getText().toString();
            String mobile = etMobile.getText().toString();

            if (name.isEmpty() || age.isEmpty() || mobile.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this,
                        "Name: " + name + "\nAge: " + age + "\nMobile: " + mobile,
                        Toast.LENGTH_LONG).show();
            }
        });
        back.setOnClickListener(v -> {
            Toast.makeText(this, "Back Pressed", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}
