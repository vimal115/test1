package com.edkul.vimal.edkul;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.content.Context;
import android.content.ContentValues;

public class DatabaseHandler extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "student.db";
    private static final String TABLE_STUDENT = "student";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_STUDENTNAME = "studentname";
    private static final String COLUMN_EMAIL = "studentemail";
    private static final String COLUMN_PASSWORD = "studentpassword";
    private static final String COLUMN_CPASSWORD = "studentcpassword";
    private static final String COLUMN_INSTITUTE = "studentinstitute";
    private static final String COLUMN_CONTACTNO = "studentcontact";

    public DatabaseHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = " CREATE TABLE " + TABLE_STUDENT + "(" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_STUDENTNAME + " TEXT " +
                COLUMN_EMAIL + " TEXT " +
                COLUMN_PASSWORD + " TEXT " +
                COLUMN_CPASSWORD + " TEXT " +
                COLUMN_INSTITUTE + " TEXT " +
                COLUMN_CONTACTNO + " TEXT " +
                ")";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_STUDENT);
        onCreate(db);
    }

    //add new row to the database
    public void addStudent(StudentRecord studentRecord){
        ContentValues values = new ContentValues();
        values.put(COLUMN_STUDENTNAME,studentRecord.get_Name());
        values.put(COLUMN_EMAIL,studentRecord.get_Email());
        values.put(COLUMN_PASSWORD,studentRecord.get_Password());
        values.put(COLUMN_CPASSWORD,studentRecord.get_Cpassword());
        values.put(COLUMN_INSTITUTE,studentRecord.get_institute());
        values.put(COLUMN_CONTACTNO,studentRecord.get_contactno());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_STUDENT,null,values);
        db.close();
    }

    //Delete the student record from the table

    public void deleteStudent(String studentName){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_STUDENT + "WHERE" + COLUMN_STUDENTNAME + "=\" "+ studentName + "\";");
    }

    // print the database as a string

    public String databaseToString(){
        String dbString = "";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_STUDENT + "WHERE 1" ;
        Cursor c = db.rawQuery(query,null);
        c.moveToFirst();
        while (!c.isAfterLast()) {
            if (c.getString(c.getColumnIndex("studentName")) != null){
                dbString += c.getString(c.getColumnIndex("studentName"));
                dbString += "\n";
            }
        }
        db.close();
        return dbString;
    }


}
