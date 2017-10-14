package com.example.vladasverkelis.wellcometobirzai;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.vladasverkelis.wellcometobirzai.R.id.hours;

/**
 * Created by vladasverkelis on 02/05/2017.
 */

public class GeidziunaiChurchActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //Sets the information to About paragraph
        TextView description = (TextView) findViewById(R.id.about);
        description.setText("This church was built  in 1917. It is wooden folk style.");

        //Sets the information to Working Hours paragraph
        TextView hours = (TextView) findViewById(R.id.hours);
        hours.setText("Worship services:\nSunday:14:00");

        //Sets the information to Contacts paragraph
        TextView contacts = (TextView) findViewById(R.id.contacts);
        contacts.setText("Not available");

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.geidziunaichurch1);

        Button button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open map activity in response to button click
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("https://www.google.lt/maps/place/Geid%C5%BEi%C5%ABn%C5%B3+%C5%A0v.+Angel%C5%B3+Sarg%C5%B3+ba%C5%BEny%C4%8Dia/@56.1107133,24.7919483,14z/data=!4m13!1m7!3m6!1s0x46e8899c0343380b:0x48d7649ea006ca6b!2zR2VpZMW-acWrbmFpIDQxMjYz!3b1!8m2!3d56.1097619!4d24.8107569!3m4!1s0x0:0x798294e2db5680bc!8m2!3d56.1075656!4d24.8075312");

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
