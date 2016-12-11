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

public class Q21ToQ30 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ProgressBar pb;
    RadioGroup Q21rg, Q22rg, Q23rg, Q24rg, Q25rg, Q26rg, Q27rg, Q28rg, Q29rg, Q30rg;

    boolean Q21rgAnswered, Q22rgAnswered, Q23rgAnswered, Q24rgAnswered, Q25rgAnswered;
    boolean Q26rgAnswered, Q27rgAnswered, Q28rgAnswered, Q29rgAnswered, Q30rgAnswered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q21_to_q30);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        Q21rg = (RadioGroup) findViewById(R.id.Q21radiogroup);
        Q22rg = (RadioGroup) findViewById(R.id.Q22radiogroup);
        Q23rg = (RadioGroup) findViewById(R.id.Q23radiogroup);

        Q24rg = (RadioGroup) findViewById(R.id.Q24radiogroup);
        Q25rg = (RadioGroup) findViewById(R.id.Q25radiogroup);
        Q26rg = (RadioGroup) findViewById(R.id.Q26radiogroup);
        Q27rg = (RadioGroup) findViewById(R.id.Q27radiogroup);
        Q28rg = (RadioGroup) findViewById(R.id.Q28radiogroup);
        Q29rg = (RadioGroup) findViewById(R.id.Q29radiogroup);
        Q30rg = (RadioGroup) findViewById(R.id.Q30radiogroup);

        /*to display progress value send by the previous screen*/
        pb = (ProgressBar) findViewById(R.id.progress1);


        Bundle bundle = getIntent().getExtras().getBundle("progressBundle");

        int progressValue = bundle.getInt("progressValue");

        pb.setProgress(progressValue);



        Q21rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {
                                                 if (!Q21rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q21rgAnswered = true;
                                                 }
                                             }
                                         }
        );

        Q22rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {


                                                 if (!Q22rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q22rgAnswered = true;
                                                 }
                                             }
                                         }

        );

        Q23rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {


                                                 if (!Q23rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q23rgAnswered = true;
                                                 }
                                             }
                                         }
        );

        Q24rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                 if (!Q24rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q24rgAnswered = true;
                                                 }
                                             }
                                         }
        );

        Q25rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                 if (!Q25rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q25rgAnswered = true;
                                                 }
                                             }
                                         }
        );


        Q26rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {
                                                 if (!Q26rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q26rgAnswered = true;
                                                 }
                                             }
                                         }
        );

        Q27rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                 if (!Q27rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q27rgAnswered = true;
                                                 }
                                             }
                                         }
        );

        Q28rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                 if (!Q28rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q28rgAnswered = true;
                                                 }
                                             }
                                         }
        );

        Q29rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                 if (!Q29rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q29rgAnswered = true;
                                                 }
                                             }
                                         }
        );

        Q30rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                 if (!Q30rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q30rgAnswered = true;
                                                 }
                                             }
                                         }
        );


    }

    public void btnNextQ21to30(View view) {

     /* **carry forward of the progress bar*/
        saveInput();

        Bundle bundle = new Bundle();

        bundle.putInt("progressValue", pb.getProgress());

        Intent intent = new Intent(this, Q31ToQ37.class); //opens the questionnaire activity

        intent.putExtra("progressBundle", bundle);

        startActivity(intent);
    }



    ///////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////
    public void saveInput(){
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


    public void info21(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("21. Family relationship difficulties: \n\n" +
                "Problems within the family (e.g. arguments, high conflict between family members, " +
                "high expressed emotion, inappropriate levels of involvement, adjustment dfficulties)." )

                .create();
        myAlert.show();

    }

    public void info22(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("22. Problems in attachment to parent/carer (Attachment problems): \n\n" +
                "Difficulty forming or maintaining relationships with primary care giver(s) " +
                "which has implications for relationships with key people in their life going forward.")

                .create();
        myAlert.show();

    }

    public void info23(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("23. Peer relationship difficulties: \n\n" +
                "Problems relating to peers (e.g. difficulties integrating into available peer groups, " +
                "difficulties forming or maintaining friendships, conflicts in relationships). " +
                "May also include problematic or inappropriate romantic or sexual relationships. ")

                .create();
        myAlert.show();
    }

    public void info24(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("24. Persistent difficulties managing relationships with others\n" +
                "(includes emerging personality disorder): \n\n" +
                "On-going difficulties relating to others usually linked with aggression, " +
                "self-harm or difficulties with expressing and/or regulating emotion.")

                .create();
        myAlert.show();
    }

    public void info25(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("25. Does not speak (selective mutism): \n\n" +
                "Is able to speak and understand language but chooses not to do so in one or more contexts " +
                "(e.g. school, at the homes of certain relatives).")

                .create();
        myAlert.show();
    }

    public void info26(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("26. Gender discomfort Issues (GID): \n\n" +
                "Extreme discomfort associated with anatomical gender. " +
                "Repeated insistence that they are (or want to be) the opposite gender.")

                .create();
        myAlert.show();
    }

    public void info27(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("27. Unexplained physical symptoms: \n\n" +
                "Regular reporting of physical symptoms that have no known biological cause and are " +
                "suspected to be psychological in nature (e.g. unexplained pain, stomach and headaches, hypochondriasis).")

                .create();
        myAlert.show();
    }

    public void info28(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("28. Unexplained developmental difficulties: \n\n" +
                "CYP presenting with failure to meet developmental milestones. " +
                "These are of as yet unknown cause and could be of physical and/or psychological origin " +
                "(e.g. feeding, sleeping, movement or language problems). Include Pica and suspected Pervasive Developmental Disorder.")

                .create();
        myAlert.show();
    }

    public void info29(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("29. Self-care issues (includes medical care management, obesity): \n\n" +
                "Difficulties in managing diet (e.g. over-eating), medical care regime (e.g. insulin regime) " +
                "or personal care (e.g. hygiene issues).")

                .create();
        myAlert.show();
    }


    public void info30(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("30. Adjustment to health issues: \n\n" +
                "CYP experiencing emotional and/or behavioural di culties following diagnosis of health condition " +
                "in self or significant other. This may also include on-going adjustment difficulties.")

                .create();
        myAlert.show();
    }

}
