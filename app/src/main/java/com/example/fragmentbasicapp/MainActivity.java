package com.example.fragmentbasicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button activitybutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get the reference of button
        activitybutton=findViewById(R.id.activity_button);
        //perform setOnClickListener event on Button
        activitybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //display a message by using a Toast
                Toast.makeText(getApplicationContext(),"Activity's Button",Toast.LENGTH_LONG).show();
            }
        });
    }
}
