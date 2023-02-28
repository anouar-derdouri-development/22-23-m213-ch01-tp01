package com.example.m213_ch01_tp01_crj_trainees;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ex01Activity extends AppCompatActivity {
    EditText etEx01Nombre;
    Button btnEx01Parite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex01);

        etEx01Nombre = findViewById(R.id.etEx01Nombre);
        btnEx01Parite = findViewById(R.id.btnEx01Parite);

        btnEx01Parite.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(Ex01Activity.this);

            builder.setTitle("Parité");

            try {
                int nombre = Integer.parseInt(etEx01Nombre.getText().toString());

                builder.setIcon(android.R.drawable.ic_dialog_info);

                if (nombre % 2 == 0)
                    builder.setMessage(String.format("%d est pair", nombre));
                else
                    builder.setMessage(String.format("%d est impair", nombre));
            } catch (NumberFormatException e) {
                builder.setIcon(android.R.drawable.ic_dialog_alert);
                builder.setMessage("Il faut saisir un entier !!!");
            }

            builder.show();
        });
    }
}