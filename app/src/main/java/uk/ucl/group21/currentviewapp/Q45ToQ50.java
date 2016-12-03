package uk.ucl.group21.currentviewapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Q45ToQ50 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q45_to_q50);}

    public void btnDoneQ45to50(View view) {
        Intent intent = new Intent(this, QuestionnaireMenu.class); //diverts back to the Dashboard screen.
        startActivity(intent);
    }
}