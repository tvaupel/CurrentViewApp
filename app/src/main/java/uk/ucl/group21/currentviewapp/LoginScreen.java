package uk.ucl.group21.currentviewapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

    }

    public void LogIn(View view){

        EditText accNumber = (EditText) findViewById(R.id.acc_number);
        EditText passwordInput = (EditText) findViewById(R.id.password_input);
        try {
            if( // Insert comparison with database here
                accNumber.getText().toString().equals("user")  && passwordInput.getText().toString().equals("1234")) {
                Intent intent = new Intent(this, Dashboard.class); //opens the Dashboard Activity
                startActivity(intent);
            }
            else {
                System.out.println("Error: Wrong username or password");
                Intent intent = new Intent(this, LoginError.class); //opens the Error Screen Activity
                startActivity(intent);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
