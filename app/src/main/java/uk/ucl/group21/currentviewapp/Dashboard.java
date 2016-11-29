package uk.ucl.group21.currentviewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

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
