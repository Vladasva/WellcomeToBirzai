package com.example.vladasverkelis.wellcometobirzai;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.description;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;
import static android.media.CamcorderProfile.get;
import static android.os.Build.VERSION_CODES.M;
import static com.example.vladasverkelis.wellcometobirzai.R.id.historical;
import static com.example.vladasverkelis.wellcometobirzai.R.id.nature;

/**
 * Created by vladasverkelis on 04/04/2017.
 */

public class HistoricalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        //Create an array list of historical places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Birzai Castle", R.drawable.pilis));
        places.add(new Place("Astravas Manor", R.drawable.astravas));
        places.add(new Place("St. John’s the baptist church", R.drawable.catholicchurch));
        places.add(new Place("Evangelical Reformed Church", R.drawable.reformedchurch));
        places.add(new Place("Holy Trinity Church (Parish of Pabirze)", R.drawable.trinitychurch));
        places.add(new Place("Assumption of the Blessed Virgin Mary Church", R.drawable.vabalninkaschurch));
        places.add(new Place("Holy Virgin Mary Church", R.drawable.papilyscatholicchurch));
        places.add(new Place("Evangelical Reformed Church of Papilys", R.drawable.papilysreformedchurch));
        places.add(new Place("Holy Angels Custodians Church ", R.drawable.geidziunaichurch));
        places.add(new Place("St. Michael the Archangel Church", R.drawable.kupreliskischurch));
        places.add(new Place("Evangelical Reformed Church", R.drawable.radviliskisreformedchurch));
        places.add(new Place("Holy virgin Mary Church", R.drawable.radviliskiscatholicchurch));
        places.add(new Place("Church of Crucified Jesus", R.drawable.smilgiaichurch));


        //Create an {@link WordAdapter}, whose data source is a list of {@link Place}s. The.
        //adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.category_historical);

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
                        Intent newActivity = new Intent(HistoricalActivity.this, CastleActivity.class);
                        startActivity(newActivity);
                        break;
                    case 1:
                        Intent newActivity1 = new Intent(HistoricalActivity.this, ManorActivity.class);
                        startActivity(newActivity1);
                        break;
                    case 2:
                        Intent newActivity2 = new Intent(HistoricalActivity.this, CatholicChurchActivity.class);
                        startActivity(newActivity2);
                        break;
                    case 3:
                        Intent newActivity3 = new Intent(HistoricalActivity.this, ReformedChurchActivity.class);
                        startActivity(newActivity3);
                        break;
                    case 4:
                        Intent newActivity4 = new Intent(HistoricalActivity.this, TrinityChurchActivity.class);
                        startActivity(newActivity4);
                        break;
                    case 5:
                        Intent newActivity5 = new Intent(HistoricalActivity.this, VabalninkasChurchActivity.class);
                        startActivity(newActivity5);
                        break;
                    case 6:
                        Intent newActivity6 = new Intent(HistoricalActivity.this, PapilysChurchActivity.class);
                        startActivity(newActivity6);
                        break;
                    case 7:
                        Intent newActivity7 = new Intent(HistoricalActivity.this, PapilysReformedChurchActivity.class);
                        startActivity(newActivity7);
                        break;
                    case 8:
                        Intent newActivity8 = new Intent(HistoricalActivity.this, GeidziunaiChurchActivity.class);
                        startActivity(newActivity8);
                        break;
                    case 9:
                        Intent newActivity9 = new Intent(HistoricalActivity.this, KupreliskisChurchActivity.class);
                        startActivity(newActivity9);
                        break;
                    case 10:
                        Intent newActivity10 = new Intent(HistoricalActivity.this, RadviliskisReformedChurchActivity.class);
                        startActivity(newActivity10);
                        break;
                    case 11:
                        Intent newActivity11 = new Intent(HistoricalActivity.this, RadviliskisCatholicChurchActivity.class);
                        startActivity(newActivity11);
                        break;
                    case 12:
                        Intent newActivity12 = new Intent(HistoricalActivity.this, SmilgiaiChurchActivity.class);
                        startActivity(newActivity12);
                        break;

                }
            };

        });
}
}

