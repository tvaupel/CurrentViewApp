package com.aditya.adityapc.sqliteloginregistrationexample;

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

public class Q38ToQ44 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    ProgressBar pb;
    RadioGroup Q38rg, Q39rg, Q40rg, Q41rg, Q42rg, Q43rg, Q44rg;

    boolean Q38rgAnswered, Q39rgAnswered, Q40rgAnswered, Q41rgAnswered, Q42rgAnswered;
    boolean Q43rgAnswered, Q44rgAnswered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q38_to_q44);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Q38rg = (RadioGroup) findViewById(R.id.Q38radiogroup);
        Q39rg = (RadioGroup) findViewById(R.id.Q39radiogroup);
        Q40rg = (RadioGroup) findViewById(R.id.Q40radiogroup);
        Q41rg = (RadioGroup) findViewById(R.id.Q41radiogroup);
        Q42rg = (RadioGroup) findViewById(R.id.Q42radiogroup);
        Q43rg = (RadioGroup) findViewById(R.id.Q43radiogroup);
        Q44rg = (RadioGroup) findViewById(R.id.Q44radiogroup);

        /*to display progress value send by the previous screen*/
        pb = (ProgressBar) findViewById(R.id.progress1);


        Bundle bundle = getIntent().getExtras().getBundle("progressBundle");

        int progressValue = bundle.getInt("progressValue");

        pb.setProgress(progressValue);



        Q38rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {
                                                 if (!Q38rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q38rgAnswered = true;
                                                 }
                                             }
                                         }
        );

        Q39rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {


                                                 if (!Q39rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q39rgAnswered = true;
                                                 }
                                             }
                                         }

        );

        Q40rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {


                                                 if (!Q40rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q40rgAnswered = true;
                                                 }
                                             }
                                         }
        );

        Q41rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                 if (!Q41rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q41rgAnswered = true;
                                                 }
                                             }
                                         }
        );

        Q42rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                 if (!Q42rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q42rgAnswered = true;
                                                 }
                                             }
                                         }
        );


        Q43rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {
                                                 if (!Q43rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q43rgAnswered = true;
                                                 }
                                             }
                                         }
        );

        Q44rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                 if (!Q44rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q44rgAnswered = true;
                                                 }
                                             }
                                         }
        );


    }

    public void btnNextQ38to44(View view) {
     /* **carry forward of the progress bar*/
        saveInput();

        Bundle bundle = new Bundle();

        bundle.putInt("progressValue", pb.getProgress());

        Intent intent = new Intent(this, Q45ToQ50.class); //opens the questionnaire activity

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

    public void info38(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("38. Deemed “child in need” of social service input: \n\n" +
                "CYP has been identi ed by professionals as needing local authority services to achieve " +
                "or maintain a reasonable standard of health or development and/or to prevent significant or further " +
                "harm to health or development. This includes CYP who are classed as disabled. " +
                "Include CYP who are deemed in need of local authority input but are currently below " +
                "threshold for acceptance of the referral")

                .create();
        myAlert.show();

    }

    public void info39(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("39. Refugee or Asylum Seeker: \n\n" +
                "CYP has been forced to leave their country to escape war, persecution or natural disaster.")

                .create();
        myAlert.show();

    }

    public void info40(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("40. Experience of war, torture or trafficking: \n\n" +
                "CYP has witnessed or experienced war, torture or trafficking.")

                .create();
        myAlert.show();
    }

    public void info41(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("41. Experience of abuse or neglect:\n\n" +
                "CYP has witnessed or experienced physical, emotional, sexual abuse or neglect. " +
                "Include witnessing of domestic violence.")

                .create();
        myAlert.show();
    }

    public void info42(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("42. Parental health issues: \n\n" +
                "At least one primary care giver is currently su ering from a diagnosable mental health problem(s)," +
                " moderate, severe or profound learning disability, signiffucant substance abuse and/or " +
                "significant cant physical health issues (e.g. parent/carer in a wheelchair).")

                .create();
        myAlert.show();
    }

    public void info43(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("43. Contact with Youth Justice System: \n\n" +
                "Contact with Youth Justice System")

                .create();
        myAlert.show();
    }

    public void info44(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("44. Living in financial difficulty: \n\n" +
                "Family is deemed to be in considerable debt or under  nancial stress requiring local " +
                "authority assistance to meet basic needs (e.g. CYP is in receipt of free school meals).")

                .create();
        myAlert.show();
    }

}
