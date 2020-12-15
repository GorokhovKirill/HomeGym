package com.example.homegym;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Step4 extends AppCompatActivity {
    ImageView ImageView40,ImageView41,ImageView42,ImageView43;
    Integer score=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.step4);
        ImageView40=findViewById(R.id.imageView40);
        ImageView40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=1;
                ImageView40.setImageResource(R.drawable.pram20);
                ImageView43.setImageResource(R.drawable.pram20);
                ImageView42.setImageResource(R.drawable.pram);
                ImageView41.setImageResource(R.drawable.pram);
            }
        });
        ImageView41=findViewById(R.id.imageView41);
        ImageView41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=2;
                ImageView41.setImageResource(R.drawable.pram20);
                ImageView40.setImageResource(R.drawable.pram);
                ImageView42.setImageResource(R.drawable.pram);
                ImageView43.setImageResource(R.drawable.pram20);
            }
        });
        ImageView42=findViewById(R.id.imageView42);
        ImageView42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=3;
                ImageView42.setImageResource(R.drawable.pram20);
                ImageView40.setImageResource(R.drawable.pram);
                ImageView41.setImageResource(R.drawable.pram);
                ImageView43.setImageResource(R.drawable.pram20);
            }
        });
        ImageView43=findViewById(R.id.imageView43);//next
        ImageView43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (score){
                    case (1):
                        Intent a=new Intent(Step4.this, Step5.class);
                        startActivity(a);
                        finish();
                        break;
                    case (2):
                        Intent b=new Intent(Step4.this, Step5.class);
                        startActivity(b);
                        finish();
                        break;
                    case (3):
                        Intent c=new Intent(Step4.this, Step5.class);
                        startActivity(c);
                        finish();
                        break;
                    default:
                        return;
                }
            }
        });
    }
}
