package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Addition(View view){
        Intent intent= new Intent(this, MatrixAddition.class);
        startActivity(intent);
    }
    public void Subtraction(View view){
        Intent intent= new Intent(this, MatrixSubtraction.class);
        startActivity(intent);
    }
    public void ScalarMultiplication(View view){
        Intent intent = new Intent(this, MatrixScalar.class);
        startActivity(intent);
    }
    public void MatrixMultiplication(View view){
        Intent intent = new Intent(this, MatrixMultiplier.class);
        startActivity(intent);
    }
    public void Inverse(View view){
        Intent intent= new Intent(this, MatrixInverse.class);
        startActivity(intent);
    }
    public void Determinant(View view){
        Intent intent= new Intent(this, MatrixDeterminant.class);
        startActivity(intent);
    }
    public void Transpose(View view){
        Intent intent= new Intent(this, MatrixTranspose.class);
        startActivity(intent);
    }
    public void Degree(View view){
        Intent intent= new Intent(this, MatrixDegree.class);
        startActivity(intent);
    }
    public void Rank(View view){
        Intent intent= new Intent(this, MatrixRank.class);
        startActivity(intent);
    }
    public void FindX(View view){
        Intent intent= new Intent(this, MatrixFindX.class);
        startActivity(intent);
    }
    public void Equations(View view){
        Intent intent= new Intent(this, MatrixEquations.class);
        startActivity(intent);
    }
}