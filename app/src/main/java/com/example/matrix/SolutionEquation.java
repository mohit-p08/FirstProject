package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class SolutionEquation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution_equation);

        Intent i =getIntent();
        TextView ts[]=new TextView[3];
        float result[]=i.getFloatArrayExtra("Extra");
        DecimalFormat decimalFormat=new DecimalFormat("#.000");
        int j;
        String s1[]=new String[3];
        for(j=0;j<3;j++){
            String s="J"+j;
            ts[j]=findViewById(getResources().getIdentifier(s,"id",getPackageName()));
        }
        for(j=0;j<3;j++){
            s1[j]=Float.toString(Float.parseFloat(decimalFormat.format(result[j])));
        }
        for(j=0;j<3;j++){
            ts[j].setText(s1[j]);
        }
    }

}