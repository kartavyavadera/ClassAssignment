package com.cmpicacharusat.classassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class StudentData extends AppCompatActivity {

    TextView tvSid,tvSname,tvSbranch,tvSphone,tvSbdate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_data);

        Intent j=getIntent();
        String sid=j.getStringExtra("sid");
        String sname=j.getStringExtra("sname");
        String sbranch=j.getStringExtra("sbranch");
        String sphone=j.getStringExtra("sphone");
        String sbdate=j.getStringExtra("sbdate");

        tvSid=findViewById(R.id.tvSid);
        tvSname=findViewById(R.id.tvSname);
        tvSphone=findViewById(R.id.tvSphone);
        tvSbranch=findViewById(R.id.tvSbranch);
        tvSbdate=findViewById(R.id.tvSbdate);

        tvSid.setText(sid);
        tvSname.setText(sname);
        tvSphone.setText(sphone);
        tvSbranch.setText(sbranch);
        tvSbdate.setText(sbdate );


    }
}