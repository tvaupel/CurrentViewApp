package uk.ucl.group21.currentviewapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PreviousQuestionnaires extends AppCompatActivity implements OnItemSelectedListener{


    private final static Logger LOGGER = Logger.getLogger(LoginScreen.class.getName());
    private static FileHandler fileTxt;

    public void setup() throws IOException {
        LOGGER.setLevel(Level.WARNING);
        LOGGER.setUseParentHandlers(false);
        fileTxt = new FileHandler("PrevQuestionnaires_LOG.txt");
        LOGGER.addHandler(fileTxt);
    }



    public void onCreate(Bundle savedInstanceState) {
        try{
            setup();
        } catch (IOException ex){
            LOGGER.log(Level.SEVERE, ex.getStackTrace().toString(), ex);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_questionnaires);

        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<>();
        categories.add("Practitioner First Name A-Z");
        categories.add("Practitioner First Name Z-A");
        categories.add("Patient First Name A-Z");
        categories.add("Patient First Name Z-A");
        categories.add("Date Created Newest First");
        categories.add("Date Created Oldest First");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

        LOGGER.log(Level.INFO, "Previous Questionnaires Screen has been created");
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }


}
