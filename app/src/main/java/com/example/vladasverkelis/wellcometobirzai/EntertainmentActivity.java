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
 * Created by vladasverkelis on 05/04/2017.
 */

public class EntertainmentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        //Create an array list of historical places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Beer program of Zaldokas", R.drawable.zaldokas));
        places.add(new Place("The Brewary of Birzu alus", R.drawable.brizaibrewary));
        places.add(new Place("The Brewery of Rinkuskiai", R.drawable.rinkuskiaibrewary));
        places.add(new Place("The Brewery of Butautai", R.drawable.butautai));
        places.add(new Place("Birzai Aero club", R.drawable.aero));
        places.add(new Place("Manteball", R.drawable.manteball));
        places.add(new Place("Riding services ", R.drawable.zirgai));
        places.add(new Place("The way of grain ", R.drawable.grain));
        places.add(new Place("Bicycle rent", R.drawable.bicycle));
        places.add(new Place("Sheep clothing and food", R.drawable.sheep));


        //Create an {@link WordAdapter}, whose data source is a list of {@link Place}s. The.
        //adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.category_entertainment);

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
                        Intent newActivity = new Intent(EntertainmentActivity.this, ZaldokasActivity.class);
                        startActivity(newActivity);
                        break;
                    case 1:
                        Intent newActivity1 = new Intent(EntertainmentActivity.this, BirzuAlusActivity.class);
                        startActivity(newActivity1);
                        break;
                    case 2:
                        Intent newActivity2 = new Intent(EntertainmentActivity.this, RinkuskiaiActivity.class);
                        startActivity(newActivity2);
                        break;
                    case 3:
                        Intent newActivity3 = new Intent(EntertainmentActivity.this, ButautaiActivity.class);
                        startActivity(newActivity3);
                        break;
                    case 4:
                        Intent newActivity4 = new Intent(EntertainmentActivity.this, AeroActivity.class);
                        startActivity(newActivity4);
                        break;
                    case 5:
                        Intent newActivity5 = new Intent(EntertainmentActivity.this, ManteballActivity.class);
                        startActivity(newActivity5);
                        break;
                    case 6:
                        Intent newActivity6 = new Intent(EntertainmentActivity.this, RidingActivity.class);
                        startActivity(newActivity6);
                        break;
                    case 7:
                        Intent newActivity7 = new Intent(EntertainmentActivity.this, GrainActivity.class);
                        startActivity(newActivity7);
                        break;
                    case 8:
                        Intent newActivity8 = new Intent(EntertainmentActivity.this, BicycleActivity.class);
                        startActivity(newActivity8);
                        break;
                    case 9:
                        Intent newActivity9 = new Intent(EntertainmentActivity.this, SheepActivity.class);
                        startActivity(newActivity9);
                        break;

                }
            };

        });
    }
    }
