package com.example.vladasverkelis.wellcometobirzai;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**pilis1.jpg
         * Created by vladasverkelis on 11/04/2017.
         */

        public class CastleActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //Sets the information to About paragraph
        TextView description = (TextView) findViewById(R.id.about);
        description.setText("It is a Dutch-style fortress with bastions built by the Dukes’ Radvila family and used to defend northern boarders of Lithuania in the 17th -18th centuries. The castle was destroyed in 1704. It was rebuilt in 1978-1988. In the castle now you can find “Sėla” museum.");

        //Sets the information to Working Hours paragraph
        TextView hours = (TextView) findViewById(R.id.hours);
        hours.setText("October to April:\nWed-Sat 9 am - 5.30 pm; Tue and Sun 9 am - 4.30 pm.\nApril to\nOctober:\nWed-Sat 10 am - 6.30 pm; Tue and Sun 10 am - 5.30 pm\nThe museum is closed on Mondays.\nLast entry to the museum is 30 minutes before the closing ");

        //Sets the information to Contacts paragraph
        TextView contacts = (TextView) findViewById(R.id.contacts);
        contacts.setText("Phone: +370 450 33390\nCell phone: +370 655 57738\nfax: +370 450 31883\ne-mail: sela@birzumuziejus.lt");

//        contacts.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:+370 450 33390"));
//                startActivity(intent);
//            }
//        });


        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.pilis1);

        Button button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open map activity in response to button click
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("https://www.google.lt/maps/place/Bir%C5%BE%C5%B3+kra%C5%A1to+muziejus+%E2%80%9ES%C4%97la%E2%80%9C/@56.114496,24.6212367,11.09z/data=!4m8!1m2!2m1!1sbirzu+pilis!3m4!1s0x46e88cef26fd6ebf:0xe5bbfa9b5a7d8084!8m2!3d56.20502!4d24.753232");

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







