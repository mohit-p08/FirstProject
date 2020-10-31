package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Solution extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution);


        Intent i=getIntent();
        TextView ts[]=new TextView[9];
        int result[]=i.getIntArrayExtra("Extra");
        int j;
        String s1[]=new String[9];
        for(j=0;j<9;j++){
            String s="t"+j;
            ts[j]=findViewById(getResources().getIdentifier(s,"id",getPackageName()));
        }
        for(j=0;j<9;j++){
            s1[j]=Integer.toString(result[j]);
        }
        for(j=0;j<9;j++){
            ts[j].setText(s1[j]);
        }
    }
}