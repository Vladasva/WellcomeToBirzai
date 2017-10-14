package com.example.vladasverkelis.wellcometobirzai;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.vladasverkelis.wellcometobirzai.R.id.about;

/**
 * Created by vladasverkelis on 03/05/2017.
 */

public class ManteballActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView description = (TextView) findViewById(about);
        description.setText("The essence of the game is to kick the Monteball ball into the Monteball holes that are installed in the park´s field with as few kicks as possible. Monteball is unique by the natural obstacles formed by the cavities that players have to cross. The game lasts about 3-4 hours and can be played by both young and senior people with the number of players ranging from 5 to 63.");

        //Sets the information to Working Hours paragraph
        TextView hours = (TextView) findViewById(R.id.hours);
        hours.setText("Arranged");

        //Sets the information to Contacts paragraph
        TextView contacts = (TextView) findViewById(R.id.contacts);
        contacts.setText("Phone: + 370 65978169\nE-mail: sigitas@rinkuskiai.lt");

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.manteball1);

        Button button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open map activity in response to button click
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("https://www.google.lt/maps/place/Monteball/@56.2142676,24.6624891,14z/data=!4m5!3m4!1s0x46e88d71cb5ae4d9:0x1771f83e3af34bd7!8m2!3d56.2142676!4d24.6799986?hl=en");

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
