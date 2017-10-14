package com.example.vladasverkelis.wellcometobirzai;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vladasverkelis on 09/04/2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    //**Resource ID for the backgorund color to this list of places*/
    private int mColorResourceId;

    public PlaceAdapter(Activity context, ArrayList<Place> Places, int colorResourceId){
        //Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        //the second argument is used when the ArrayAdapter is populating a single TextView.
        //Because this is a custom adapter for the two TextViews and an ImageView, the adapter is not
        //going to use this second argument, so it can be any value. Here, we used 0.
        super(context,0, Places);
        mColorResourceId= colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if the existing view is being reused, overwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        //Get the {@link WellcomeToBirzai app} object located at this position in  the list
        Place currentPlace= getItem(position);

        //Find the TextView in the list.xml layout with the ID version_name
        TextView text = (TextView) listItemView.findViewById(R.id.text);
        //Get the version name from the current AndroidFlavor object and
        //Set this text on the name TextView
        text.setText(currentPlace.getOnePlace());

        //Find the ImageView in the list_item.xml layout with the ID list_Item_icon
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if(currentPlace.hasImage()) {
            //Get the image resource ID from the current WordAdapter object
            //set the image to imageView
            imageView.setImageResource(currentPlace.getmImageResourceId());

            //make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        }else{
            //Overwise hide the image imageView (set visibility to Gone).
            imageView.setVisibility(View.GONE);
        }
        //Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //Find the color that the resource ID maps
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //Set the background color of the text  container View
        textContainer.setBackgroundColor(color);

        //Return the whole list item layout (containing 2 TextViews and and Image View)
        //so that it can be shown in the ListView
        return listItemView;
    }
}
