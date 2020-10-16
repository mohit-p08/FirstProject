package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MatrixMultiplier extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix_multiplier);
    }
    public void AddEqual(View view){
        EditText[][] e=new EditText[2][9];
        int[] store1=new int[9];
        int[] store2=new int[9];
        int[][] m1=new int[3][3];
        int[][] m2=new int[3][3];
        int[][] result=new int[3][3];
        int[] sol=new int[9];
        int i,j,k;

        for(i=0;i<2;i++){
            for(j=0;j<9;j++){
                String s="T"+i+j;
                e[i][j]=findViewById(getResources().getIdentifier(s,"id",getPackageName()));
            }
        }

        for(i=0;i<2;i++){
            for(j=0;j<9;j++){
                if(i==0){
                    store1[j]=Integer.parseInt(e[i][j].getText().toString());
                }
                if(i==1){
                    store2[j]=Integer.parseInt(e[i][j].getText().toString());
                }
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                m1[i][j]=store1[(i*3)+j];
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                m2[i][j]=store2[(i*3)+j];
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                for(k=0;k<3;k++){
                    result[i][j]+=m1[i][k]*m2[k][j];
                }
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                sol[(i*3)+j]=result[i][j];
            }
        }


        Intent i2=new Intent(this,Solution.class);
        i2.putExtra("Extra",sol);
        startActivity(i2);
    }

}