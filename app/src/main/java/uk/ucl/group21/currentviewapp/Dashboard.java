package uk.ucl.group21.currentviewapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Dashboard extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

    }

    // Button activity for Questionnaire Menu (generate new Questionnaire)
    protected void btnNewQuestion(View view){
        Intent intent = new Intent(this, QuestionnaireMenu.class); //opens the Questionnaire Menu Activity
        startActivity(intent);
    }

    // Button activity for previous Questionnaires
    protected void btnPrevQuestion(View view){
        Intent intent = new Intent(this, PreviousQuestionnaires.class); //opens the Previous Questionnaire Activity
        startActivity(intent);
    }

    // Button activity for opening the Help page
    protected void btnHelp(View view){
        Intent intent = new Intent(this, Help.class); //opens the Help Activity
        startActivity(intent);
    }

    // Button activity for directing to settings
    // Can also be discarded when no changeable settings are included.
    protected void btnSetting(View view){
        Intent intent = new Intent(this, Setting.class); //opens the Setting Activity
        startActivity(intent);
    }

}
