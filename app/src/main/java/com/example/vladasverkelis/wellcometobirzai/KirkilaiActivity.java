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
 * Created by vladasverkelis on 02/05/2017.
 */

public class KirkilaiActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_extra_extra);

        //Sets the information to About paragraph
        TextView description = (TextView) findViewById(R.id.about);
        description.setText("In the region full of sinkholes, this area is unique because of the highest density of sinkholes (more than 200 items per sq. km) and in particular circular lakelets. A circular lake indicates that the lake evolved from a collapsed sinkhole. When a sinkhole collapsed to expose the water table at the surface, the sinkhole was filled with water forming a small circular lake. A footpath runs across area making it possible to have a close look at these exceptional water bodies. This is one of two habitats in Europe where green sulphur bacteria (GSB) and purple sulphur bacteria (PSB) are present, the second one is in Italy.");

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.kirkilai1);

        Button button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open map activity in response to button click
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("https://www.google.lt/maps/place/Kirkil%C5%B3+e%C5%BEer%C4%97liai+ir+Ap%C5%BEvalgos+bok%C5%A1tas/@56.2478447,24.6207583,12z/data=!4m5!3m4!1s0x46e88d553bbe6c43:0x597898a0b3a95d5!8m2!3d56.2478447!4d24.6907961");

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
