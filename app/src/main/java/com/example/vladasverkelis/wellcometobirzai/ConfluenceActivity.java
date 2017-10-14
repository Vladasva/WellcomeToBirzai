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

public class ConfluenceActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_extra_extra);

        //Sets the information to About paragraph
        TextView description = (TextView) findViewById(R.id.about);
        description.setText("A beautiful valley is a perfect placte to stop and admire the confluence of two rivers: Nemunėlis and Apaščia. It is closed to Reformed Church of Nemunėlio Radviliškis.");

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.confluence1);

        Button button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open map activity in response to button click
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("https://www.google.lt/maps/place/Nemun%C4%97lio+Radvili%C5%A1kio+evangelik%C5%B3+reformat%C5%B3+ba%C5%BEny%C4%8Dia/@56.4000643,24.7681278,17z/data=!3m1!4b1!4m5!3m4!1s0x46e8ef988e6e6d6b:0xcc30b5777a17012e!8m2!3d56.4000614!4d24.7703165");

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
