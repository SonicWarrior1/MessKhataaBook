package com.example.messkhataabook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    EditText name,email,pass;
    TextView alert;
    private DbHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        name=findViewById(R.id.edSignupName);
        email=findViewById(R.id.edSignupEmail);
        pass=findViewById(R.id.edSignupPass);
        alert=findViewById(R.id.alert);
        dbHandler=new DbHandler(SignUpActivity.this);
    }

    public void SignUp(View view){
        String name1=name.getText().toString();
        String email1=email.getText().toString();
        String pass1=pass.getText().toString();

        if(name1.isEmpty() || email1.isEmpty() || pass1.isEmpty()){
            alert.setText("Fill all the Fields");
        }
        else{
            dbHandler.SignUpUser(name1,email1,pass1);
            Intent i = new Intent(SignUpActivity.this,login_page.class);
            Toast.makeText(getApplicationContext(),"Sign Up Succesful",Toast.LENGTH_LONG).show();
            startActivity(i);
        }

    }
}