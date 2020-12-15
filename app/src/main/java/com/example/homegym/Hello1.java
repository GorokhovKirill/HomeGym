package com.example.homegym;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Hello1 extends AppCompatActivity {
    ImageView imageView10;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello1);
        imageView10 = findViewById(R.id.imageView10);
    }
    public void OnClickWeight(View view){
        imageView10.setImageResource(R.drawable.weightb);
        Intent o = new Intent(Hello1.this , Hello2.class);
        startActivity(o);
        finish();
    }

}