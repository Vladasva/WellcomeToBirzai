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

public class MuoriskiaiActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_extra_extra);

        //Sets the information to About paragraph
        TextView description = (TextView) findViewById(R.id.about);
        description.setText("The Outcrop of Muoriškiai was formed during a long process of deep and lateral erosion. Most impressive and fascinating, with nearly vertical continuous wall around 7.5 metres high stretches over 80 metres along the riverbed of Nemunėlis. At areas close to water of the River Nemunėlis, layers of light bluish marl and clay dominate with occasional small shells on the surface.\n" +
                "Village of Muoriškiai, eldership of Nemunėlio Radviliškis, district of Biržai");

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.muoriskes1);

        Button button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open map activity in response to button click
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("https://www.google.lt/maps/place/Muori%C5%A1kiai+41466/@56.4116029,24.7737501,13z/data=!4m5!3m4!1s0x46e8ef8b2a5c984b:0x4a7d9934dc31b50f!8m2!3d56.4116!4d24.808769");

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
