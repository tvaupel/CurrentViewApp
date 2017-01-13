package uk.ucl.group21.currentviewapp;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;


public class Welcome extends AppCompatActivity {

    SQLiteDatabase db;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        TextView text = (TextView)findViewById(R.id.textName);
        db=openOrCreateDatabase("RegistrationDB", Context.MODE_PRIVATE, null);
        Cursor c=db.rawQuery("SELECT * FROM register",null);
        StringBuffer buffer=new StringBuffer();
        while(c.moveToNext()) {
            buffer.append(""+c.getString(0)+"\n");
        }
        text.setText("");
        text.setText(buffer);
        Toast.makeText(Welcome.this, "Welcome "+buffer, Toast.LENGTH_LONG).show();

    }

}
