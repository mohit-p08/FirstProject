package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MatrixTranspose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix_transpose);
    }
    public void AddEqual(View view){
        Intent intent= new Intent(this, Solution.class);
        startActivity(intent);
    }
}