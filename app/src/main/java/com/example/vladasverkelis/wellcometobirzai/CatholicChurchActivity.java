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
 * Created by vladasverkelis on 23/04/2017.
 */

public class CatholicChurchActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //Sets the information to About paragraph
        TextView description = (TextView) findViewById(R.id.about);
        description.setText("The church has Neo-Classicism and Baroque elements. It was built in 19th century. There are three altars with impressive paintings. The church was consecrated in 1879. It was sponsored by Count Jonas Tiškevičius. The Architect was Laurynas Cezaris Anikinis (Lorenzo Cezare Anichini). The church has been repaired and embellished with the help of the parish priest, Juozas Rimkevičius.");

        //Sets the information to Working Hours paragraph
        TextView hours = (TextView) findViewById(R.id.hours);
        hours.setText("Worship services:\nSunday: 8:00, 9:30, 11:00, 18:00\nSaturday: 8:00, 11:00, 18:00\nWorking-day: 7:00, 18:00\nFriday (the first Friday of a month): 11:00 (Adoration: 10:00)");

        //Sets the information to Contacts paragraph
        TextView contacts = (TextView) findViewById(R.id.contacts);
        contacts.setText("Tel: (450) 3 26 43\nE-mail: birzuparapija@hotmail.com\nWebsite: www.birzuparapija.lt");

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.catholicchurch1);

        Button button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open map activity in response to button click
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("https://www.google.lt/maps/place/St+John+the+Baptist's+Church,+Birzai/@56.2039328,24.7548206,17z/data=!3m1!4b1!4m5!3m4!1s0x46e88ceea564fd77:0xeefecf5247fd7ed!8m2!3d56.2039328!4d24.7570093");

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
