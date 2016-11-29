package uk.ucl.group21.currentviewapp;

import android.content.Intent;
import android.support.annotation.XmlRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginScreen extends AppCompatActivity {

    @XmlRes public EditText acc_number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
    }

    public void LogIn(View view){


        try {

            if(acc_number.getText().equals("user")) {
                Intent intent = new Intent(this, Dashboard.class);
                startActivity(intent);
            }
            else {
                System.out.println("Error: Wrong username or password");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }


    }

}
