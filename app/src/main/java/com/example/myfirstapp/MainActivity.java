package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyApp";
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {
        Log.d(TAG,"its working!");
        //Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText editText1 = (EditText) findViewById(R.id.editTextTextPersonName2);
        String message = "Your full name is: " + editText.getText().toString() + " " + editText1.getText().toString();
        TextView textVie = (TextView) findViewById(R.id.textView3);
        textVie.setText(message);
        Toast toast = Toast.makeText(this,editText.getText().toString() + " " + editText1.getText().toString(),Toast.LENGTH_SHORT);
        toast.show();
        //intent.putExtra(EXTRA_MESSAGE, message);
        //startActivity(intent);

    }
}