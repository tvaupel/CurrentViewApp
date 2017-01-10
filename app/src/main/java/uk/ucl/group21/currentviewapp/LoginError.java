package uk.ucl.group21.currentviewapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LoginError extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_error);
    }

    public void btnRetryLogin(View view){
        Intent intent = new Intent(this, ActivityLogin.class); //opens the Previous Questionnaire Activity
        startActivity(intent);
    }
}
