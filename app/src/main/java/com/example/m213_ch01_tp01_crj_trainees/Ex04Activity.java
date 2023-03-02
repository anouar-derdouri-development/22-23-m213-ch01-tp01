package com.example.m213_ch01_tp01_crj_trainees;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ex04Activity extends AppCompatActivity {
    Button btnEx04First, btnEx04Previous, btnEx04Next, btnEx04Last;
    EditText etEx04Number;
    Integer number = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex04);

        btnEx04First = findViewById(R.id.btnEx04First);
        btnEx04Previous = findViewById(R.id.btnEx04Previous);
        btnEx04Next = findViewById(R.id.btnEx04Next);
        btnEx04Last = findViewById(R.id.btnEx04Last);
        etEx04Number = findViewById(R.id.etEx04Number);

        btnEx04First.setOnClickListener(new Counter(Position.FIRST, etEx04Number));
        btnEx04Previous.setOnClickListener(new Counter(Position.PREVIOUS, etEx04Number));
        btnEx04Next.setOnClickListener(new Counter(Position.NEXT, etEx04Number));
        btnEx04Last.setOnClickListener(new Counter(Position.LAST, etEx04Number));
    }
}