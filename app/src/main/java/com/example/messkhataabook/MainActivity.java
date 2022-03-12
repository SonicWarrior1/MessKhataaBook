package com.example.messkhataabook;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar= Calendar.getInstance();
                Toast.makeText(MainActivity.this, "Time and Date:"+calendar.getTime(), Toast.LENGTH_SHORT).show();
            }
        });

    }

}