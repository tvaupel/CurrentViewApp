package uk.ucl.group21.currentviewapp;

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

public class Q31ToQ37 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    ProgressBar pb;
    RadioGroup Q31rg, Q32rg, Q33rg, Q34rg, Q35rg, Q36rg, Q37rg;

    boolean Q31rgAnswered, Q32rgAnswered, Q33rgAnswered, Q34rgAnswered, Q35rgAnswered;
    boolean Q36rgAnswered, Q37rgAnswered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q31_to_37);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Q31rg = (RadioGroup) findViewById(R.id.Q31radiogroup);
        Q32rg = (RadioGroup) findViewById(R.id.Q32radiogroup);
        Q33rg = (RadioGroup) findViewById(R.id.Q33radiogroup);

        Q34rg = (RadioGroup) findViewById(R.id.Q34radiogroup);
        Q35rg = (RadioGroup) findViewById(R.id.Q35radiogroup);
        Q36rg = (RadioGroup) findViewById(R.id.Q36radiogroup);
        Q37rg = (RadioGroup) findViewById(R.id.Q37radiogroup);

        /*to display progress value send by the previous screen*/
        pb = (ProgressBar) findViewById(R.id.progress1);


        Bundle bundle = getIntent().getExtras().getBundle("progressBundle");

        int progressValue = bundle.getInt("progressValue");

        pb.setProgress(progressValue);



        Q31rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {
                                                 if (!Q31rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q31rgAnswered = true;
                                                 }
                                             }
                                         }
        );

        Q32rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {


                                                 if (!Q32rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q32rgAnswered = true;
                                                 }
                                             }
                                         }

        );

        Q33rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {


                                                 if (!Q33rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q33rgAnswered = true;
                                                 }
                                             }
                                         }
        );

        Q34rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                 if (!Q34rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q34rgAnswered = true;
                                                 }
                                             }
                                         }
        );

        Q35rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                 if (!Q35rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q35rgAnswered = true;
                                                 }
                                             }
                                         }
        );


        Q36rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {
                                                 if (!Q36rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q36rgAnswered = true;
                                                 }
                                             }
                                         }
        );

        Q37rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                 if (!Q37rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q37rgAnswered = true;
                                                 }
                                             }
                                         }
        );


    }

    public void btnNextQ31to37(View view) {

     /* **carry forward of the progress bar*/
        saveInput();

        Bundle bundle = new Bundle();

        bundle.putInt("progressValue", pb.getProgress());

        Intent intent = new Intent(this, Q38ToQ44.class); //opens the questionnaire activity

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


    public void info31(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("31. Looked after CYP: \n\n" +
                "Include CYP who are under section 20, special guardianship or " +
                "kinship care, or subject to a care order (either temporary or long term).")

                .create();
        myAlert.show();

    }

    public void info32(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("32. Young carer status: \n\n" +
                "CYP is responsible for the care of a family member. This may be due to a parent or " +
                "sibling being incapacitated through physical or psychological disorder/disability and" +
                "/or substance abuse. Common responsibilities include physical and personal care of family " +
                "member, managing budgets and medication, interpreting and providing emotional support.")

                .create();
        myAlert.show();

    }

    public void info33(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("33. Learning disability: \n\n" +
                "CYP must have diagnosis of a moderate, severe or profound learning disability. " +
                "Do not include CYP with a specific learning difficulty (e.g. Dyslexia) without a " +
                "comorbid learning disability.")

                .create();
        myAlert.show();
    }

    public void info34(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("34. Serious physical health issues (Including Chronic Fatigue):\n\n" +
                "CYP has a physical illness, disease, injury or impairment that requires continuing " +
                "input and treatment from a healthcare provider (e.g. diabetes, epilepsy, tuberous " +
                "sclerosis, autoimmune disorders).")

                .create();
        myAlert.show();
    }

    public void info35(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("35. Pervasive Developmental Disorders (Autism/Asperger’s): \n\n" +
                "Developmental disorders that a ect cognitive and social functioning and often include difficulties " +
                "with social interaction, communication and  flexibility of thought " +
                "(e.g. Autistic Spectrum Disorders, Rett’s Disorder).")

                .create();
        myAlert.show();
    }

    public void info36(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("36. Neurological issues (e.g. tics or Tourette’s): \n\n" +
                "Neurological disorders that manifest physically (e.g. Tic disorder, Tourette’s). " +
                "Include Cerebral Palsy and speech and language disorders.")

                .create();
        myAlert.show();
    }

    public void info37(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("37. Current protection plan: \n\n" +
                "CYP is subject to a current child protection plan.")

                .create();
        myAlert.show();
    }
}

