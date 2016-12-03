package uk.ucl.group21.currentviewapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "Patient.db";
    public static final String TABLE_NAME = "Patient_table";
    public static final String COL_1 = "NHS_ID";
    public static final String COL_2 = "CYP_NAME";
    public static final String COL_3 = "SURVEY_DATE";
    public static final String COL_4 = "SURVEY_TIME";
    public static final String COL_5 = "DOB";
    public static final String COL_6 = "REASON_OF_COMPLETING";


    //public static final String DATABASE_NAME2 = "Practitioner's name.db";
    //public static final String TABLE_NAME2 = "Practitioner's ID";
    //public static final String COL_11 = "NHS ID";
    //public static final String COL_22 = "CYP NAME";
    //public static final String COL_33 = "SERVICE ALLOCATED CASE ID";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        //1=version

        //     SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " +TABLE_NAME + " (NHS_ID TEXT PRIMARY KEY, CYP_NAME TEXT, SURVEY_DATE TEXT, SURVEY_TIME TEXT, DOB TEXT, REASON_OF_COMPLETING TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME );

        onCreate(db) ;
    }

    public boolean insertData (String id, String name, String date, String time, String dob, String reason){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues ();
        contentValues.put(COL_1, id);
        contentValues.put(COL_2, name);
        contentValues.put(COL_3, date);
        contentValues.put(COL_4, time);
        contentValues.put(COL_5, dob);
        contentValues.put(COL_6, reason);
        //() inside, first =column name, then the value we are going to parse)

        System.out.println("Test1");
        long result = db.insert(TABLE_NAME, null, contentValues);
        System.out.println("Test2");
        //return result != -1;

        if(result==-1){
            return false;
        }else{
            return true;
        }


    }
}
