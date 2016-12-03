package uk.ucl.group21.currentviewapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Q38ToQ44 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q38_to_q44);}

    public void btnNextQ38to44(View view) {
        Intent intent = new Intent(this, Q45ToQ50.class); //opens the next set of questions
        startActivity(intent);
    }

}