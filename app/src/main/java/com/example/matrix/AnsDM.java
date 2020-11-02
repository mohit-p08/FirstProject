package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnsDM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ans_d_m);

        Intent i=getIntent();
        TextView t;
        TextView M;
        int det = i.getIntExtra("Extra",0);
        String DM;
        M=findViewById(R.id.M1);
        String n=i.getStringExtra("Hell");
        M.setText(n);


        String s="DM";
        t=findViewById(getResources().getIdentifier(s,"id",getPackageName()));

        DM=Integer.toString(det);

        t.setText(DM);
    }
}