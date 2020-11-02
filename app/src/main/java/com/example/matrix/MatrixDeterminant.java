package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MatrixDeterminant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix_determinant);
    }

    public void AddEqual(View view){
        EditText e[][]=new EditText[3][3];
        int m[][]=new int[3][3];
        int det=0;
        int i,j;

        for(i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                String s = "MD"+i+ j;
                e[i][j] = findViewById(getResources().getIdentifier(s, "id", getPackageName()));
            }
        }
        for(i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                m[i][j] = Integer.parseInt(e[i][j].getText().toString());
            }
        }
        for(i=0;i<3;i++)
        {
            det = det +(m[0][i]*(m[1][(i+1)%3]*m[2][(i+2)%3]-m[1][(i+2)%3]*m[2][(i+1)%3]));
        }

        Intent intent=new Intent(this,AnsDM.class);
        intent.putExtra("Extra",det);
        String os="Determinant =";
        intent.putExtra("Hell",os);
        startActivity(intent);
    }
}