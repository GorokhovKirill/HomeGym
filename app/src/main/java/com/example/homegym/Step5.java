package com.example.homegym;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Step5 extends AppCompatActivity {
    TextView TextView12;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.step5);
        TextView12 = findViewById(R.id.textView12);
    }
    public void OnClickSave(View view){
        Intent o = new Intent(Step5.this , SignIn.class);
        startActivity(o);
        finish();
    }

}
