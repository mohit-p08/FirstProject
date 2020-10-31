package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class elaboration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elaboration);

        Intent i=getIntent();
        TextView ts1[]=new TextView[9];
        TextView ts2[]=new TextView[9];
        TextView ts3[]=new TextView[9];
        int result1[]=i.getIntArrayExtra("Matrix1");
        int result2[]=i.getIntArrayExtra("Matrix2");
        int result3[]=i.getIntArrayExtra("Extra");
        String s1[]=new String[9];
        String s3[]=new String[9];
        String s2[]=new String[9];
        int j;
        //
        //Matrix A
        for(j=0;j<9;j++){
            String s="A"+j;
            ts1[j]=findViewById(getResources().getIdentifier(s,"id",getPackageName()));
        }
        for(j=0;j<9;j++){
            s1[j]=Integer.toString(result1[j]);
        }
        for(j=0;j<9;j++){
            ts1[j].setText(s1[j]);
        }
        //Miatrix B
        for(j=0;j<9;j++){
            String s="B"+j;
            ts2[j]=findViewById(getResources().getIdentifier(s,"id",getPackageName()));
        }
        for(j=0;j<9;j++){
            s2[j]=Integer.toString(result2[j]);
        }
        for(j=0;j<9;j++){
            ts2[j].setText(s2[j]);
        }
        //
        //Matrix A
        for(j=0;j<9;j++){
            String s="C"+j;
            ts1[j]=findViewById(getResources().getIdentifier(s,"id",getPackageName()));
        }
        for(j=0;j<9;j++){
            s1[j]=Integer.toString(result1[j]);
        }
        for(j=0;j<9;j++){
            ts1[j].setText(s1[j]);
        }
        //Miatrix B
        for(j=0;j<9;j++){
            String s="D"+j;
            ts2[j]=findViewById(getResources().getIdentifier(s,"id",getPackageName()));
        }
        for(j=0;j<9;j++){
            s2[j]=Integer.toString(result2[j]);
        }
        for(j=0;j<9;j++){
            ts2[j].setText(s2[j]);
        }
        //Result
        //int result[]=i.getIntArrayExtra("Extra");
        for(j=0;j<9;j++){
            String s="F"+j;
            ts3[j]=findViewById(getResources().getIdentifier(s,"id",getPackageName()));
        }
        for(j=0;j<9;j++){
            s3[j]=Integer.toString(result3[j]);
        }
        for(j=0;j<9;j++){
            ts3[j].setText(s3[j]);
        }
    }
}