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
 * Created by vladasverkelis on 25/04/2017.
 */

public class VabalninkasChurchActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //Sets the information to About paragraph
        TextView description = (TextView) findViewById(R.id.about);
        description.setText("The church was built in 1817. It has Neo- Classicism and Neo-Baroque elements.");

        //Sets the information to Working Hours paragraph
        TextView hours = (TextView) findViewById(R.id.hours);
        hours.setText("Worship services:\nSunday: 8:00, 10,00\nWorkings days: 8.00");

        //Sets the information to Contacts paragraph
        TextView contacts = (TextView) findViewById(R.id.contacts);
        contacts.setText("Tel: (450) 5 46 64");

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.vabalninkaschurch1);

        Button button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open map activity in response to button click
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("https://www.google.lt/maps/place/Vabalninko+Svc.+Mergeles+Marijos+emimo+i+dangu+baznycia/@55.9792696,24.7433146,17z/data=!3m1!4b1!4m5!3m4!1s0x46e887611a715261:0x515835cb74d5b481!8m2!3d55.9792696!4d24.7455033");

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
