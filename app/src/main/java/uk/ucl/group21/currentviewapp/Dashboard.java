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

    protected void nextButton(View view){
        Intent intent = new Intent(this, QuestionnaireMenu.class); //opens the Questionnaire Menu Activity
        startActivity(intent);
    }



}
