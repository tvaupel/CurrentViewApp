package uk.ucl.group21.currentviewapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Q11ToQ20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q11_to_q20);}

    public void btnNextQ11to20(View view) {
        Intent intent = new Intent(this,Q21ToQ30.class); //opens the Setting Activity
        startActivity(intent);
    }
}
