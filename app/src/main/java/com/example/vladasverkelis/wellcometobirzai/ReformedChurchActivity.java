package com.example.vladasverkelis.wellcometobirzai;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by vladasverkelis on 23/04/2017.
 */

public class ReformedChurchActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //Sets the information to About paragraph
        TextView description = (TextView) findViewById(R.id.about);
        description.setText("Evangelical Reformed Church was built in 1874 in Neo-Gothic style. The building of the church was funded by the congregation. It became the centre of the reformation of the North Lithuania. All elements of it are unique and magnificent. Neo-Gothic interior is made of wood: tables, benches, a large stand for the organ, a pulpit etc.");

        //Sets the information to Working Hours paragraph
        TextView hours = (TextView) findViewById(R.id.hours);
        hours.setText("Worship services:\nEach Sunday: 11:00");

        //Sets the information to Contacts paragraph
        TextView contacts = (TextView) findViewById(R.id.contacts);
        contacts.setText("Mobile: +370 686 66383\nTel: (8-450) 35 100\nE-mail: birzai@ref.lt\nwww.ref.lt");

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.reformedchurch1);

        Button button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open map activity in response to button click
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("https://www.google.lt/maps/place/Lietuvos+evangeliku+reformatu+baznycios-Unitas+Lithuaniae-Sinodas/@56.2077863,24.7564225,17z/data=!3m1!4b1!4m5!3m4!1s0x46e88cebfa8a77d9:0xba8c92af54d4ab87!8m2!3d56.2077863!4d24.7586112");

                // Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

                // Make the Intent explicit by setting the Google Maps package
                mapIntent.setPackage("com.google.android.apps.maps");

                // Attempt to start an activity that can handle the Intent
                startActivity(mapIntent);
            }
        });
    }
    }

