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

public class Manage_test extends AppCompatActivity {
    Spinner spinnerDropDown1,spinnerDropDown2,spinnerDropDown3,spinnerDropDown4;
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
    String[] stream = {
            "ECE",
            "MECH",
            "CSE",
            "IBT",
            "CIVIL",
            "EEE",
            "EI",
            "NFT",
            "NSD"
    };

    String[] group = {
            "Group A",
            "Group B",
            "Group C"
    };
    String[] subject = {
            "ABC2",
            "ABC3",
            "ABC4",
            "ABC5",
            "ABC6",
            "ABC7",
            "ABC8",
            "ABC9",
            "ABC10"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_test);
        spinnerDropDown1 =(Spinner)findViewById(R.id.spinner3);
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
        spinnerDropDown2 =(Spinner)findViewById(R.id.spinner4);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.
                R.layout.simple_spinner_dropdown_item ,stream);
        spinnerDropDown2.setAdapter(adapter2);
        spinnerDropDown2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                // Get select item
                int sid = spinnerDropDown2.getSelectedItemPosition();
                Toast.makeText(getBaseContext(), "You have selected " + stream[sid],
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

        spinnerDropDown3 =(Spinner)findViewById(R.id.spinner5);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,android.
                R.layout.simple_spinner_dropdown_item ,group);
        spinnerDropDown3.setAdapter(adapter3);
        spinnerDropDown3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                // Get select item
                int sid = spinnerDropDown3.getSelectedItemPosition();
                Toast.makeText(getBaseContext(), "You have selected " + group[sid],
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });
        spinnerDropDown4 =(Spinner)findViewById(R.id.spinner6);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,android.
                R.layout.simple_spinner_dropdown_item ,subject);
        spinnerDropDown4.setAdapter(adapter4);
        spinnerDropDown4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                // Get select item
                int sid = spinnerDropDown4.getSelectedItemPosition();
                Toast.makeText(getBaseContext(), "You have selected " + subject[sid],
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });
    }

}
