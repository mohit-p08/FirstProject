package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MatrixRank extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix_rank);
    }

    EditText e[][]=new EditText[3][3];
    int mat[][]=new int[3][3];
    int rank = 3;

    int i,j;

    public void AddEqual(View view){

        for(i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                String s = "MR"+i+ j;
                e[i][j] = findViewById(getResources().getIdentifier(s, "id", getPackageName()));
            }
        }
        for(i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                mat[i][j] = Integer.parseInt(e[i][j].getText().toString());
            }
        }
        rank = RankOfMatrix(mat);
        Intent intent=new Intent(this,AnsDM.class);
        intent.putExtra("Extra",rank);
        String os="Rank =";
        intent.putExtra("Hell",os);
        startActivity(intent);
    }

    private int RankOfMatrix(int mat[][]) {

        for (int row=0;row<rank;row++){
            if(mat[row][row]!=0){
                for(int col=0;col<3;col++){
                    if (col!=row){
                        double mult=(double)mat[col][row]/mat[row][row];

                        for (i=0;i<rank;i++)
                            mat[col][i]-=mult*mat[row][i];
                    }
                }
            }
            else{
                boolean reduce=true;

                for(i=row+1;i<3;i++){
                    if (mat[i][row]!=0){
                        for (j=0;j<rank;j++){
                            int temp = mat[row][j];
                            mat[row][j]=mat[i][j];
                            mat[i][j]=temp;
                        }
                        reduce=false;
                        break;
                    }
                }
                if(reduce){
                    rank--;

                    for (i=0;i<3;i++){
                        mat[i][row]=mat[i][rank];
                    }
                }
                row--;
            }
        }
        return rank;
    }
}