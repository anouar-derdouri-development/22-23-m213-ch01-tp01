package com.example.m213_ch01_tp01_crj_trainees;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
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

        btnEx04First.setOnClickListener(view -> {
            number = 1;
            etEx04Number.setText(number.toString());
        });

        btnEx04Previous.setOnClickListener(view -> {
            if (number > 1) {
                number--;
            }
            etEx04Number.setText(number.toString());
        });

        btnEx04Next.setOnClickListener(view -> {
            if (number < 10) {
                number++;
            }
            etEx04Number.setText(number.toString());
        });

        btnEx04Last.setOnClickListener(view -> {
            number = 10;
            etEx04Number.setText(number.toString());
        });

    }
}