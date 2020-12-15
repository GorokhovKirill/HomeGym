package com.example.homegym;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Female extends AppCompatActivity {
    ImageView imageView22;
    ImageView imageView23;
    ImageView imageView24;
    ImageView imageView25;
    Integer score=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.female);
        imageView22=findViewById(R.id.imageView22);//male
        imageView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=1;
                imageView22.setImageResource(R.drawable.pram2);
                Intent i = new Intent(Female.this, Step4.class);
                startActivity(i);
                finish();
            }
        });
        imageView23=findViewById(R.id.imageView36);//famale
        imageView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=2;
                imageView23.setImageResource(R.drawable.pram2);
                Intent i = new Intent(Female.this, Step4.class);
                startActivity(i);
                finish();
            }
        });
        imageView24=findViewById(R.id.imageView37);//famale
        imageView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=2;
                imageView24.setImageResource(R.drawable.pram2);
                Intent i = new Intent(Female.this, Step4.class);
                startActivity(i);
                finish();

            }
        });
        imageView25=findViewById(R.id.imageView36);//famale
        imageView25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=2;
                imageView25.setImageResource(R.drawable.pram2);
                Intent i = new Intent(Female.this, Step4.class);
                startActivity(i);
                finish();
            }
        });
    }
}

