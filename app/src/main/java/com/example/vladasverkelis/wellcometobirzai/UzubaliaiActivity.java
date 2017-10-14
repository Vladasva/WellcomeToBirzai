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

public class UzubaliaiActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_extra_extra);

        //Sets the information to About paragraph
        TextView description = (TextView) findViewById(R.id.about);
        description.setText("The Užubaliai Wetlands Reserveis situated in the area of a former peat bog. The reserve is an amazing sanctuary for a wide variety of water and terrestrial plants and animals. There are many beaver dams. These wetlands attract flocks of birds to the delight of ornithologists and birdwatchers. The reserve has an observation tower for watching wildlife. Užubaliai is a great place to escape the noise of cities and enjoy the tranquillity of nature.");

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.uzubaliai1);

        Button button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open map activity in response to button click
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("https://www.google.lt/maps/place/U%C5%BEubaliai/@56.2192969,24.4924817,11z/data=!4m5!3m4!1s0x46e892892ba51331:0x7d655ebe38e5603a!8m2!3d56.21967!4d24.633335");

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
