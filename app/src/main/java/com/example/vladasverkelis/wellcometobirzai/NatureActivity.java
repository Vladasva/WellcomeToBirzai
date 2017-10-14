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

public class NatureActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

            //Create an array list of historical places
            final ArrayList<Place> places = new ArrayList<Place>();
            places.add(new Place("Smardone spring", R.drawable.smardone));
            places.add(new Place("Cow’s cave(Karves ola)", R.drawable.cowcave));
            places.add(new Place("Karst Lakelets in Kirkilai", R.drawable.kirkilai));
            places.add(new Place("Footpath in Užubaliai", R.drawable.uzubaliai));
            places.add(new Place("Cave of Velniapilis (Velniapilio ola)", R.drawable.velniapilis));
            places.add(new Place("Confluence of the rivers Nemunėlis and Apaščia", R.drawable.santaka));
            places.add(new Place("Outcrop of  Muoriškiai ", R.drawable.muoriskes));
            places.add(new Place("Outcrop of Tabokinė ", R.drawable.tabokine));
            places.add(new Place("The northernmost point of Lithuania ", R.drawable.siauriausiastaskas));
            places.add(new Place("Juodžionys field of erratic boulders", R.drawable.juodzionys));


            //Create an {@link WordAdapter}, whose data source is a list of {@link Place}s. The.
            //adapter knows how to create list items for each item in the list.
            PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.category_nature);

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
                            Intent newActivity = new Intent(NatureActivity.this, SmardoneActivity.class);
                            startActivity(newActivity);
                            break;
                        case 1:
                        Intent newActivity1 = new Intent(NatureActivity.this, CowActivity.class);
                        startActivity(newActivity1);
                        break;
                        case 2:
                            Intent newActivity2 = new Intent(NatureActivity.this, KirkilaiActivity.class);
                            startActivity(newActivity2);
                            break;
                        case 3:
                            Intent newActivity3 = new Intent(NatureActivity.this, UzubaliaiActivity.class);
                            startActivity(newActivity3);
                            break;
                        case 4:
                            Intent newActivity4 = new Intent(NatureActivity.this, CaveActivity.class);
                            startActivity(newActivity4);
                            break;
                        case 5:
                            Intent newActivity5 = new Intent(NatureActivity.this, ConfluenceActivity.class);
                            startActivity(newActivity5);
                            break;
                        case 6:
                            Intent newActivity6 = new Intent(NatureActivity.this, MuoriskiaiActivity.class);
                            startActivity(newActivity6);
                            break;
                        case 7:
                            Intent newActivity7 = new Intent(NatureActivity.this, TabokineActivity.class);
                            startActivity(newActivity7);
                            break;
                        case 8:
                            Intent newActivity8 = new Intent(NatureActivity.this, NorthPointActivity.class);
                            startActivity(newActivity8);
                            break;
                        case 9:
                            Intent newActivity9 = new Intent(NatureActivity.this, JuodzionysActivity.class);
                            startActivity(newActivity9);
                            break;

                    }
                };

            });
    }
}
