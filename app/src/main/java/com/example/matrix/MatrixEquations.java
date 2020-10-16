package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MatrixEquations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix_equations);
    }
    public void AddEqual(View view){
        EditText[] e1=new EditText[9];
        EditText[] e2=new EditText[3];
        int store1[]=new int[9];
        int store2[]=new int[3];
        int[][] m1=new int[3][3];
        int[][] m2=new int[3][1];
        float result[][]=new float[3][1];

        int i,j;
        for(j=0;j<9;j++){
            String s="E"+j;
            e1[j]=findViewById(getResources().getIdentifier(s,"id",getPackageName()));
        }
        for(j=0;j<3;j++){
            String s="F"+j;
            e2[j]=findViewById(getResources().getIdentifier(s,"id",getPackageName()));
        }
        //Matrix A
        for(j=0;j<9;j++) {
            store1[j] = Integer.parseInt(e1[j].getText().toString());
        }
        //Matrix B
        for(j=0;j<3;j++) {
            store2[j] = Integer.parseInt(e2[j].getText().toString());
        }
        //1D to 2D
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                m1[i][j]=store1[(i*3)+j];
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<1;j++){
                m2[i][j]=store2[i];
            }
        }

        float[][] c1=new float[3][3];
        float det=0;
        //Calculating determinant
        for(i=0;i<3;i++){
            det = det + (m1[0][i]*(m1[1][(i+1)%3]*m1[2][(i+2)%3] - m1[1][(i+2)%3]*m1[2][(i+1)%3]));
        }
        //Calculating Matrix of cofactors, Determinant is divided
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                c1[i][j]=(((m1[(i+1)%3][(j+1)%3] * m1[(i+2)%3][(j+2)%3]) - (m1[(i+1)%3][(j+2)%3]*m1[(i+2)%3][(j+1)%3]))/ det);
            }
        }
        //Transpose of cofactors i.e. Inverse
        float[][] inverse=new float[3][3];
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                inverse[i][j]=c1[j][i];
            }
        }
        //Till here we have calculated the inverse of matrix A
        int k;
        for(i=0;i<3;i++){
            for(j=0;j<1;j++){
                for(k=0;k<3;k++){
                    result[i][j]+=inverse[i][k]*m2[k][j];
                }
            }
        }
        float sol[]=new float[3];
        //2D to 1D
        for(i=0;i<3;i++){
            for(j=0;j<1;j++){
                sol[i]=result[i][j];
            }
        }

        Intent i1=new Intent(this,SolutionEquation.class);
        i1.putExtra("Extra",sol);
        startActivity(i1);

    }
}