package com.example.homegym;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignIn extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
    }
    public void onClickVhod(View view){
        EditText log=(EditText) findViewById(R.id.log);
        EditText pas=(EditText) findViewById(R.id.pass);
        if (log.getText().toString().equals("serk")&& pas.getText().toString().equals("123")){
            Intent o = new Intent(SignIn.this, Hello1.class);
            startActivity(o);
            finish();
        }else{
            Toast.makeText(this,"Неправильно введен логин или пароль",Toast.LENGTH_SHORT).show();
        }
    }
}