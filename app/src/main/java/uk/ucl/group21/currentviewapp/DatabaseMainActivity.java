package uk.ucl.group21.currentviewapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class DatabaseMainActivity extends AppCompatActivity {

    DatabaseHelper myDb;

    //create variable for our text and button ;
    EditText editID, editName,editDOB,editDate, editTime,editReasonofCompleting;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_main);
        myDb = new DatabaseHelper(DatabaseMainActivity.this); // calls the constructor


        // *do this for  all variables created
        editID = (EditText) findViewById (R.id.editText_NHSID);
        editName = (EditText) findViewById (R.id.editText_CYPName);
        editDOB = (EditText) findViewById (R.id.editText_DOB);
        editDate = (EditText) findViewById (R.id.editText_DATE);
        editTime = (EditText) findViewById (R.id.editText_TIME);
        editReasonofCompleting = (EditText) findViewById (R.id.editText_REASONofCOMPLETING);
        button = (Button) findViewById(R.id.button);
        AddData();

    }

    public void AddData() {
        button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){ //boolean for : if value is inputted = true otherwise false
                        boolean isInserted = myDb.insertData (editID.getText().toString(),
                                editName.getText().toString(),
                                editDOB.getText().toString(),
                                editDate.getText().toString(),
                                editTime.getText().toString(),
                                editReasonofCompleting.getText().toString());

                        if (isInserted==true) {
                            Toast.makeText(DatabaseMainActivity.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                            // If data insert is successful
                            Intent real = new Intent(DatabaseMainActivity.this,Q1ToQ10.class); //opens the DatabaseMainActivity
                            startActivity(real);
                        }
                        else {
                            Toast.makeText(DatabaseMainActivity.this, "Data Not Inserted", Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // No addition
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }






}