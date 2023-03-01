package com.example.m213_ch01_tp01_crj_trainees;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ex02Activity extends AppCompatActivity {
    EditText etEx02Nombre;
    TextView tvEx02Parite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex02);

        etEx02Nombre = findViewById(R.id.etEx02Nombre);
        tvEx02Parite = findViewById(R.id.tvEx02Parite);

//        tvEx02Parite.setTextColor(Color.RED);

        etEx02Nombre.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                try {
                    int nombre = Integer.parseInt(etEx02Nombre.getText().toString());

                    tvEx02Parite.setTextColor(Color.GREEN);

                    if (nombre % 2 == 0)
                        tvEx02Parite.setText(String.format("%d est pair", nombre));
                    else
                        tvEx02Parite.setText(String.format("%d est impair", nombre));
                } catch (NumberFormatException e) {
                    tvEx02Parite.setTextColor(Color.RED);
                    tvEx02Parite.setText("?");
                }
            }
        });

        etEx02Nombre.setText("");
    }
}