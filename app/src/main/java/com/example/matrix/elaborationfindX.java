package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class elaborationfindX extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elaborationfind_x);
        Intent i=getIntent();
        TextView ts1[]=new TextView[9];
        TextView ts2[]=new TextView[9];
        int result1[]=i.getIntArrayExtra("MatrixA");
        int result2[]=i.getIntArrayExtra("MatrixB");
        //int result3[]=i.getIntArrayExtra("Extra");
        //
        String s1[]=new String[9];
        String s2[]=new String[9];
        int j;
        //
        //Matrix A
        for(j=0;j<9;j++){
            String s="K"+j;
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
            String s="k"+j;
            ts2[j]=findViewById(getResources().getIdentifier(s,"id",getPackageName()));
        }
        for(j=0;j<9;j++){
            s2[j]=Integer.toString(result2[j]);
        }
        for(j=0;j<9;j++){
            ts2[j].setText(s2[j]);
        }
    }
}