package com.erikriosetiawan.slideshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ViewFlipper viewFlipper;
    Button buttonNext;
    Button buttonPrevious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper = findViewById(R.id.view_flipper);
        buttonNext = findViewById(R.id.button_next);
        buttonPrevious = findViewById(R.id.button_previous);

        buttonNext.setOnClickListener(this);
        buttonPrevious.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.button_next) {
            viewFlipper.showNext();
        } else if (v.getId() == R.id.button_previous) {
            viewFlipper.showPrevious();
        }

    }
}
