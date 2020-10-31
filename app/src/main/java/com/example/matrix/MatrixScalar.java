package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MatrixScalar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix_scalar);
    }
    public void AddEqual(View view){
        EditText e[]=new EditText[9];
        int read1[]=new int[9];

        int result[]=new int[9];
        int i,j;
        EditText n = findViewById(R.id.sm);
        Double x = Double.parseDouble(n.getText().toString());

        for(j=0;j<9;j++){
            String s="SM"+j;
            e[j]=findViewById(getResources().getIdentifier(s,"id",getPackageName()));
        }
        for(j=0;j<9;j++)
        {
            read1[j]=Integer.parseInt(e[j].getText().toString());
        }
        for(j=0;j<9;j++) {
            result[j] = (int) (read1[j]*x);
        }
        Intent intent=new Intent(this,Solution.class);
        intent.putExtra("Extra",result);
        startActivity(intent);
    }
}