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

    protected void nextButton(View view){
        Intent intent = new Intent(this, PreviousQuestionnaires.class); //opens the Dashboard Activity
        startActivity(intent);

    }


}
