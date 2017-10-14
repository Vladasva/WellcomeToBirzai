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

public class KupreliskisChurchActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //Sets the information to About paragraph
        TextView description = (TextView) findViewById(R.id.about);
        description.setText("The church was built  in 1897. It is wooden folk style. The wooden church features folk architecture with some Baroque elements.");

        //Sets the information to Working Hours paragraph
        TextView hours = (TextView) findViewById(R.id.hours);
        hours.setText("Worship services:\nSunday: 11:00");

        //Sets the information to Contacts paragraph
        TextView contacts = (TextView) findViewById(R.id.contacts);
        contacts.setText("Not available");

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.kupreliskischurch1);

        Button button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open map activity in response to button click
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("https://www.google.lt/maps/place/Kupreliskio+Sv.+Arkangelo+Mykolo+Parapija/@56.0415723,24.9635815,17z/data=!3m1!4b1!4m5!3m4!1s0x46e8637bea349153:0x4c3f1a9ef9230374!8m2!3d56.0415723!4d24.9657702");

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
