package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MatrixAddition extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix_addition);
    }
    public void AddEqual(View view){
        EditText[][] e=new EditText[2][9];
        int store1[]=new int[9];
        int store2[]=new int[9];
        int result[]=new int[9];
        int i,j;
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
        for(i=0;i<9;i++){
            result[i]=store1[i]+store2[i];
        }


        Intent i1=new Intent(this,Solution.class);
        i1.putExtra("Extra",result);
        startActivity(i1);
    }

    public void Stepbystep(View view){
        EditText[][] e=new EditText[2][9];
        int store1[]=new int[9];
        int store2[]=new int[9];
        int result[]=new int[9];
        int i,j;
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
        for(i=0;i<9;i++){
            result[i]=store1[i]+store2[i];
        }


        Intent i2=new Intent(this,elaboration.class);
        i2.putExtra("Extra",result);
        i2.putExtra("Matrix1",store1);
        i2.putExtra("Matrix2",store2);
        startActivity(i2);
    }
}