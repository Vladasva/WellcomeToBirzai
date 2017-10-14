package com.example.vladasverkelis.wellcometobirzai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the View that shows the hitorical places activity
        TextView historical = (TextView) findViewById(R.id.historical);

        //Set a click listener on that View
        historical.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the historical places category is clicked on.
            @Override
            public void onClick(View v) {
                //Create a new intent to open the (@link HistoricalActivity)
                Intent historicalIntent = new Intent(MainActivity.this, HistoricalActivity.class);

                //Start the new activity
                startActivity(historicalIntent);
            }
        });
        //Find the View that shows the hitorical places activity
        TextView nature = (TextView) findViewById(R.id.nature);

        //Set a click listener on that View
        nature.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the nature objects category is clicked on.
            @Override
            public void onClick(View v) {
                //Create a new intent to open the (@link NatureActivity)
                Intent natureIntent = new Intent(MainActivity.this, NatureActivity.class);

                //Start the new activity
                startActivity(natureIntent);
            }
        });
        //Find the View that shows the entertainment places activity
        TextView entertainment = (TextView) findViewById(R.id.entertaiment);

        //Set a click listener on that View
        entertainment.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the entertainment places category is clicked on.
            @Override
            public void onClick(View v) {
                //Create a new intent to open the (@link EntertainmentActivity)
                Intent entertainmentIntent = new Intent(MainActivity.this, EntertainmentActivity.class);

                //Start the new activity
                startActivity(entertainmentIntent);
            }
        });
        //Find the View that shows the food places activity
        TextView food = (TextView) findViewById(R.id.food);

        //Set a click listener on that View
        food.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the food places category is clicked on.
            @Override
            public void onClick(View v) {
                //Create a new intent to open the (@link FoodActivity)
                Intent foodIntent = new Intent(MainActivity.this, FoodActivity.class);

                //Start the new activity
                startActivity(foodIntent);
            }
        });
        //Find the View that shows the guests' houses and hotels activity
        TextView hotel = (TextView) findViewById(R.id.hotel);

        //Set a click listener on that View
        hotel.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the guests' houses and hotels' category is clicked on.
            @Override
            public void onClick(View v) {
                //Create a new intent to open the (@link HotelActivity)
                Intent hotelIntent = new Intent(MainActivity.this, HotelActivity.class);

                //Start the new activity
                startActivity(hotelIntent);
            }
        });
    }
}
