package uk.ucl.group21.currentviewapp;

import android.content.Intent;
import android.support.annotation.XmlRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

            if(accNumber.getText().toString().equals("user")  && passwordInput.getText().toString().equals("1234")) {
                Intent intent = new Intent(this, Dashboard.class);
                startActivity(intent);
            }
            else {
                System.out.println("Error: Wrong username or password");
                System.out.println(accNumber.getText().toString());
                System.out.println(passwordInput.getText().toString());
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }


    }

}
