package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Solution2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution2);


        Intent i=getIntent();
        TextView ts[]=new TextView[9];
        float result[]=i.getFloatArrayExtra("Extra");
        DecimalFormat decimalFormat=new DecimalFormat("#.00");
        int j;
        String s1[]=new String[9];
        for(j=0;j<9;j++){
            String s="t"+j;
            ts[j]=findViewById(getResources().getIdentifier(s,"id",getPackageName()));
        }
        for(j=0;j<9;j++){
            s1[j]=Float.toString(Float.parseFloat(decimalFormat.format(result[j])));
        }
        for(j=0;j<9;j++){
            ts[j].setText(s1[j]);
        }
    }
}