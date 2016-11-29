package uk.ucl.group21.currentviewapp;

import android.content.Intent;
import android.support.annotation.XmlRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginScreen extends AppCompatActivity {

    private final static Logger LOGGER = Logger.getLogger(LoginScreen.class.getName());
    private static FileHandler fileTxt;


    public void setup() throws IOException {
        LOGGER.setLevel(Level.WARNING);
        LOGGER.setUseParentHandlers(false);
        fileTxt = new FileHandler("LoginScreen_LOG.txt");
        LOGGER.addHandler(fileTxt);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try{
            setup();
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, ex.getStackTrace().toString(), ex);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        LOGGER.log(Level.INFO, "Login Screen has been created");
    }

    public void LogIn(View view){


        EditText accNumber = (EditText) findViewById(R.id.acc_number);
        EditText passwordInput = (EditText) findViewById(R.id.password_input);
        LOGGER.log(Level.INFO, "Login Button was pressed and has the following details input: AccNumber "
                + accNumber.getText().toString() + " and Password " +passwordInput.getText().toString());
        try {
            if( // Insert comparison with database here
                accNumber.getText().toString().equals("user")  && passwordInput.getText().toString().equals("1234")) {
                Intent intent = new Intent(this, QuestionnaireMenu.class); //opens the Dashboard Activity
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
