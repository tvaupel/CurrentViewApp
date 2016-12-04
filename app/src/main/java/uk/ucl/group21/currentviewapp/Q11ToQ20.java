package uk.ucl.group21.currentviewapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Q11ToQ20 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

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
        navigationView.setNavigationItemSelectedListener(this);}


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


    public void btnNextQ11to20(View view) {
        // saving the data to the local cache (local DB) first
        saveInput();
        Intent intent = new Intent(this, Q21ToQ30.class); //opens the next set of questions
        startActivity(intent);
    }

}
