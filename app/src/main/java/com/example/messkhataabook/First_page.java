package com.example.messkhataabook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class First_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);


    }
    public void signup(View view){
        Intent i=new Intent(First_page.this,SignUpActivity.class);
        startActivity(i);
    }
    public void login(View view){
        Intent i=new Intent(First_page.this,login_page.class);
        startActivity(i);
    }
}