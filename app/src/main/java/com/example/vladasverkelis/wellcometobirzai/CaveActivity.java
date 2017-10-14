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

public class CaveActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_extra_extra);

        //Sets the information to About paragraph
        TextView description = (TextView) findViewById(R.id.about);
        description.setText("The Cave of Velniapilis is a dolomite outcrop. Its bottom part overhangs the surface of the River Nemunėlis by 3 metres and is located at 6 metres distance from the bed of the river. The Cave of Velniapilis is classified as a geological monument of nature of national significance from 1964. It is in a relatively good state and is naturally preserved.");

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.cave1);

        Button button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open map activity in response to button click
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("https://www.google.lt/maps/place/Velniapilio+uola/@56.38449,24.6308722,12z/data=!4m5!3m4!1s0x46e8eee0b7d78721:0x32b2a55e4ad18d63!8m2!3d56.38449!4d24.70091");

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
