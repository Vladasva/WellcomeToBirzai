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

public class RidingActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView description = (TextView) findViewById(R.id.about);
        description.setText("Stables in the village Drąseikiai invites to ride their horses. Their horses are well trained and calm. They have riding hall and suggest to ride in the forests and fields. There are possible individual riding lessons and nature tours. A one-hour riding costs 14,48 €. A package of 10 hours costs 86,89 €.Since May 1 day to September 30 day - 101,37 €");

        //Sets the information to Working Hours paragraph
        TextView hours = (TextView) findViewById(R.id.hours);
        hours.setText("I - VII from 10.00 to 19.00. ");

        //Sets the information to Contacts paragraph
        TextView contacts = (TextView) findViewById(R.id.contacts);
        contacts.setText("Phone: +370 69924879,\nEmail: saasigitas@gmail.com");

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.horses1);

        Button button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open map activity in response to button click
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("https://www.google.lt/maps/place/Dr%C4%85seikiai/@56.2439026,24.6898381,12z/data=!4m5!3m4!1s0x46e8f2d71087b101:0xe8cc5de6eb67cf59!8m2!3d56.2424899!4d24.759152");

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
