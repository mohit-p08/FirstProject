package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MatrixTranspose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix_transpose);
    }
    public void AddEqual(View view){
        EditText[] e=new EditText[9];
        int[] store1=new int[9];
        int[][] m1=new int[3][3];
        int[] result=new int[9];
        int[][] transpose=new int[3][3];
        int i,j;
        for(j=0;j<9;j++){
            String s="T"+j;
            e[j]=findViewById(getResources().getIdentifier(s,"id",getPackageName()));
        }
        for(j=0;j<9;j++) {
                store1[j] = Integer.parseInt(e[j].getText().toString());
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                m1[i][j]=store1[(i*3)+j];
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                transpose[i][j]=m1[j][i];
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                result[(i*3)+j]=transpose[i][j];
            }
        }

        Intent i1=new Intent(this,Solution.class);
        i1.putExtra("Extra",result);
        startActivity(i1);
    }
}