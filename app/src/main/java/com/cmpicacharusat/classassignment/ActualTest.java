package com.cmpicacharusat.classassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class ActualTest extends AppCompatActivity {

    EditText etAName;
    Button btnStest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actual_test);
        etAName = findViewById(R.id.etAName);
        btnStest = findViewById(R.id.btnStest);

        btnStest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar currentTime = Calendar.getInstance();
                int mm = currentTime.get(Calendar.MINUTE);
                int min = getIntent().getIntExtra("tmin", R.id.TestTime);
                if (mm >= min) {
                    etAName.setEnabled(false);
                    btnStest.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Time is Up", Toast.LENGTH_SHORT).show();
                } else {
                    startActivity(new Intent(getApplicationContext(), Test.class));
                    Toast.makeText(getApplicationContext(), "Submitted", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}