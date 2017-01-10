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

public class Q11ToQ20 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    ProgressBar pb;
    RadioGroup Q11rg, Q12rg, Q13rg, Q14rg, Q15rg, Q16rg, Q17rg, Q18rg, Q19rg, Q20rg;

    boolean Q11rgAnswered, Q12rgAnswered, Q13rgAnswered, Q14rgAnswered, Q15rgAnswered;
    boolean Q16rgAnswered, Q17rgAnswered, Q18rgAnswered, Q19rgAnswered, Q20rgAnswered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q11_to_q20);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Q11rg = (RadioGroup) findViewById(R.id.Q11radiogroup);
        Q12rg = (RadioGroup) findViewById(R.id.Q12radiogroup);
        Q13rg = (RadioGroup) findViewById(R.id.Q13radiogroup);
        Q14rg = (RadioGroup) findViewById(R.id.Q14radiogroup);
        Q15rg = (RadioGroup) findViewById(R.id.Q15radiogroup);
        Q16rg = (RadioGroup) findViewById(R.id.Q16radiogroup);
        Q17rg = (RadioGroup) findViewById(R.id.Q17radiogroup);
        Q18rg = (RadioGroup) findViewById(R.id.Q18radiogroup);
        Q19rg = (RadioGroup) findViewById(R.id.Q19radiogroup);
        Q20rg = (RadioGroup) findViewById(R.id.Q20radiogroup);

        /*to display progress value send by the previous screen*/
        pb = (ProgressBar) findViewById(R.id.progress1);

        Bundle bundle = getIntent().getExtras().getBundle("progressBundle");

        int progressValue = bundle.getInt("progressValue");

        pb.setProgress(progressValue);

        Q11rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                            @Override
                                            public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {
                                                if (!Q11rgAnswered) {
                                                    pb.setProgress(pb.getProgress() + 2);
                                                    Q11rgAnswered = true;
                                                }
                                            }
                                        }
        );
        Q12rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                            @Override
                                            public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {


                                                if (!Q12rgAnswered) {
                                                    pb.setProgress(pb.getProgress() + 2);
                                                    Q12rgAnswered = true;
                                                }
                                            }
                                        }

        );
        Q13rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


                                            @Override
                                            public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {


                                                if (!Q13rgAnswered) {
                                                    pb.setProgress(pb.getProgress() + 2);
                                                    Q13rgAnswered = true;
                                                }
                                            }
                                        }
        );
        Q14rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


                                            @Override
                                            public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                if (!Q14rgAnswered) {
                                                    pb.setProgress(pb.getProgress() + 2);
                                                    Q14rgAnswered = true;
                                                }
                                            }
                                        }
        );
        Q15rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


                                            @Override
                                            public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                if (!Q15rgAnswered) {
                                                    pb.setProgress(pb.getProgress() + 2);
                                                    Q15rgAnswered = true;
                                                }
                                            }
                                        }
        );
        Q16rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


                                            @Override
                                            public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {
                                                if (!Q16rgAnswered) {
                                                    pb.setProgress(pb.getProgress() + 2);
                                                    Q16rgAnswered = true;
                                                }
                                            }
                                        }
        );
        Q17rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                            @Override
                                            public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                if (!Q17rgAnswered) {
                                                    pb.setProgress(pb.getProgress() + 2);
                                                    Q17rgAnswered = true;
                                                }
                                            }
                                        }
        );
        Q18rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                            @Override
                                            public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                if (!Q18rgAnswered) {
                                                    pb.setProgress(pb.getProgress() + 2);
                                                    Q18rgAnswered = true;
                                                }
                                            }
                                        }
        );
        Q19rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                            @Override
                                            public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                if (!Q19rgAnswered) {
                                                    pb.setProgress(pb.getProgress() + 2);
                                                    Q19rgAnswered = true;
                                                }
                                            }
                                        }
        );
        Q20rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                 if (!Q20rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q20rgAnswered = true;
                                                 }
                                             }
                                         }
        );
    }

    public void btnNextQ11to20(View view) {
        // saving the data to the local cache (local DB) first
        saveInput();

        Bundle bundle = new Bundle();

        bundle.putInt("progressValue", pb.getProgress());

        Intent intent = new Intent(this, Q21ToQ30.class); //opens the questionnaire activity

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



    public void info11(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("11. Extremes of mood (Bipolar disorder): \n\n" +
                "CYP has (either reported or observed) di culties a ecting feelings and behaviour characterised by major mood changes." )

                .create();
        myAlert.show();

    }

    public void info12(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("12. Delusional beliefs and hallucinations (Psychosis): \n\n" +
                "CYP has (either reported or observed) paranoid thoughts, delusions and/or confused thinking.")

                .create();
        myAlert.show();

    }

    public void info13(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("13. Drug and alcohol di culties (Substance abuse): \n\n" +
                "CYP is addicted to and/or using drugs/alcohol in a harmful manner. ")

                .create();
        myAlert.show();
    }

    public void info14(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("14. Difficulties sitting still or concentrating (ADHD/Hyperactivity): \n\n" +
                "Difficulties with attention and/or hyperactivity, impulsive behaviour is also common. " +
                "May move around a lot, fidget, be easily distracted or have trouble waiting their turn.")

                .create();
        myAlert.show();
    }

    public void info15(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("15. Behavioural di culties (CD or ODD): \n\n" +
                "Repeated and persistent challenging or out of control behaviour, may include behaviour that is violent, aggressive and harmful to others. " +
                "Typical behaviours may include excessive fighting, bullying, cruelty to people or animals, stealing, truancy, tantrums, disobedience and  re-setting.")

                .create();
        myAlert.show();
    }

    public void info16(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("16. Poses risk to others: \n\n" +
                "Threatened or actual violence towards others, including inappropriate sexualised behaviour.")

                .create();
        myAlert.show();
    }

    public void info17(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("17. Carer management of CYP behaviour (e.g. management of child): \n\n" +
                "Parents are unable to manage/cope with aspects of the CYP’s behaviour (e.g. sleep (in infants), toilet training (in toddlers), " +
                "tantrums (in middle childhood), challenging behaviour (in adolescence)).")

                .create();
        myAlert.show();
    }

    public void info18(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("18. Doesn’t go to the toilet in time (Elimination problems): \n\n" +
                "Unable to reach the toilet in time or goes to the toilet in inappropriate places (either on purpose or accidentally). " +
                "This includes defecation (encopresis), urination (enuresis) and smearing.\n" +
                "PLEASE NOTE: In order to be classiffied as an elimination problem, the CYP must be at least 4 (defecation) " +
                "or 5 (urination) years old (or equivalent developmental level).")

                .create();
        myAlert.show();
    }

    public void info19(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("19. Disturbed by traumatic event (PTSD): \n\n" +
                "Extreme and prolonged distress following witnessing or experiencing a traumatic event " +
                "(e.g. rape, assault, death, serious accident, natural disaster)." +
                "This may be expressed through disrupted sleep, nightmares, repetitive play in which the event is re-enacted (fully or in part), " +
                "avoidance of stimuli associated with or refusal to talk about the event.")

                .create();
        myAlert.show();
    }


    public void info20(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("20. Eating issues (Anorexia/Bulimia): \n\n" +
                "Preoccupation with body image and weight accompanied by " +
                "disturbed eating behaviours (e.g. food restriction, purging, bingeing, over-exercising).")

                .create();
        myAlert.show();
    }

}
