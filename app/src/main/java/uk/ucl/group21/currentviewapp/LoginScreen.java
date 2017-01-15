package uk.ucl.group21.currentviewapp;

import android.content.Intent;
import android.database.DataSetObservable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class LoginScreen extends AppCompatActivity {
    DatabaseHelper myDB;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        resetLogin();
        myDB = new DatabaseHelper(this);

    }

    private void resetLogin(){
        // resets the content of the EditText boxes.
        EditText accNumber = (EditText) findViewById(R.id.acc_number);
        EditText passwordInput = (EditText) findViewById(R.id.password_input);
        accNumber.setText("");
        passwordInput.setText("");

    }

    @Override
    public void onBackPressed() {
        //what it should do on back
        System.exit(1);
    }


    public void LogIn(View view){

        EditText accNumber = (EditText) findViewById(R.id.acc_number);
        EditText passwordInput = (EditText) findViewById(R.id.password_input);
        try {
            if( // Insert comparison with database here

                accNumber.getText().toString().equals("user")  && passwordInput.getText().toString().equals("1234")) {
                Intent intent = new Intent(this, Dashboard.class); //opens the Dashboard Activity
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                resetLogin();
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
