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
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Q1ToQ10 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    ProgressBar pb = null;
    RadioGroup Q1rg, Q2rg, Q3rg, Q4rg, Q5rg, Q6rg, Q7rg, Q8rg, Q9rg, Q10rg, Q1org;


    RadioButton Q1rb, Q2rb, Q3rb, Q4rb, Q5rb, Q6rb, Q7rb, Q8rb, Q9rb, Q10rb, rbu1;

    // Initial value is false
    boolean Q1rgAnswered, Q2rgAnswered, Q3rgAnswered, Q4rgAnswered, Q5rgAnswered;
    boolean Q6rgAnswered, Q7rgAnswered, Q8rgAnswered, Q9rgAnswered, Q10rgAnswered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1_to_q10);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        Q1rg = (RadioGroup) findViewById(R.id.Q1radiogroup);
        Q2rg = (RadioGroup) findViewById(R.id.Q2radiogroup);
        Q3rg = (RadioGroup) findViewById(R.id.Q3radiogroup);

        Q4rg = (RadioGroup) findViewById(R.id.Q4radiogroup);
        Q5rg = (RadioGroup) findViewById(R.id.Q5radiogroup);
        Q6rg = (RadioGroup) findViewById(R.id.Q6radiogroup);
        Q7rg = (RadioGroup) findViewById(R.id.Q7radiogroup);
        Q8rg = (RadioGroup) findViewById(R.id.Q8radiogroup);
        Q9rg = (RadioGroup) findViewById(R.id.Q9radiogroup);
        Q10rg = (RadioGroup) findViewById(R.id.Q10radiogroup);

        Q1org = (RadioGroup) findViewById(R.id.Overview1radiogroup);


        pb = (ProgressBar) findViewById(R.id.progress1);
        pb.setProgress(0);

        Q1rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                            @Override
                                            public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {
                                                if (!Q1rgAnswered) {
                                                    pb.setProgress(pb.getProgress() + 2);
                                                    Q1rgAnswered = true;
                                                }
                                            }
                                        }
        );

        Q2rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                            @Override
                                            public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {


                                                if (!Q2rgAnswered) {
                                                    pb.setProgress(pb.getProgress() + 2);
                                                    Q2rgAnswered = true;
                                                }
                                            }
                                        }

        );

        Q3rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


                                            @Override
                                            public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {


                                                if (!Q3rgAnswered) {
                                                    pb.setProgress(pb.getProgress() + 2);
                                                    Q3rgAnswered = true;
                                                }
                                            }
                                        }
        );

        Q4rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


                                            @Override
                                            public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                if (!Q4rgAnswered) {
                                                    pb.setProgress(pb.getProgress() + 2);
                                                    Q4rgAnswered = true;
                                                }
                                            }
                                        }
        );

        Q5rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


                                            @Override
                                            public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                if (!Q5rgAnswered) {
                                                    pb.setProgress(pb.getProgress() + 2);
                                                    Q5rgAnswered = true;
                                                }
                                            }
                                        }
        );


        Q6rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


                                            @Override
                                            public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {
                                                if (!Q6rgAnswered) {
                                                    pb.setProgress(pb.getProgress() + 2);
                                                    Q6rgAnswered = true;
                                                }
                                            }
                                        }
        );

        Q7rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                            @Override
                                            public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                if (!Q7rgAnswered) {
                                                    pb.setProgress(pb.getProgress() + 2);
                                                    Q7rgAnswered = true;
                                                }
                                            }
                                        }
        );

        Q8rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                            @Override
                                            public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                if (!Q8rgAnswered) {
                                                    pb.setProgress(pb.getProgress() + 2);
                                                    Q8rgAnswered = true;
                                                }
                                            }
                                        }
        );

        Q9rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                            @Override
                                            public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                if (!Q9rgAnswered) {
                                                    pb.setProgress(pb.getProgress() + 2);
                                                    Q9rgAnswered = true;
                                                }
                                            }
                                        }
        );

        Q10rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                             @Override
                                             public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                                                 if (!Q10rgAnswered) {
                                                     pb.setProgress(pb.getProgress() + 2);
                                                     Q10rgAnswered = true;
                                                 }
                                             }
                                         }
        );

    }





//    public RadioGroup myRadioGroup;
//
//    public void onRadioGroup1Clicked(View view) {
//
//        RadioGroup mySelection = (RadioGroup) findViewById(R.id.Q1radiogroup);
//        int radioButtonId = mySelection.getCheckedRadioButtonId();
//        switch (radioButtonId) {
//            case R.id.none1:
//                rbu1 = (RadioButton)super.findViewById(R.id.none11);
//                setContentView(R.layout.activity_q1_to_q10);
//               // RadioButton rbu1 = (RadioButton) findViewById(R.id.overview_none1);
//                rbu1.setChecked(true);
//                break;
//            case R.id.mild1:
//                setContentView(R.layout.activity_q11_to_q20);
//                RadioButton rbu2 = (RadioButton) findViewById(R.id.mild12);
//                rbu2.setChecked(true);
//               // setContentView(R.layout.activity_q1_to_q10);
//                break;
//            case R.id.moderate1:
//                RadioButton rbu3 = (RadioButton) findViewById(R.id.moderate4);
//                rbu3.setChecked(true);
//                break;
//            case R.id.severe1:
//                RadioButton rbu4 = (RadioButton) findViewById(R.id.overview_severe11);
//                rbu4.setChecked(true);
//                break;
//            case R.id.not_known11:
//                RadioButton rbu5 = (RadioButton) findViewById(R.id.overview_not_known11);
//                rbu5.setChecked(true);
//                break;
//
//        }
//        setContentView(R.layout.activity_q1_to_q10);
//    }


    public void btnNext(View view) {
        saveInput();

     /* **carry forward of the progress bar*/
        Bundle bundle = new Bundle();

        bundle.putInt("progressValue", pb.getProgress());

        Intent intent = new Intent(this, Q11ToQ20.class); //opens the questionnaire activity

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
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        if (id == R.id.nav_dashboard) {
            //save the current questionnaire inputs!
            saveInput();
            // popup window to ask for confirmation
            Intent intent = new Intent(this, Dashboard.class); //opens the Dashboard Activity
            startActivity(intent);

        } else if (id == R.id.nav_new_questionnaire) {
            saveInput();
            // popup window to ask for confirmation
            Intent intent = new Intent(this, QuestionnaireMenu.class); //opens the Dashboard Activity
            startActivity(intent);

        } else if (id == R.id.nav_previous_questionnaire) {
            saveInput();
            // popup window to ask for confirmation
            Intent intent = new Intent(this, PreviousQuestionnaires.class); //opens the Previous Questionnaire Activity
            startActivity(intent);

        } else if (id == R.id.nav_help) {
            saveInput();
            // popup window to ask for confirmation
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

    public void info1(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("1. Anxious away from care givers(Separation anxiety): \n\n" +
                "Excessive and inappropriate anxiety on separation from primary care giver(s);" +
                "nightmares about separation and physical(somatic) symptoms are common. May manifest as school refusal.")

                .create();
        myAlert.show();

    }

    public void info2(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("2. Anxious in social situations (Social anxiety/phobia): \n\n" +
                "Strong fear of social and performance related situations;" +
                "e.g. starting conversations, joining in with games, completing homework, taking tests or answering question in class." +
                "Anxiety may be present in situations with same-age peers and/ or adults and is likely to be expressed by avoidance of such situations.")

                .create();
        myAlert.show();

    }

    public void info3(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("3. General anxiety (generalised anxiety): \n\n" +
                "These worries are di cult to control or dismiss and signs may include restlessness, irritability, tiredness, " +
                "disrupted sleep and concentration problems.")

                .create();
        myAlert.show();
    }

    public void info4(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("4. Compelled to do or think things (OCD): \n\n" +
                "Recurrent involuntary or uncontrollable thoughts or images (obsessions) and/" +
                "or uncontrollable urges to perform certain behaviours (e.g. checking, counting, hand-washing).")

                .create();
        myAlert.show();
    }

    public void info5(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("5. Panics (Panic Disorder): \n\n" +
                "Frequent episodes of extreme fear and discomfort which occur unexpectedly and when no known feared stimulus is present, " +
                "often accompanied by shortness of breath and fast heartbeat. Not restricted to just one situation or set of circumstances; " +
                "commonly characterised by anticipatory fear of panicking.")

                .create();
        myAlert.show();
    }

    public void info6(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("6. Avoids going out (Agoraphobia): \n\n" +
                "Avoids or becomes frightened in open spaces or public places; may have a ‘safe zone’, usually including " +
                "(but not restricted to) their home, which they will be reluctant to leave. Panic is a common feature of this problem.")

                .create();
        myAlert.show();
    }

    public void info7(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("7. Avoids speci c things (Speci c phobia): \n\n" +
                "Extreme and inappropriate fear in response to speci c objects or situations." +
                "Common fears include animals (e.g. spiders), natural environment (e.g. heights), blood/injection/injury and situational fears (e.g. aeroplanes).")

                .create();
        myAlert.show();
    }

    public void info8(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("8. Repetitive problematic behaviours (Habit problems): \n\n" +
                "CYP shows repetitive patterns of behaviour of which they appear unaware and/or unable to control" +
                "(e.g. severe nail-biting, Trichotillomania (hair pulling), skin picking).")

                .create();
        myAlert.show();
    }

    public void info9(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("9. Depression/low mood (Depression): \n\n" +
                "Low or sad mood (either reported or observed). May report being less active, and having less energy." +
                "May also  nd it hard to concentrate and not enjoy the things they used to do. Changes to appetite and sleeping pattern are common.")

                .create();
        myAlert.show();
    }


    public void info10(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("10. Self-harm (Self injury or self-harm): \n\n" +
                "CYP deliberately attempts to (or reports wanting to) hurt themselves (e.g. by cutting, biting, hitting and burning)." +
                "includes attempted or threatened suicide and/or suicidal ideation.")

                .create();
        myAlert.show();
    }
}






