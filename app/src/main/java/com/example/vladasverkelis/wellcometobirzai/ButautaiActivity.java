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
 * Created by vladasverkelis on 03/05/2017.
 */

public class ButautaiActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView description = (TextView) findViewById(R.id.about);
        description.setText("Butautu Manor was built more than 250 years ago in Birzai district. During that time it was destroyed and enthusiastically restored few times until it became the centre of beer region. Today you can participate in a guided tour throughout the brewery, find out the secrets of manor and sample beer that is being produced in this brewery, hosts will serve not only beer, but also gourmet venison dishes and delicious snacks.");

        //Sets the information to Working Hours paragraph
        TextView hours = (TextView) findViewById(R.id.hours);
        hours.setText("Arranged");

        //Sets the information to Contacts paragraph
        TextView contacts = (TextView) findViewById(R.id.contacts);
        contacts.setText("Phone: +37066232510, +37068583343\nEmail: ramune@butautu.lt\nwww.butautu.lt");

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.butautai1);

        Button button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open map activity in response to button click
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("https://www.google.lt/maps/place/Butautu+dvaro+bravoras,+padalinys/@56.0061097,23.924279,9z/data=!4m8!1m2!2m1!1sbutautu+dvaras!3m4!1s0x46e8ecc0603629db:0x41f2d9655a37e59b!8m2!3d56.288051!4d24.6047239");

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
