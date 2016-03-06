package com.edkul.vimal.edkul;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Student_Signup extends AppCompatActivity {

    EditText studentName;
    EditText studentEmail;
    EditText studentPassword;
    EditText studentCpassword;
    EditText studentInstitute;
    EditText studentContact;
    TextView textView;
    DatabaseHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student__signup);
        Button btn = (Button) findViewById(R.id.submitStudent);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("Start Function","to get the values");
                addButtonClicked();
                Log.e("End function", "Start storing data in db");
            }
        });
    }

    // add etnry to database
    public void addButtonClicked(){
        studentName = (EditText) findViewById(R.id.parentStudent);
        studentEmail = (EditText) findViewById(R.id.studentEmail);
        studentPassword = (EditText) findViewById(R.id.studentPassword);
        studentCpassword = (EditText) findViewById(R.id.studentCpassword);
        studentInstitute = (EditText) findViewById(R.id.studentInstitute);
        studentContact = (EditText) findViewById(R.id.studentContact);
        dbHandler = new DatabaseHandler(this,null,null,4);
        StudentRecord stRecord = new StudentRecord(studentName.getText().toString(),studentEmail.getText().toString(),
                studentPassword.getText().toString(),studentCpassword.getText().toString(),
                studentInstitute.getText().toString(),studentContact.getText().toString());
        dbHandler.addStudent(stRecord);
        studentName.setText("");
        studentEmail.setText("");
        studentPassword.setText("");
        studentCpassword.setText("");
        studentInstitute.setText("");
        studentContact.setText("");
    }

}
