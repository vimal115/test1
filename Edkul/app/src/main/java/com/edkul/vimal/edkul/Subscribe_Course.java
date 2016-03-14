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

    Spinner spinnerDropDown;
    String[] cities = {
            "Mumbai",
            "Delhi",
            "Bangalore",
            "Hyderabad",
            "Ahmedabad",
            "Chennai",
            "Kolkata",
            "Pune",
            "Jabalpur"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscribe__course);

        spinnerDropDown =(Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.
                R.layout.simple_spinner_dropdown_item ,cities);
        spinnerDropDown.setAdapter(adapter);
        spinnerDropDown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                // Get select item
                int sid = spinnerDropDown.getSelectedItemPosition();
                Toast.makeText(getBaseContext(), "You have selected City : " + cities[sid],
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });
    }

}
