package uk.ucl.group21.currentviewapp.currentviewapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RadioGroup;

import com.aditya.adityapc.sqliteloginregistrationexample.R;

public class Q45ToQ50 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ProgressBar pb;
    RadioGroup Q45rg, Q46rg, Q47rg, Q48rg, Q49rg, Q50rg;

    boolean Q45rgAnswered, Q46rgAnswered, Q47rgAnswered, Q48rgAnswered, Q49rgAnswered;
    boolean Q50rgAnswered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q45_to_q50);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    Q45rg=(RadioGroup)findViewById(R.id.Q45radiogroup);

    Q46rg=(RadioGroup)

    findViewById(R.id.Q46radiogroup);

    Q47rg=(RadioGroup)

    findViewById(R.id.Q47radiogroup);

    Q48rg=(RadioGroup)

    findViewById(R.id.Q48radiogroup);

    Q49rg=(RadioGroup)

    findViewById(R.id.Q49radiogroup);

    Q50rg=(RadioGroup)

    findViewById(R.id.Q50radiogroup);

        /*to display progress value send by the previous screen*/
    pb=(ProgressBar)

    findViewById(R.id.progress1);


    Bundle bundle = getIntent().getExtras().getBundle("progressBundle");

    int progressValue = bundle.getInt("progressValue");

    pb.setProgress(progressValue);


    Q45rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()

    {

        @Override
        public void onCheckedChanged (RadioGroup radioGroup, int selectedId){
        if (!Q45rgAnswered) {
            pb.setProgress(pb.getProgress() + 2);
            Q45rgAnswered = true;
        }
    }
    }

    );

    Q46rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()

    {

        @Override
        public void onCheckedChanged (RadioGroup radioGroup, int selectedId){


        if (!Q46rgAnswered) {
            pb.setProgress(pb.getProgress() + 2);
            Q46rgAnswered = true;
        }
    }
    }

    );

    Q47rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()

    {


        @Override
        public void onCheckedChanged (RadioGroup radioGroup, int selectedId){


        if (!Q47rgAnswered) {
            pb.setProgress(pb.getProgress() + 2);
            Q47rgAnswered = true;
        }
    }
    }

    );

    Q48rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()

    {


        @Override
        public void onCheckedChanged (RadioGroup radioGroup, int selectedId){

        if (!Q48rgAnswered) {
            pb.setProgress(pb.getProgress() + 2);
            Q48rgAnswered = true;
        }
    }
    }

    );

    Q49rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()

    {


        @Override
        public void onCheckedChanged (RadioGroup radioGroup, int selectedId){

        if (!Q49rgAnswered) {
            pb.setProgress(pb.getProgress() + 2);
            Q49rgAnswered = true;
        }
    }
    }

    );


    Q50rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()

    {


        @Override
        public void onCheckedChanged (RadioGroup radioGroup, int selectedId){
        if (!Q50rgAnswered) {
            pb.setProgress(pb.getProgress() + 2);
            Q50rgAnswered = true;
        }
    }
    }

    );


}


    public void btnDoneQ45to50(View view) {

     /* **carry forward of the progress bar*/
        saveInput();

        Bundle bundle = new Bundle();

        bundle.putInt("progressValue", pb.getProgress());

        Intent intent = new Intent(this, QuestionnaireOverview.class); //opens the questionnaire activity

        intent.putExtra("progressBundle", bundle);

        startActivity(intent);
    }


    ///////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////
    public void saveInput() {
        // Save the input of the questionnaire up till here
    }
    ///////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////


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
        int id = item.getItemId();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        if (id == R.id.nav_dashboard) {
            //save the current questionnaire inputs!
            saveInput();

            Intent intent = new Intent(this, Dashboard.class); //opens the Dashboard Activity
            startActivity(intent);

        } else if (id == R.id.nav_new_questionnaire) {
            saveInput();
            Intent intent = new Intent(this, QuestionnaireMenu.class); //opens a New Questionnaire Activity
            startActivity(intent);

        } else if (id == R.id.nav_previous_questionnaire) {
            saveInput();
            Intent intent = new Intent(this, PreviousQuestionnaires.class); //opens the Previous Questionnaire Activity
            startActivity(intent);

        } else if (id == R.id.nav_help) {
            saveInput();
            Intent intent = new Intent(this, Help.class); //opens the Dashboard Activity
            startActivity(intent);

        } else if (id == R.id.nav_logout) {
            saveInput();

            // popup window to ask for confirmation

            System.exit(0);
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



    public void info45(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("45. Home: \n\n" +
                "Problems in the home environment that are external to the CYP and could a ect their psychological wellbeing. " +
                "This may include crowded housing, homelessness, lack of social support network.")

                .create();
        myAlert.show();

    }

    public void info46(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("46. School, Work or Training: \n\n" +
                "Problems in the school, work or training environment that are external to the CYP and " +
                "could affect their psychological wellbeing (e.g. difficulties in communications between home and school, " +
                "multiple changes of teacher, breakdown in relations between teacher(s) and CYP/family).")

                .create();
        myAlert.show();
    }

    public void info47(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("47. Community:\n\n" +
                "Problems in the community that are external to the CYP and could a ect their psychological wellbeing. " +
                "This may include street violence, gang intimidation, racial discrimination and difficulties with neighbours.")

                .create();
        myAlert.show();
    }

    public void info48(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("48. Service Engagement: \n\n" +
                "Di culties regulating the appropriate level of service engagement. This may include history " +
                "of multiple or fractured contact with services, di culties locating care records, " +
                "difficulties accessing the service and problems engaging the CYP and their family appropriately, need for interpreter.")

                .create();
        myAlert.show();
    }

    /*Don't change/ edit the spacing, it is done intentionally for the formatting purpose*/
    public void info49(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("49. DEFINITIONS OF ATTENDANCE AND ATTAINMENT DIFFICULTIES: \n\n" +
                "These definitions are for general guidance purposes only and should be considered " +
                "within an age-appropriate context and with reference to cultural norms where appropriate. " +
                "They should also be considered with specific reference to the CYP you’re working with " +
                "(e.g. if the CYP has a learning disability, attendance and attainment should be considered in relation " +
                "to peers of the same developmental rather than chronological age). The examples given are not exhaustive.\n\n\n\n " +
                "Attendance difficulties \n\n"+
                "None:        "+"No problems noted. As rough guidance, around 1-2 days\n " +
                               "                 absence from school per month should be considered as \n" +
                               "                  within normal limits.\n\n"+
                "Mild:       "+"  Some definite problems. The CYP may be attending part-\n" +
                               "                  time or missing several lessons (includes truanting, school \n" +
                               "                  refusal or suspension for any cause). As a rough guidance,\n"+
                               "                  1 day of absence per week might be considered here.\n\n"+
                "Moderate: "+"Marked problems. The CYP may be attending infrequently,\n" +
                              "                   or is at high risk of exclusion or dismissal.\n" +
                              "                   As a rough guidance, the CYP may be absent 2 days per\n " +
                              "                  week.\n\n"+
                "Severe:      "+"CYP is out of school the majority of the time (for reasons \n" +
                              "                   of truancy, exclusion or refusal) or may be in a Pupil \n" +
                              "                   Referral Unit, excluded or not in Education, Employment or \n" +
                              "                   Training.")

                .create();
        myAlert.show();
    }

    /*Don't change/ edit the spacing, it is done intentionally for the formatting purpose*/
    public void info50(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("50. DEFINITIONS OF ATTENDANCE AND ATTAINMENT DIFFICULTIES:\n\n " +
                "These definitions are for general guidance purposes only and should be considered " +
                "within an age-appropriate context and with reference to cultural norms where appropriate. " +
                "They should also be considered with specific reference to the CYP you’re working with " +
                "(e.g. if the CYP has a learning disability, attendance and attainment should be considered in relation " +
                "to peers of the same developmental rather than chronological age). The examples given are not exhaustive.\n\n\n\n " +
                "Attainment difficulties \n\n"+
                "None:       "+"No problems noted. The CYP will be attaining at the \n" +
                               "                 optimum age-appropriate level moderated by that\n " +
                               "                expected for their known abilities.\n\n"+
                "Mild:        "+"Some problems. For example, if the CYP is in school they\n" +
                               "                 may be well below the year level in at least one subject,\n " +
                               "                or have problems with work rate or timekeeping if in \n" +
                               "                 employment or training.\n\n"+
                "Moderate:"+"Significant problems. If at school they may fail key exams,\n" +
                               "                  or be below the year group in all subjects. If in employment,\n " +
                               "                 they may have received formal warnings about their\n" +
                               "                  performance and/ or behaviour.\n\n"+
                "Severe:     "+"CYP has dropped out of education, employment or training.")


                .create();
        myAlert.show();
    }

}