package uk.ucl.group21.currentviewapp;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import android.content.SharedPreferences;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Toast;
public class Q1ToQ10 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

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
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
//        this.loadpagedata();
    }
    public RadioGroup myRadioGroup;
    public void onRadioButtonClicked(View view) {
        RadioGroup mySelection = (RadioGroup) findViewById(R.id.myRadioGroup);
        int radioButtonId = mySelection.getCheckedRadioButtonId();
        switch (radioButtonId) {
            case R.id.none1:
                RadioButton rbu1 = (RadioButton) findViewById(R.id.none2);
                rbu1.setChecked(true);
                break;
            case R.id.mild1:
                RadioButton rbu2 = (RadioButton) findViewById(R.id.none3);
                rbu2.setChecked(true);
                break;
        }
    }

//    private void loadpagedata()  {
//        SharedPreferences sharedPreferences= this.getSharedPreferences("loadpagedata", Context.MODE_PRIVATE);
//
//        if(sharedPreferences!= null) {
//
//
//            int checkedRadioButtonId = sharedPreferences.getInt("checkedRadioButtonId", R.id.none1);
//
//
//            this.myRadioGroup.check(checkedRadioButtonId);
//
//        } else {
//
//        }
//
//    }



    public void btnNext(View view) {
        Intent intent = new Intent(this, Q11ToQ20.class); //opens the questionnaire activity
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

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Q1ToQ10 Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
