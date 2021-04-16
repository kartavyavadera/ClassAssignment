package com.cmpicacharusat.classassignment;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class Test extends AppCompatActivity {

    EditText TestTitle, TestName;
    DatePicker TestDate;
    TimePicker TestTime;
    Button btnCtest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        TestTitle = findViewById(R.id.TestTitle);
        TestName = findViewById(R.id.TestName);
        TestDate = findViewById(R.id.TestDate);
        TestTime = findViewById(R.id.TestTime);
        btnCtest = findViewById(R.id.btnCtest);


        btnCtest.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                int hr = TestTime.getHour();
                int min = TestTime.getMinute();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(getBaseContext(), ActualTest.class);
                        intent.putExtra("thr", hr);
                        intent.putExtra("tmin", min);
                        startActivity(intent);
                    }
                }, 1000);
            }
        });
    }
}