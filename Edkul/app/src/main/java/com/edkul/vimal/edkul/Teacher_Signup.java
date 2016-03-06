package com.edkul.vimal.edkul;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Teacher_Signup extends AppCompatActivity {

    EditText teacherName;
    EditText teacherEmail;
    EditText teacherPassword;
    EditText teacherCpassword;
    EditText teacherInstitute;
    EditText teacherContact;
    TextView textView;
    DatabaseHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher__signup);
        Button btn = (Button) findViewById(R.id.submitButton2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("Start Function", "to get the values");
                addButtonClicked();
                Log.e("End function", "Start storing data in db");
            }
        });

    }

    // add etnry to database
    public void addButtonClicked(){
        teacherName = (EditText) findViewById(R.id.teacherName);
        teacherEmail = (EditText) findViewById(R.id.teacherEmail);
        teacherPassword = (EditText) findViewById(R.id.teacherPassword);
        teacherCpassword = (EditText) findViewById(R.id.teacherCpassword);
        teacherInstitute = (EditText) findViewById(R.id.teacherInstitute);
        teacherContact = (EditText) findViewById(R.id.contactInfo);
        dbHandler = new DatabaseHandler(this,null,null,4);
        TeacherRecord tcRecord = new TeacherRecord(teacherName.getText().toString(),teacherEmail.getText().toString(),
                teacherPassword.getText().toString(),teacherCpassword.getText().toString(),
                teacherInstitute.getText().toString(),teacherContact.getText().toString());
        dbHandler.addTeacher(tcRecord);
        teacherName.setText("");
        teacherEmail.setText("");
        teacherPassword.setText("");
        teacherCpassword.setText("");
        teacherInstitute.setText("");
        teacherContact.setText("");
    }

}
