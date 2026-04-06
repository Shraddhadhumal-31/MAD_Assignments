package com.example.linearlayout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnBack = findViewById(R.id.btnBack);

        btnLogin.setOnClickListener(v -> {

            String username = etUsername.getText().toString().trim();
            String password = etPassword.getText().toString().trim();

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please enter all fields", Toast.LENGTH_SHORT).show();
            }
            else if (username.equals("shraddha") && password.equals("1234")) {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
            }
        });

        btnBack.setOnClickListener(v -> {
            Toast.makeText(this, "Back Pressed", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}
