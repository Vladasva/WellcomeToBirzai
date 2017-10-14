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

public class GrainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView description = (TextView) findViewById(R.id.about);
        description.setText("Sodeliškis Manor Homestead offers The Way of the Grain tours, which includes a tour of the homestead, the organic farm and the authentic early 20th c. Aukštaitian homestead. The visitors will be able to see a working windmill built in 1924 and a collection of old-fashioned bikes, cars, tractors, steam machinery and the deer, fallow deer and moufflons kept at the farm. During the tour they will also have an opportunity to taste home-made bread, cheese, venison and even bake their own bread. The Way of the Bread is intended for groups of at least 10 people. The educational program includes a tour of the homestead and deer breeding farm. Price per person — 14 €.");

        //Sets the information to Working Hours paragraph
        TextView hours = (TextView) findViewById(R.id.hours);
        hours.setText("Arranged");

        //Sets the information to Contacts paragraph
        TextView contacts = (TextView) findViewById(R.id.contacts);
        contacts.setText("Phone: +370 614 02160\nE-mail: sodeliskiudvaras@gmail.com\nwww.sodeliskiudvaras.lt");

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.bread1);

        Button button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open map activity in response to button click
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("https://www.google.lt/maps/place/Sodeli%C5%A1ki%C5%B3+dvaro+sodyba/@56.2911545,24.6031707,13z/data=!4m5!3m4!1s0x46e8ece3ed0cdb35:0x45f78d5af3388f91!8m2!3d56.2911545!4d24.6381896");

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
