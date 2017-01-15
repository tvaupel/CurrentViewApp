package uk.ucl.group21.currentviewapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Tom on 15/01/2017.
 *
 * This DatabaseHelper Class is based off the Tutorial found online at
 * "Youtube.com/ProgrammingKnowledge".
 * The work of the tutorial publisher is acknowledged and no credit for
 * the publishers work is claimed by group 21.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "CurrentView.db";


    // Table for Clinicians
    public static final String TABLE_NAME_CLINICIAN = "clinician_table";
    public static final String COl_1C = "CLINICIAN_ID";
    public static final String COL_2C = "USERNAME";
    public static final String COL_3C = "PASSWORD";


    // Table for Questionnaires
    public static final String TABLE_NAME_QUEST = "questionnaires";
    public static final String COL_1Q = "QUESTIONNAIRE_NUMBER";
    public static final String COL_2Q = "CYP";
    public static final String COL_3Q = "NHS_ID";
    public static final String COL_4Q = "DOB";
    public static final String COL_5Q = "DATE";
    public static final String COL_6Q = "REASON";
    /*
    public static final String COL_7Q = "PRACTITIONER_NAME";
    public static final String COL_8Q = "PRACTITIONER_ID";
    public static final String COL_9Q = "SERVICE_CASE_ID";
    public static final String COL_10Q = "TIME";
    */

    public static final String TABLE_NAME_ANS = "quest_answers";
    public static final String COL_1A = "A1";
    public static final String COL_2A = "A2";
    public static final String COL_3A = "A3";
    public static final String COL_4A = "A4";
    public static final String COL_5A = "A5";
    public static final String COL_6A = "A6";
    public static final String COL_7A = "A7";
    public static final String COL_8A = "A8";
    public static final String COL_9A = "A9";
    public static final String COL_10A = "A10";
    public static final String COL_11A = "A11";
    public static final String COL_12A = "A12";
    public static final String COL_13A = "A13";
    public static final String COL_14A = "A14";





    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME_CLINICIAN + " (CLINICIAN_ID INTEGER PRIMARY KEY AUTOINCREMENT, USERNAME TEXT, PASSWORD TEXT) ");
        db.execSQL("CREATE TABLE " + TABLE_NAME_QUEST + " (QUESTIONNAIRE_NUMBER INTEGER PRIMARY KEY AUTOINCREMENT, CYP TEXT, NHS_ID TEXT, DOB TEXT, DATE TEXT, REASON TEXT) ");
        db.execSQL("CREATE TABLE " + TABLE_NAME_ANS + "");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_CLINICIAN);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_QUEST);
        onCreate(db);
    }

    public boolean insertClinician(String username, String password){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(COL_2C, username);
        contentValues.put(COL_3C, password);
        long result = db.insert(TABLE_NAME_CLINICIAN, null, contentValues);
        if(result == -1){
            return false;
        } else {
            return true;
        }
    }




    public boolean insertQuestionnaireDetail(String CYP, String NHS_ID, String DOB, String Date, String Reason){

        System.out.println("insertQuestionnaire called");
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(COL_2Q, CYP);
        contentValues.put(COL_3Q, NHS_ID);
        contentValues.put(COL_4Q, DOB);
        contentValues.put(COL_5Q, Date);
        contentValues.put(COL_6Q, Reason);

        long result = db.insert(TABLE_NAME_QUEST, null, contentValues);
        if(result == -1){
            System.out.println("not inserted");

            return false;
        } else {
            System.out.println("inserted, return true");

            return true;
        }
    }

}
