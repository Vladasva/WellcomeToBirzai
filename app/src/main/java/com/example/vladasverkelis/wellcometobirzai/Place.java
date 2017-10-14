package com.example.vladasverkelis.wellcometobirzai;

/**
 * Created by vladasverkelis on 09/04/2017.
 */

public class Place {

    /**One place form the places list*/
    private String mOnePlace;

    /**Image resource ID for the Place*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Place(String onePlace, int imageResourceId) {
        mOnePlace = onePlace;
        mImageResourceId= imageResourceId;
    }
    /**
     * Get one of the places from the list
     */
    public String getOnePlace(){
        return mOnePlace;
    }
    /**
     * Return the image resource ID of the word
     */
    public int getmImageResourceId(){
        return mImageResourceId;
    }
    /**
     * Return whether or not there is a image for this word
     */
    public boolean hasImage(){
        return mImageResourceId!= NO_IMAGE_PROVIDED;
    }
}
