package com.example.vladasverkelis.wellcometobirzai;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by vladasverkelis on 06/04/2017.
 */

public class HotelActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        //Create an array list of historical places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Tyla", R.drawable.tyla));
        places.add(new Place("Helveda", R.drawable.helveda));
        places.add(new Place("Camping", R.drawable.camping));
        places.add(new Place("Sodeliškių dvaras", R.drawable.sodeliskis));


        //Create an {@link WordAdapter}, whose data source is a list of {@link Place}s. The.
        //adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.category_hotel);

        //Find the {@link ListView} object 1 in the view hierarchy of the {@link Activity).
        //There should be a {@ link ListView) with the view ID called list, which is declared in the
        //list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        //Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        //{@link ListView} will display list items for each {@link Place) in the list.
        listView.setAdapter(adapter);

        //Set a click listener to open a new activity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Each case is a different activity
                switch (position) {
                    case 0:
                        Intent newActivity = new Intent(HotelActivity.this, TylaActivity.class);
                        startActivity(newActivity);
                        break;
                    case 1:
                        Intent newActivity1 = new Intent(HotelActivity.this, HelvedaActivity.class);
                        startActivity(newActivity1);
                        break;
                    case 2:
                        Intent newActivity2 = new Intent(HotelActivity.this, CampingActivity.class);
                        startActivity(newActivity2);
                        break;
                    case 3:
                        Intent newActivity3 = new Intent(HotelActivity.this, SodeliskisActivity.class);
                        startActivity(newActivity3);
                        break;
                }
            };

        });
    }
}