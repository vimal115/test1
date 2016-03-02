package com.edkul.vimal.edkul;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

public class Join_AS_A extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("Content ", " Main layout ");
        super.onCreate(savedInstanceState);
        Log.i("Content ", " Main layout ");
        setContentView(R.layout.activity_join__as_);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



        radioGroup = (RadioGroup) findViewById(R.id.joinGroup);
        btn = (Button) findViewById(R.id.nextButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if (selectedId == R.id.radioButton ) {
                    Intent intentMain = new Intent(Join_AS_A.this,
                            Student_Signup.class);
                    startActivity(intentMain);
                    Log.i("Content ", " Main layout ");
                }else if(selectedId == R.id.radioButton2){
                    Intent intentMain = new Intent(Join_AS_A.this,
                            Teacher_Signup.class);
                    startActivity(intentMain);
                    Log.i("Content ", " Main layout ");
                }else{
                    Intent intentMain = new Intent(Join_AS_A.this,
                            Parent_Signup.class);
                    startActivity(intentMain);
                    Log.i("Content ", " Main layout ");
                }

            }
        });
    }

}
