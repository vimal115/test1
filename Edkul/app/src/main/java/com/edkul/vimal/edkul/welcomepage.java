package com.edkul.vimal.edkul;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class welcomepage extends AppCompatActivity {
    private Button btn;
    EditText userName,passWord;
    DatabaseHandler dbHandler;
    Context ctx =this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomepage);
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
        TextView recoverPasswordId = (TextView) findViewById(R.id.fPass);
        recoverPasswordId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMain = new Intent(welcomepage.this,
                        RecoverPassword.class);
                startActivity(intentMain);
            }
        });

        TextView joinNow = (TextView) findViewById(R.id.joinNow);
        joinNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMain = new Intent(welcomepage.this,
                        Join_AS_A.class);
                startActivity(intentMain);
            }
        });
        btn = (Button) findViewById(R.id.loginButton);
        userName = (EditText) findViewById(R.id.userName);
        passWord = (EditText) findViewById(R.id.passWord);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = userName.getText().toString();
                String userpass = passWord.getText().toString();
                boolean login_status = false;
               try{
                   DatabaseHandler databaseHandler = new DatabaseHandler(ctx,null,null,4);
                   SQLiteDatabase sqLiteDatabase = databaseHandler.getReadableDatabase();
                   Cursor cursor = sqLiteDatabase.rawQuery("SELECT StudentName,StudentPassword FROM StudentRecords;", null);
                   String name = "";
                   String pass = "";
                   if(cursor != null){
                       if(cursor.moveToFirst()){
                           do
                           {
                               if (username.equals(cursor.getString(0))&&userpass.equals(cursor.getString(1))){
                                   login_status = true;
                                   name = cursor.getString(0);
                                   pass = cursor.getString(1);
                               }

                           }while(cursor.moveToNext());
                           if (login_status){
                               Toast toast = Toast.makeText(getBaseContext(), "Login success Welcome " + name, Toast.LENGTH_LONG);
                               TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
                               v.setTextColor(Color.GREEN);
                               toast.show();
                               Intent intentMain = new Intent(welcomepage.this,
                                       UserProfile.class);
                               startActivity(intentMain);
                           }else {
                               Toast toast = Toast.makeText(getBaseContext(), "Login Failed", Toast.LENGTH_LONG);
                               TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
                               v.setTextColor(Color.RED);
                               toast.show();
                           }
                       }
                   }
               }catch(Exception err){
                    err.printStackTrace();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_welcomepage, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
