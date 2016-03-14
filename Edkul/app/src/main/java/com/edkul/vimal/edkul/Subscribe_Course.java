package com.edkul.vimal.edkul;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Subscribe_Course extends AppCompatActivity {

    Spinner spinnerDropDown1,spinnerDropDown2;
    String[] institute = {
            "Shri Mata Vaishno Devi University",
            "Delhi College of Engineering",
            "IIT Kanpur",
            "IIT Mumbai",
            "IIT Kharagpur",
            "IIT mandi",
            "IIT Delhi",
            "IIT Guwahati",
            "IIT Madras"
    };
    String[] Courses = {
            "Java Basics",
            "C/C++",
            "Ruby",
            "Paython",
            "Basic Electronics",
            "Digital Electronics",
            "Thermodynamics",
            "Engineering Grapics",
            "Catia"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscribe__course);

        spinnerDropDown1 =(Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.
                R.layout.simple_spinner_dropdown_item ,institute);
        spinnerDropDown1.setAdapter(adapter1);
        spinnerDropDown1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                // Get select item
                int sid = spinnerDropDown1.getSelectedItemPosition();
                Toast.makeText(getBaseContext(), "You have selected " + institute[sid],
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });
        spinnerDropDown2 =(Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter2= new ArrayAdapter<String>(this,android.
                R.layout.simple_spinner_dropdown_item ,Courses);
        spinnerDropDown2.setAdapter(adapter2);
        spinnerDropDown2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                // Get select item
                int sid = spinnerDropDown2.getSelectedItemPosition();
                Toast.makeText(getBaseContext(), "You have selected  " + Courses[sid],
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });
    }

}
