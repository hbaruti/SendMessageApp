package com.example.mysecondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.MySecondApp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }

    //Called when user taps "Send" -button
    public void sendMessageFinal (View view){
        Intent intent = new Intent(this, MessageSentActivity.class);
        TextView textView = (TextView) findViewById(R.id.textView);
        String message = textView.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    //Called when the user taps "Edit" -button
    public void editMessage(View view){
        Intent intent = new Intent(this, EditMessageActivity.class);
        TextView textView = (TextView) findViewById(R.id.textView);
        String message = textView.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
