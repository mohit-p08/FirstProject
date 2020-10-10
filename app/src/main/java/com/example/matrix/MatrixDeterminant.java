package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MatrixDeterminant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix_determinant);
    }
    public void AddEqual(View view){
        Intent intent=new Intent(this,Solution.class);
        startActivity(intent);
    }

}