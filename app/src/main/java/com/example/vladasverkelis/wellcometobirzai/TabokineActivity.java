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

public class TabokineActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_extra_extra);

        //Sets the information to About paragraph
        TextView description = (TextView) findViewById(R.id.about);
        description.setText("The Outcrop of Tabokinė is a Devon rock formation with vertical walls situated in two levels and not continuous. The upper scarp is particularly interesting: it is 3 to 4 metres high and is composed of dolomite strata with cracks forming larges pieces of rock. Following the pattern of cracks, birches and other trees grow on the wall.\n" +
                "Village of Tabokinė, eldership of Nemunėlio Radviliškis, district of Biržai");

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.tabokine1);

        Button button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open map activity in response to button click
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("https://www.google.lt/maps/place/Tabokin%C4%97+41465/@56.4133418,24.827238,13z/data=!4m5!3m4!1s0x46e8faaddb650725:0x7e63bf4c15fcc13a!8m2!3d56.4133389!4d24.8622569");

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
