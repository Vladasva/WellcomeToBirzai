package com.example.vladasverkelis.wellcometobirzai;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.vladasverkelis.wellcometobirzai.R.id.contacts;

/**
 * Created by vladasverkelis on 03/05/2017.
 */

public class BirzuAlusActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView description = (TextView) findViewById(R.id.about);
        description.setText("You will visit one of the oldest breweries in Lithuania. A long-forgotten old cellar, by chance discovered during a reconstruction, has been renewed and turned into a splendid venue for reception of visitors. An in-depth tour of the brewery and tasting of beer is available on request at additional charge. ");

        //Sets the information to Working Hours paragraph
        TextView hours = (TextView) findViewById(R.id.hours);
        hours.setText("Arranged");

        //Sets the information to Contacts paragraph
        TextView contacts = (TextView) findViewById(R.id.contacts);
        contacts.setText("Phone: +370 616 16 514\nE-mail: artsa@birzualus.lt\nhttp://birzualus.lt/en/beer-tour/");


        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.birzualus1);

        Button button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open map activity in response to button click
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("https://www.google.lt/maps/place/Birzu+alus/@56.1892403,24.6886437,13z/data=!4m8!1m2!2m1!1sbirzu+bravoras!3m4!1s0x46e88cf20e6c8643:0xe667beb23744d2cf!8m2!3d56.1998244!4d24.7523681");

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
