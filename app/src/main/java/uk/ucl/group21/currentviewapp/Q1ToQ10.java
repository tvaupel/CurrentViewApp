package uk.ucl.group21.currentviewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Q1ToQ10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1_to10);}

    public void btnNextQ1to10(View view){
        Intent intent = new Intent(this, Q11ToQ20.class); //opens the Setting Activity
        startActivity(intent);
    }
    }

