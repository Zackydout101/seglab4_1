package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Intent pickteamIntent;
    private ImageButton pickteam;

    private Button maps;

    private Button submit;

    private EditText teamAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        pickteam = findViewById(R.id.pickteam);

        maps = findViewById(R.id.map);


        pickteamIntent = new Intent(this, Allteams.class);
        int buttonClicked = getIntent().getIntExtra("buttonClicked", 0);


        if (buttonClicked == 1) {
            // Change the image when this extra is present
            changeImage();
        }
        if (buttonClicked == 2) {
            // Change the image when this extra is present
            changeImage1();
        }
        if (buttonClicked == 3) {
            // Change the image when this extra is present
            changeImage2();
        }
        if (buttonClicked == 4) {
            // Change the image when this extra is present
            changeImage4();
        }
        if (buttonClicked == 5) {
            // Change the image when this extra is present
            changeImage4();
        }
        if (buttonClicked == 6) {
            // Change the image when this extra is present
            changeImage5();
        }
        pickteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(pickteamIntent);

            }

        });

        teamAddress = findViewById(R.id.teampostal);

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMapWithAddress();

            }

        });
        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                details();

            }

        });

        TextView myTextView1 = findViewById(R.id.teaminfo);
        myTextView1.setVisibility(View.GONE);

        TextView myTextView2 = findViewById(R.id.teamname);
        myTextView2.setVisibility(View.GONE);

        TextView myTextView3 = findViewById(R.id.teampostal1);
        myTextView3.setVisibility(View.GONE);

        //info
        TextView myTextView4 = findViewById(R.id.teamnameanswer);
        myTextView4.setVisibility(View.GONE);

        TextView myTextView5 = findViewById(R.id.teamnameanswer2);
        myTextView5.setVisibility(View.GONE);

    }

    private void openMapWithAddress() {
        // Get the address from the EditText
        String address = teamAddress.getText().toString();
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode(address));
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    private void details() {
        Button yourButton = findViewById(R.id.submit);
        yourButton.setVisibility(View.INVISIBLE);

        Button yourButton1 = findViewById(R.id.map);
        yourButton1.setVisibility(View.INVISIBLE);

        EditText yourButton2 = findViewById(R.id.team);
        yourButton2.setVisibility(View.INVISIBLE);

        EditText yourButton3 = findViewById(R.id.teampostal);
        yourButton3.setVisibility(View.INVISIBLE);

        TextView myTextView = findViewById(R.id.textView);
        myTextView.setVisibility(View.INVISIBLE);

        //TeamInfo

        TextView myTextView1 = findViewById(R.id.teaminfo);
        myTextView1.setVisibility(View.VISIBLE);

        TextView myTextView2 = findViewById(R.id.teamname);
        myTextView2.setVisibility(View.VISIBLE);

        TextView myTextView3 = findViewById(R.id.teampostal1);
        myTextView3.setVisibility(View.VISIBLE);

        //info
        TextView myTextView4 = findViewById(R.id.teamnameanswer);
        myTextView4.setVisibility(View.VISIBLE);

        TextView myTextView5 = findViewById(R.id.teamnameanswer2);
        myTextView5.setVisibility(View.VISIBLE);

        EditText myTextView6 = findViewById(R.id.team);
        String address = myTextView6.getText().toString();

        myTextView4.setText(address);

        EditText myTextView7 = findViewById(R.id.teampostal);
        String myTextView101 = myTextView7.getText().toString();

        myTextView5.setText(myTextView101);






    }

    private void changeImage() {
        // Change the image of the ImageButton
        pickteam.setImageResource(R.drawable.ic_logo_05);
    }
    private void changeImage1() {
        // Change the image of the ImageButton
        pickteam.setImageResource(R.drawable.ic_logo_04);
    }
    private void changeImage2() {
        // Change the image of the ImageButton
        pickteam.setImageResource(R.drawable.ic_logo_03);
    }
    private void changeImage3() {
        // Change the image of the ImageButton
        pickteam.setImageResource(R.drawable.ic_logo_02);
    }
    private void changeImage4() {
        // Change the image of the ImageButton
        pickteam.setImageResource(R.drawable.ic_logo_01);
    }
    private void changeImage5() {
        // Change the image of the ImageButton
        pickteam.setImageResource(R.drawable.ic_logo_00);
    }





}