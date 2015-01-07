package com.example.moonwatcher.splendor;

import java.util.ArrayList;

/**
 * Created by moonwatcher on 1/6/15.
 */
public class Player {
    ArrayList<SplendorCard> hand; //3 cards max
    int[] wallet; //"key" is color, "value" is number of that color gem
    int points; //total point value, once you get a card or noble, add their pointValue to your's
    int[] income; //"key" is color, "value" is number of that color card


}
