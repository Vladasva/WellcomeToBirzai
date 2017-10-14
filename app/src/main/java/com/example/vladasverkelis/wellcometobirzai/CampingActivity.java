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

public class CampingActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //Sets the information to About paragraph
        TextView description = (TextView) findViewById(R.id.about);
        description.setText("A nice place to stay in the nice environment.");

        //Sets the information to Working Hours paragraph
        TextView hours = (TextView) findViewById(R.id.hours);
        hours.setText("8.00 – 23.00 during season (from 01.06 to 30.09)\n10.00 – 19.00 during non-season  (from 01.10 to 31.05)");

        //Sets the information to Contacts paragraph
        TextView contacts = (TextView) findViewById(R.id.contacts);
        contacts.setText("Phone: +370 651 75669, +370 672 27093\nE-mail: prie.igriuvele@gmail.com");

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.camping1);

        Button button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open map activity in response to button click
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("https://www.google.lt/maps/place/J.+Basanavi%C4%8Diaus+g.+69A,+Bir%C5%BEai+41167/@56.2106902,24.769123,17z/data=!3m1!4b1!4m5!3m4!1s0x46e88cc059d46a77:0xa869cacade3e157e!8m2!3d56.2106902!4d24.7713117");

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
