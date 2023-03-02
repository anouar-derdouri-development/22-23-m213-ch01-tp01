package com.example.m213_ch01_tp01_crj_trainees;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ex03Activity extends AppCompatActivity {
    Button btnEx03Red;
    Button btnEx03Green;
    Button btnEx03Blue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex03);

        btnEx03Red = findViewById(R.id.btnEx03Red);
        btnEx03Green = findViewById(R.id.btnEx03Green);
        btnEx03Blue = findViewById(R.id.btnEx03Blue);

        btnEx03Red.setTag(Color.RED);
        btnEx03Green.setTag(Color.GREEN);
        btnEx03Blue.setTag(Color.BLUE);
    }

    public void colorBackground(View view) {
        enableButtons();
        view.setEnabled(false);

//        if (view.equals(btnEx03Red))
//            getWindow().getDecorView().setBackgroundColor(Color.RED);
//        else if (view.equals(btnEx03Green))
//            getWindow().getDecorView().setBackgroundColor(Color.GREEN);
//        else
//            getWindow().getDecorView().setBackgroundColor(Color.BLUE);

        getWindow().getDecorView().setBackgroundColor(Integer.parseInt(view.getTag().toString()));
    }

    private void enableButtons() {
        btnEx03Red.setEnabled(true);
        btnEx03Green.setEnabled(true);
        btnEx03Blue.setEnabled(true);
    }
}