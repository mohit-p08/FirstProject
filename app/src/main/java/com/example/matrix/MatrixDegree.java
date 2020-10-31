package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MatrixDegree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix_degree);
    }
    public void AddEqual(View view){
        EditText[][] e=new EditText[3][3];
        int[][] store1=new int[3][3];
        int[][] m1=new int[3][3];
        int[][] result=new int[3][3];
        int[] sol=new int[9];
        int i,j,k;
        EditText n = findViewById(R.id.dg);
        int x = Integer.parseInt(n.getText().toString());

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                String s = "T" + i + j;
                e[i][j] = findViewById(getResources().getIdentifier(s, "id", getPackageName()));
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                store1[i][j] = Integer.parseInt(e[i][j].getText().toString());
            }
        }
        if (x==2)
        {
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    for (k = 0; k < 3; k++) {
                        result[i][j] += store1[i][k] * store1[k][j];
                    }
                }
            }
        }
        if (x==3)
        {
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    for (k = 0; k < 3; k++) {
                        m1[i][j] += store1[i][k] * store1[k][j];
                    }
                }
            }
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    for (k = 0; k < 3; k++) {
                        result[i][j] +=m1[i][k] * store1[k][j];
                    }
                }
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                sol[(i * 3) + j] = result[i][j];
            }
        }

        Intent i2=new Intent(this,Solution.class);
        i2.putExtra("Extra",sol);
        startActivity(i2);
    }
}