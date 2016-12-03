package uk.ucl.group21.currentviewapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Q21ToQ30 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q21_to_q30);}

    public void btnNextQ21to30(View view) {
        Intent intent = new Intent(this, Q31ToQ37.class); //opens the Setting Activity
        startActivity(intent);
    }
}