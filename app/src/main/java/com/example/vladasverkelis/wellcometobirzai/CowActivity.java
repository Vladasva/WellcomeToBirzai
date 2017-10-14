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

public class CowActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_extra_extra);

        //Sets the information to About paragraph
        TextView description = (TextView) findViewById(R.id.about);
        description.setText("It is the most famous and best-explored geological monument of nature of national significance (classified from 1964) located in the North of Lithuania. The spot is marked by a wooden post bearing carved inscriptions: ‘Cow’s Cave’ and ‘Nature heritage object’. The Cow’s Cave is a funnel-shaped, almost round sinkhole. According to speleologists, it appeared around 200 years ago. It is 10-12 metres in diameter and around 12.6 metres deep. An opening is at the bottom of sinkhole Village of Karajimiškis, district of Biržai");

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.cow1);

        Button button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open map activity in response to button click
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("https://www.google.lt/maps/place/Karv%C4%97s+ola/@56.2067279,24.6922552,17z/data=!3m1!4b1!4m5!3m4!1s0x46e88d0c79f13809:0x1cb9a59980c876ed!8m2!3d56.2067279!4d24.6944439");

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
