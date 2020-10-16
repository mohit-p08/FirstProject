package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MatrixInverse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix_inverse);
    }
    public void AddEqual(View view){
        EditText[] e=new EditText[9];
        int[] store1=new int[9];
        int[][] m1=new int[3][3];
        float[] result=new float[9];
       // int[][] transpose=new int[3][3];
        int i,j;
        for(j=0;j<9;j++){
            String s="M"+j;
            e[j]=findViewById(getResources().getIdentifier(s,"id",getPackageName()));
        }
        for(j=0;j<9;j++) {
            store1[j] = Integer.parseInt(e[j].getText().toString());
        }
        //1D to 2D
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                m1[i][j]=store1[(i*3)+j];
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
        float[][] transpose=new float[3][3];
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                transpose[i][j]=c1[j][i];
            }
        }
        //2D to 1D
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                result[(i*3)+j]=transpose[i][j];
            }
        }

        Intent i1=new Intent(this,Solution2.class);
        i1.putExtra("Extra",result);
        startActivity(i1);
    }
}