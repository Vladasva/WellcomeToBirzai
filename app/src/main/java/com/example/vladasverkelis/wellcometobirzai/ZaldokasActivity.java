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
 * Created by vladasverkelis on 03/05/2017.
 */

public class ZaldokasActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //Sets the information to About paragraph
        TextView description = (TextView) findViewById(R.id.about);
        description.setText("You will have the opportunity to see old brewery outfit, to discover technologies of home beer brewing, to experience the traditional hospitality of Highlanders. At the table with a white tablecloth, you will taste traditional beer of Biržai region, cheese and bread. Entertained by a folk group, which promotes an archaic regional style of music and songs, you should allow yourself the pleasure of playing on panpipes, blowing a horn, singing and dancing.");

        //Sets the information to Working Hours paragraph
        TextView hours = (TextView) findViewById(R.id.hours);
        hours.setText("Arranged");

        //Sets the information to Contacts paragraph
        TextView contacts = (TextView) findViewById(R.id.contacts);
        contacts.setText("Phone: +370 450 33390, +370 655 43845, +370 655 57738\nEmail: sela@birzumuziejus.lt, r.binkiene@birzumuziejus.lt\nhttp://www.birzumuziejus.lt/lt/zaldoko-alus");

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.zaldokas1);

        Button button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open map activity in response to button click
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("https://www.google.lt/maps/place/Bir%C5%BE%C5%B3+kra%C5%A1to+muziejus+%E2%80%9ES%C4%97la%E2%80%9C/@56.205023,24.7510433,17z/data=!3m1!4b1!4m5!3m4!1s0x46e88cef26fd6ebf:0xe5bbfa9b5a7d8084!8m2!3d56.20502!4d24.753232");

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
