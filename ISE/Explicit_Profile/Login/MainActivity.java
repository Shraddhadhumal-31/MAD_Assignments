package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText ename, epassword;
    Button btn1,btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ename = findViewById(R.id.ename);
        epassword = findViewById(R.id.epassword);
        btn1 = findViewById(R.id.btn1);
        btnBack = findViewById(R.id.btnBack);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = ename.getText().toString().trim();
                String pass = epassword.getText().toString().trim();

                if (user.equals("shraddha") && pass.equals("1234")) {

                    Toast.makeText(MainActivity.this,
                            "Login Successful", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent();
                    intent.setClassName(
                            "com.example.user_profile",
                            "com.example.user_profile.MainActivity"
                    );

                    startActivity(intent);
                    finish();


                } else {

                    Toast.makeText(MainActivity.this,
                            "Invalid Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnBack.setOnClickListener(v -> {
            finish();
        });
    }
}
