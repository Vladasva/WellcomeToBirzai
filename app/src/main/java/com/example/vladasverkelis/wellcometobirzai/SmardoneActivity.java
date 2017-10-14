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

public class SmardoneActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_extra_extra);

        //Sets the information to About paragraph
        TextView description = (TextView) findViewById(R.id.about);
        description.setText("The Smardonė Spring was formed by karst processes. Bitterish in taste and smelling water inspired local people to name it as Stinky Spring. The the water of the spring is beneficial for sick people: to drink, to wash eyes, or to soak ailing hands or legs directly in the spring. Healing properties of water of the Smardonė Spring were mentioned for the first time in the sources in 1587. When Likėnai Water-cure Resort was opened in 1938, there was no bores and water was drawn from springs, including the big Smardonė Spring. Water was used to treat various ailments, for baths and diluting the healing mud.");

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.smardone1);

        Button button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open map activity in response to button click
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("https://www.google.lt/maps/place/Smardon%C4%97/@56.20007,24.6213873,17z/data=!3m1!4b1!4m5!3m4!1s0x46e89271aecfd219:0x5ad544f265f82f18!8m2!3d56.200067!4d24.623576");

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
