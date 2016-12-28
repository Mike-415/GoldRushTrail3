package com.michaelgonzalez.goldrushtrail3;

import android.widget.ImageView;

/**
 * Created by michaelgonzalez on 12/25/16.
 */

//LOOK BELOW on image storing
public class Event
{
    private String title, description;
    private int imageLocation;
    private double latitude, longitude;

    //TODO: Find out the proper method of inserting images into the drawables folder without getting an error
    //Resolution
    public static final Event[] events = {
            //Instantiate 5 objects
            new Event("Ferry Building", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", R.drawable.pic1, 37.795403, -122.393699), //Ferry building
            new Event("Mechanics' Institute", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", R.drawable.pic2, 37.788677, -122.402695), //Mechanics' Institute
            new Event("Coit Tower", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", R.drawable.pic3, 37.802598, -122.405759 ), //Coit Tower
            new Event("Transamerica Pyramid", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", R.drawable.pic4, 37.795229, -122.40276 ), //Transamerica Pyramid
            new Event("Alcatraz", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", R.drawable.pic5, 37.827037, -122.422655 )  //Alcatraz
    };


    //Constructor set to private since it won't be instantiated outside the class
    //This is temporary, just for the initial run.
    private Event(String title, String description, int imageLocation, double latitude, double longitude) {
        this.title = title;
        this.description = description;
        this.imageLocation = imageLocation;
        this.latitude = latitude;
        this.longitude = longitude;

    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public int getImageLocation(){
        return imageLocation;
    }
    public double getLatitude(){
        return latitude;
    }
    public double getLongitude(){
        return longitude;
    }

}

/*
Using ImageView in Your Activity Code

ImageView photo = (ImageView)findViewById(R.id.photo); //Where it is located in the layout
int image = R.drawable.starbuzz_logo; //The actual image location
photo.setImageResource(image);

 */
