package com.example.homegym;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Male extends AppCompatActivity {
    ImageView imageView35;
    ImageView imageView36;
    ImageView imageView37;
    ImageView imageView38;
    Integer score=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.male);
        imageView35=findViewById(R.id.imageView35);//male
        imageView35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=1;
                imageView35.setImageResource(R.drawable.pram2);
                Intent i = new Intent(Male.this, Step4.class);
                startActivity(i);
                finish();
            }
        });
        imageView36=findViewById(R.id.imageView36);//famale
        imageView36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=2;
                imageView36.setImageResource(R.drawable.pram2);
                Intent i = new Intent(Male.this, Step4.class);
                startActivity(i);
                finish();
            }
        });
        imageView37=findViewById(R.id.imageView37);//famale
        imageView37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=2;
                imageView37.setImageResource(R.drawable.pram2);
                Intent i = new Intent(Male.this, Step4.class);
                startActivity(i);
                finish();

            }
        });
        imageView38=findViewById(R.id.imageView36);//famale
        imageView38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=2;
                imageView36.setImageResource(R.drawable.pram2);
                Intent i = new Intent(Male.this, Step4.class);
                startActivity(i);
                finish();
            }
        });
    }
    }

