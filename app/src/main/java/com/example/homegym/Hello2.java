package com.example.homegym;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Hello2 extends AppCompatActivity {
    ImageView ImageView19,ImageView13,ImageView21;
    TextView textView3;
    Integer score=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello2);
        ImageView19=findViewById(R.id.imageView19);//male
        ImageView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=1;
                ImageView19.setImageResource(R.drawable.s2);
                ImageView13.setImageResource(R.drawable.s);
                ImageView21.setImageResource(R.drawable.next2);
            }
        });
        ImageView13=findViewById(R.id.imageView13);//famale
        ImageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=2;
                ImageView13.setImageResource(R.drawable.s2);
                ImageView19.setImageResource(R.drawable.s);
                ImageView21.setImageResource(R.drawable.next2);
            }
        });
        ImageView21=findViewById(R.id.imageView21);//next
        ImageView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (score){
                    case (1):
                        Intent male=new Intent(Hello2.this, Male.class);
                        startActivity(male);
                        finish();
                        break;
                    case (2):
                        Intent female=new Intent(Hello2.this, Female.class);
                        startActivity(female);
                        finish();
                        break;
                    default:
                        return;
                }
            }
        });
    }

}
