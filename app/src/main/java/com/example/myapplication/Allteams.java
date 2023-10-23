package com.example.myapplication;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Allteams extends AppCompatActivity {


    private Intent canada;
    private ImageButton canada1;

    private Intent fcb;
    private ImageButton fcb1;

    private Intent m;
    private ImageButton m1;

    private Intent star;
    private ImageButton star1;

    private Intent ottawa;
    private ImageButton ottawa1;

    private Intent question;
    private ImageButton question1;
    private ImageButton pickteam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pick);

        // Canada
        canada1 = findViewById(R.id.canada);
        canada = new Intent(this, MainActivity.class);

        canada1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                canada.putExtra("buttonClicked", 1);
                startActivity(canada);
            }
        });

// FCB
        fcb1 = findViewById(R.id.fcb);
        fcb = new Intent(this, MainActivity.class);

        fcb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fcb.putExtra("buttonClicked", 2);
                startActivity(fcb);
            }
        });

// Star
        star1 = findViewById(R.id.star);
        star = new Intent(this, MainActivity.class);

        star1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                star.putExtra("buttonClicked", 3);
                startActivity(star);
            }
        });

// Ottawa
        ottawa1 = findViewById(R.id.ottawa);
        ottawa = new Intent(this, MainActivity.class);

        ottawa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ottawa.putExtra("buttonClicked", 4);
                startActivity(ottawa);
            }
        });

// Question
        question1 = findViewById(R.id.question);
        question = new Intent(this, MainActivity.class);

        question1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                question.putExtra("buttonClicked", 5);
                startActivity(question);
            }
        });




    }




}