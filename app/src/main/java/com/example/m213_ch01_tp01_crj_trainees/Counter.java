package com.example.m213_ch01_tp01_crj_trainees;

import android.view.View;
import android.widget.EditText;

class Counter implements View.OnClickListener {
    private static Integer min = 1;
    private static Integer max = 10;
    private static Integer number = min;
    private EditText editText;
    private Position position;

    public Counter(Position position, EditText editText) {
        this.position = position;
        this.editText = editText;
    }

    @Override
    public void onClick(View v) {
        switch (position) {
            case FIRST:
                number = min;
                break;
            case PREVIOUS:
                if (number > min)
                    number--;
                break;
            case NEXT:
                if (number < max)
                    number++;
                break;
            case LAST:
                number = max;
        }

        editText.setText(number.toString());
    }
}