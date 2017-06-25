package com.example.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText name,password;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        name=(EditText) findViewById(R.id.editText);
        password=(EditText) findViewById(R.id.editText2);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                on_submit(v);
            }
        });
    }

    public void on_submit(View v)
    {
        Intent intent = new Intent();
        intent.putExtra("username", name.getText().toString());
        intent.putExtra("password", password.getText().toString());
        intent.setAction("com.example.loginapp.LoginActivity");
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        startActivity(intent);
    }
}
