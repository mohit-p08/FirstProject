package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MatrixFindX extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix_find_x);
    }
    public void AddEqual(View view){
        EditText[][] e=new EditText[2][9];
        int store1[]=new int[9];
        int store2[]=new int[9];
        float[][] result=new float[3][3];
        int[][] m1=new int[3][3];
        int[][] m2=new int[3][3];
        float[] sol=new float[9];
        int i,j,k;
        for(i=0;i<2;i++){
            for(j=0;j<9;j++){
                String s="X"+i+j;
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
        //1D to 2D array
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
        //calculating inverse of A
        float[][] c1=new float[3][3];
        //Determinant
        float det=0;
        for(i=0;i<3;i++){
            det = det + (m1[0][i]*(m1[1][(i+1)%3]*m1[2][(i+2)%3] - m1[1][(i+2)%3]*m1[2][(i+1)%3]));
        }
        //Cofactors
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                c1[i][j]=(((m1[(i+1)%3][(j+1)%3] * m1[(i+2)%3][(j+2)%3]) - (m1[(i+1)%3][(j+2)%3]*m1[(i+2)%3][(j+1)%3]))/ det);
            }
        }
        //Transpose of cofactors i.e. Adjoint
        float[][] transpose=new float[3][3];
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                transpose[i][j]=c1[j][i];
            }
        }
        //X=A^-1*B
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                for(k=0;k<3;k++){
                    result[i][j]+=transpose[i][k]*m2[k][j];
                }
            }
        }
        //2D to 1D
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                sol[(i*3)+j]=result[i][j];
            }
        }

        Intent i1=new Intent(this,Solution2.class);
        i1.putExtra("Extra",sol);
        startActivity(i1);
    }



    public void Stepbystep(View view){
        EditText[][] e=new EditText[2][9];
        int store1[]=new int[9];
        int store2[]=new int[9];
        float[][] result=new float[3][3];
        int[][] m1=new int[3][3];
        int[][] m2=new int[3][3];
        float[] sol=new float[9];
        int i,j,k;
        for(i=0;i<2;i++){
            for(j=0;j<9;j++){
                String s="X"+i+j;
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


        Intent ix=new Intent(this,elaborationfindX.class);
        ix.putExtra("MatrixA",store1);
        ix.putExtra("MatrixB",store2);
        startActivity(ix);
    }

}