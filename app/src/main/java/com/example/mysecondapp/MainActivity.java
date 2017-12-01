package com.example.mysecondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.MySecondApp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Called when user taps "Send" -button
    public void sendMessage (View view){
        //Intent constructor takes 2 parameters
        //The 1st parameter is 'Context', but 'this' is used cuz Activity-class is Context subclass
        //The 2nd param. is the class of the app cmpnt to which the system should deliver the Intent
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        //putExtra()-method adds EditText's value to the intent
        intent.putExtra(EXTRA_MESSAGE, message);
        //startActivity()-method starts an instance of the DisplayMessageActivity specified by the Intent
        startActivity(intent);
    }
}
