package com.cmpicacharusat.classassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etSid,etSname,etSbranch,etSphone,etSbdate;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSid=findViewById(R.id.etSid);
        etSname=findViewById(R.id.etSname);
        etSbranch=findViewById(R.id.etSbranch);
        etSphone=findViewById(R.id.etSphone);
        etSbdate=findViewById(R.id.etSbdate);
        btnSubmit=findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sid=etSid.getText().toString();
                String sname=etSname.getText().toString();
                String sbranch=etSbranch.getText().toString();
                String sphone=etSphone.getText().toString();
                String sbdate=etSbdate.getText().toString();

                Intent i=new Intent(MainActivity.this, StudentData.class);
                i.putExtra("sid",sid);
                i.putExtra("sname",sname);
                i.putExtra("sbranch",sbranch);
                i.putExtra("sphone",sphone);
                i.putExtra("sbdate",sbdate);
                startActivity(i);


            }
        });


    }
}