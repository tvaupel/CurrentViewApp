package uk.ucl.group21.currentviewapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Q31ToQ37 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q31to37);}
    public void btnNextQ31to37(View view) {
        Intent intent = new Intent(this, Q38ToQ44.class); //opens the Setting Activity
        startActivity(intent);
    }

}
