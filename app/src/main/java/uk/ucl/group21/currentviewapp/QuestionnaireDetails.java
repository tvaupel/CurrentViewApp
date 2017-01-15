package uk.ucl.group21.currentviewapp;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class QuestionnaireDetails extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    //create variable for our text and button ;
    EditText editID, editName, editDOB, editDate, editTime, editReason;
    Button btnOverview, btnSection;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire_details);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        myDb = new DatabaseHelper(QuestionnaireDetails.this); // calls the constructor


        // *do this for  all variables created
        editID = (EditText) findViewById (R.id.editText_NHSID);
        editName = (EditText) findViewById (R.id.editText_CYPName);
        editDOB = (EditText) findViewById (R.id.editText_DOB);
        editDate = (EditText) findViewById (R.id.editText_DATE);
        editTime = (EditText) findViewById (R.id.editText_TIME);
        editReason = (EditText) findViewById (R.id.editText_REASONofCOMPLETING);
        btnOverview = (Button) findViewById(R.id.btnOverview);
        btnSection = (Button) findViewById(R.id.btnSection);
        AddData();
    }

    public void AddData() {
        btnOverview.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){

                        boolean isInserted = myDb.insertQuestionnaireDetail (
                                editName.getText().toString(),
                                editID.getText().toString(),
                                editDOB.getText().toString(),
                                editDate.getText().toString(),
                                editReason.getText().toString() );

                        if (isInserted) {
                            Toast.makeText(QuestionnaireDetails.this, "Data Inserted", Toast.LENGTH_LONG).show();
                            // If data insertion is successful
                            ////////////////
                            //////////////
                            // OVERVIEW LINK
                            //////////////
                            ////////////////
                            Intent real = new Intent(QuestionnaireDetails.this,Q1ToQ10.class); //opens the DatabaseMainActivity
                            startActivity(real);
                        }
                        else {
                            Toast.makeText(QuestionnaireDetails.this, "Data Not Inserted", Toast.LENGTH_LONG).show();
                        }

                    }
                }
        );


        btnSection.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){

                        boolean isInserted = myDb.insertQuestionnaireDetail (
                                editName.getText().toString(),
                                editID.getText().toString(),
                                editDOB.getText().toString(),
                                editDate.getText().toString(),
                                editReason.getText().toString()
                        );

                        if (isInserted) {
                            Toast.makeText(QuestionnaireDetails.this, "Data Inserted", Toast.LENGTH_LONG).show();
                            // If data insertion is successful
                            Intent real = new Intent(QuestionnaireDetails.this,Q1ToQ10.class); //opens the DatabaseMainActivity
                            startActivity(real);
                        }
                        else {
                            Toast.makeText(QuestionnaireDetails.this, "Data Not Inserted", Toast.LENGTH_LONG).show();
                        }

                    }
                }
        );
    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nav_logout, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.logout) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        if (id == R.id.nav_dashboard) {
            Intent intent = new Intent(this, Dashboard.class); //opens the Dashboard
            startActivity(intent);

        } else if (id == R.id.nav_new_questionnaire) {
            drawer.closeDrawer(GravityCompat.START);

        } else if (id == R.id.nav_previous_questionnaire) {
            Intent intent = new Intent(this, PreviousQuestionnaires.class); //opens the Previous Questionnaire Activity
            startActivity(intent);

        } else if (id == R.id.nav_help) {
            Intent intent = new Intent(this, Help.class); //opens the Help Activity
            startActivity(intent);

        } else if (id == R.id.nav_logout) {
            Intent intent = new Intent(this, LoginScreen.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            super.finish();
            startActivity(intent);
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void btnOverview(View view){
        Intent intent = new Intent(this, QuestionnaireDetails.class); //opens the questionnaire activity
        startActivity(intent);
    }
    public void btnSectionBySection(View view){
        Intent intent = new Intent(this, Q1ToQ10.class); //opens the questionnaire activity
        startActivity(intent);
    }
}
