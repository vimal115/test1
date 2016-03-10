package com.edkul.vimal.edkul;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Parent_Signup extends AppCompatActivity {

    EditText parentName;
    EditText parentEmail;
    EditText parentPassword;
    EditText parentCpassword;
    EditText parentInstitute;
    EditText parentContact;
    EditText parentStudent;
    TextView textView;
    DatabaseHandler dbHandler;
    Context abc = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent__signup);
        Button btn = (Button) findViewById(R.id.submitButton3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("Start Function", "to get the values");
                addButtonClicked();
                String tableName = "ParentRecords";
                String[] coloumns = {"ParentName","ParentEmail","ParentPassword","ParentConfirmPassword","InstituteName2","ContactInfo2","StudentName"};
                Cursor cr1 = dbHandler.getInformation(dbHandler,tableName,coloumns);
                cr1.moveToFirst();
                do {
                    Log.e("Vimal Mishra",cr1.getString(0));
                }while(cr1.moveToNext());
            }
        });
    }

    // add etnry to database

    public void addButtonClicked(){
        parentName = (EditText) findViewById(R.id.parentName);
        parentEmail = (EditText) findViewById(R.id.parentEmail);
        parentPassword = (EditText) findViewById(R.id.parentPassword);
        parentCpassword = (EditText) findViewById(R.id.parentCpassword);
        parentInstitute = (EditText) findViewById(R.id.parentInstitute);
        parentContact = (EditText) findViewById(R.id.parentContact);
        parentStudent = (EditText) findViewById(R.id.userName);
        dbHandler = new DatabaseHandler(this,null,null,4);
        ParentRecord prRecord = new ParentRecord(parentName.getText().toString(),parentEmail.getText().toString(),
                                                 parentPassword.getText().toString(),parentCpassword.getText().toString(),
                                                 parentInstitute.getText().toString(),parentContact.getText().toString(),
                                                 parentStudent.getText().toString());
        Log.e("Print values here::", parentName.getText().toString());
        Log.e("Print values here::",parentEmail.getText().toString());
        Log.e("Print values here::",parentPassword.getText().toString());
        Log.e("Print values here::",parentCpassword.getText().toString());
        Log.e("Print values here::",parentInstitute.getText().toString());
        Log.e("Print values here::",parentContact.getText().toString());
        Log.e("Print values here::",parentStudent.getText().toString());
        dbHandler.addParent(prRecord);
        parentName.setText("");
        parentEmail.setText("");
        parentPassword.setText("");
        parentCpassword.setText("");
        parentInstitute.setText("");
        parentContact.setText("");
        parentStudent.setText("");
    }

}
