package uk.ucl.group21.currentviewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QuestionnaireMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire_menu);
    }

    public void nextButton(View view){
        Intent intent = new Intent(this, Q1ToQ10.class); //opens the Dashboard Activity
        startActivity(intent);

    }
    // Button activity for Section by Section page
    public void btnQM2SBS(View view){
        Intent intent = new Intent(this, DatabaseMainActivity.class); //opens the Help Activity
        startActivity(intent);
    }
    public void btnQM1OV(View view){
        Intent intent = new Intent(this, Questionnaire_Overview.class); //opens the Help Activity
        startActivity(intent);
    }






}
