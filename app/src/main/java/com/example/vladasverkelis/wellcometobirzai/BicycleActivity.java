package com.example.vladasverkelis.wellcometobirzai;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.vladasverkelis.wellcometobirzai.R.drawable.bicycle;
import static com.example.vladasverkelis.wellcometobirzai.R.id.hours;

/**
 * Created by vladasverkelis on 03/05/2017.
 */

public class BicycleActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView description = (TextView) findViewById(R.id.about);
        description.setText("At Biržai tourism information centre you can find free fliers with all the information about sightseeing sites and plan a convenient bicycle route. If you do not have your own bicycle, you are welcome to rent it in UAB Evadinamika");

        //Sets the information to Working Hours paragraph
        TextView hours = (TextView) findViewById(R.id. hours);
        hours.setText("Arranged");

        //Sets the information to Contacts paragraph
        TextView contacts = (TextView) findViewById(R.id.contacts);
        contacts.setText("Phone: 8 450 31370, +370 650 25129\nEmail: nfo@evadinamika.lt");

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.bike);

        Button button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open map activity in response to button click
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("https://www.google.lt/maps/place/Vytauto+g.+5,+Bir%C5%BEai+41171/@56.2040483,24.7570016,17z/data=!3m1!4b1!4m5!3m4!1s0x46e88cec044bc0b3:0x602be1113e169900!8m2!3d56.2040453!4d24.7591903");

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
