package com.example.hackapp;

/**
 * Created by shive on 6/25/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bun = getIntent().getExtras();
        String result1 = bun.getString("username");
        String result2 = bun.getString("password");
        Toast.makeText(getBaseContext(), "username: "+result1+ "\npassword: "+result2, Toast.LENGTH_LONG).show();
    }
}