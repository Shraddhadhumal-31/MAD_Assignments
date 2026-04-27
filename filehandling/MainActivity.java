package com.example.filehandling;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

import java.io.*;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btnSave, btnLoad;
    ListView listView;

    ArrayList<String> dataList;
    ArrayAdapter<String> adapter;

    String fileName = "myfile.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            setContentView(R.layout.activity_main);
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Layout Error", Toast.LENGTH_LONG).show();
            return;
        }

        editText = findViewById(R.id.editText);
        btnSave = findViewById(R.id.btnSave);
        btnLoad = findViewById(R.id.btnLoad);
        listView = findViewById(R.id.listView);

        dataList = new ArrayList<>();

        try {
            adapter = new ArrayAdapter<>(
                    this,
                    R.layout.list_item,
                    R.id.txtItem,
                    dataList
            );
        } catch (Exception e) {
            adapter = new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    dataList
            );
        }

        listView.setAdapter(adapter);
        btnSave.setOnClickListener(v -> {
            String text = editText.getText().toString().trim();

            if (!text.isEmpty()) {
                saveData(text);
                editText.setText("");
                Toast.makeText(this, "Saved Successfully", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Enter data first", Toast.LENGTH_SHORT).show();
            }
        });

        btnLoad.setOnClickListener(v -> loadData());
    }

    private void saveData(String text) {
        try {
            FileOutputStream fos = openFileOutput(fileName, MODE_APPEND);
            fos.write((text + "\n").getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Error Saving", Toast.LENGTH_SHORT).show();
        }
    }

    private void loadData() {
        dataList.clear();

        try {
            FileInputStream fis = openFileInput(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            String line;
            while ((line = br.readLine()) != null) {
                dataList.add("• " + line);
            }

            br.close();
            fis.close();

            adapter.notifyDataSetChanged();

        } catch (FileNotFoundException e) {
            Toast.makeText(this, "No Data Found", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
