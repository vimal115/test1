/**
 * Created by vimal on 2/3/16.
 */

package com.edkul.vimal.edkul;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.content.Context;
import android.content.ContentValues;
import android.util.Log;

import java.util.ArrayList;

public class DatabaseHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 4;
    private static final String DATABASE_NAME = "studentRecord.db";
    private static final String COLUMN_ID = "_id";

    private static final String TABLE_STUDENT = "StudentRecords";
    private static final String COLUMN_STUDENTNAME = "StudentName";
    private static final String COLUMN_EMAIL = "StudentEmail";
    private static final String COLUMN_PASSWORD = "StudentPassword";
    private static final String COLUMN_CPASSWORD = "StudentConfirmPassword";
    private static final String COLUMN_INSTITUTE = "InstituteName";
    private static final String COLUMN_CONTACTNO = "ContactInfo";

    private static final String TABLE_TEACHER = "TeacherRecords";
    private static final String COLUMN_TEACHERNAME = "TeacherName";
    private static final String COLUMN_EMAIL1 = "TeacherEmail";
    private static final String COLUMN_PASSWORD1 = "TeacherPassword";
    private static final String COLUMN_CPASSWORD1 = "TeacherConfirmPassword";
    private static final String COLUMN_INSTITUTE1 = "InstituteName1";
    private static final String COLUMN_CONTACTNO1 = "ContactInfo1";


    private static final String TABLE_PARENT = "ParentRecords";
    private static final String COLUMN_PARENTNAME = "ParentName";
    private static final String COLUMN_EMAIL2 = "ParentEmail";
    private static final String COLUMN_PASSWORD2 = "ParentPassword";
    private static final String COLUMN_CPASSWORD2 = "ParentConfirmPassword";
    private static final String COLUMN_INSTITUTE2 = "InstituteName2";
    private static final String COLUMN_CONTACTNO2 = "ContactInfo2";
    private static final String COLUMN_STUDENT = "StudentName";


    public DatabaseHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    public DatabaseHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_STUDENT + " ( " +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_STUDENTNAME + " TEXT, " +
                COLUMN_EMAIL + " TEXT, " +
                COLUMN_PASSWORD + " TEXT, " +
                COLUMN_CPASSWORD + " TEXT, " +
                COLUMN_INSTITUTE + " TEXT, " +
                COLUMN_CONTACTNO + " TEXT" +
                ")";
        db.execSQL(query);

        String query1 = "CREATE TABLE " + TABLE_TEACHER + " ( " +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_TEACHERNAME + " TEXT, " +
                COLUMN_EMAIL1 + " TEXT, " +
                COLUMN_PASSWORD1 + " TEXT, " +
                COLUMN_CPASSWORD1 + " TEXT, " +
                COLUMN_INSTITUTE1 + " TEXT, " +
                COLUMN_CONTACTNO1 + " TEXT" +
                ")";
        db.execSQL(query1);

        String query2 = "CREATE TABLE " + TABLE_PARENT + " ( " +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_PARENTNAME + " TEXT, " +
                COLUMN_EMAIL2 + " TEXT, " +
                COLUMN_PASSWORD2 + " TEXT, " +
                COLUMN_CPASSWORD2 + " TEXT, " +
                COLUMN_INSTITUTE2 + " TEXT, " +
                COLUMN_CONTACTNO2 + " TEXT, " +
                COLUMN_STUDENT + " TEXT" +
                ")";
        db.execSQL(query2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_STUDENT);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_TEACHER);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PARENT);
        onCreate(db);
    }

    //add new row to the database

    public void addStudent(StudentRecord studentRecord){
        ContentValues values = new ContentValues();
        values.put(COLUMN_STUDENTNAME,studentRecord.get_Name());
        values.put(COLUMN_EMAIL,studentRecord.get_Email());
        values.put(COLUMN_PASSWORD,studentRecord.get_Password());
        values.put(COLUMN_CPASSWORD,studentRecord.get_Cpassword());
        values.put(COLUMN_INSTITUTE,studentRecord.get_Institute());
        values.put(COLUMN_CONTACTNO,studentRecord.get_Contact());
        Log.e("Print values here::", studentRecord.get_Name());
        Log.e("Print values here::",studentRecord.get_Email());
        Log.e("Print values here::",studentRecord.get_Password());
        Log.e("Print values here::",studentRecord.get_Cpassword());
        Log.e("Print values here::",studentRecord.get_Institute());
        Log.e("Print values here::",studentRecord.get_Contact());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_STUDENT, null, values);
        db.close();
    }

    public void addTeacher(TeacherRecord teacherRecord){
        ContentValues values = new ContentValues();
        values.put(COLUMN_TEACHERNAME,teacherRecord.get_Name());
        values.put(COLUMN_EMAIL1,teacherRecord.get_Email());
        values.put(COLUMN_PASSWORD1,teacherRecord.get_Password());
        values.put(COLUMN_CPASSWORD1,teacherRecord.get_Cpassword());
        values.put(COLUMN_INSTITUTE1,teacherRecord.get_Institute());
        values.put(COLUMN_CONTACTNO1, teacherRecord.get_Contact());
        Log.e("Print values here::", teacherRecord.get_Name());
        Log.e("Print values here::",teacherRecord.get_Email());
        Log.e("Print values here::",teacherRecord.get_Password());
        Log.e("Print values here::",teacherRecord.get_Cpassword());
        Log.e("Print values here::",teacherRecord.get_Institute());
        Log.e("Print values here::",teacherRecord.get_Contact());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_TEACHER, null, values);
        db.close();
    }

    //String _Name, String _Email, String _Password, String _Cpassword, String _Institute,String _Contact,String _StudentName
    public void addParent(ParentRecord parentRecord){
        ContentValues values = new ContentValues();
        values.put(COLUMN_PARENTNAME,parentRecord.get_Name());
        values.put(COLUMN_EMAIL2,parentRecord.get_Email());
        values.put(COLUMN_PASSWORD2,parentRecord.get_Password());
        values.put(COLUMN_CPASSWORD2,parentRecord.get_Cpassword());
        values.put(COLUMN_INSTITUTE2,parentRecord.get_Institute());
        values.put(COLUMN_CONTACTNO2,parentRecord.get_Contact());
        values.put(COLUMN_STUDENT,parentRecord.get_StudentName());
        Log.e("Print values here::", parentRecord.get_Name());
        Log.e("Print values here::",parentRecord.get_Email());
        Log.e("Print values here::",parentRecord.get_Password());
        Log.e("Print values here::",parentRecord.get_Cpassword());
        Log.e("Print values here::",parentRecord.get_Institute());
        Log.e("Print values here::",parentRecord.get_Contact());
        Log.e("Print values here::",parentRecord.get_StudentName());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_PARENT, null, values);
        db.close();
    }

    //Delete the student record from the table
    public void deleteStudent(String studentName){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_STUDENT + "WHERE" + COLUMN_STUDENTNAME + "=\" "+ studentName + "\";");
    }

    // print the database as a string

    public Cursor getInformation(DatabaseHandler db,String tableName,String[] columns){
        SQLiteDatabase sq = db.getReadableDatabase();
        String[] values = columns;
        Cursor cr = sq.query(tableName,values,null,null,null,null,null);
        Log.e("Tablename is"+tableName,"columns are"+values);
        return cr;
    }

}
