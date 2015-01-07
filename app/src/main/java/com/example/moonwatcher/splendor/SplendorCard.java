package com.example.moonwatcher.splendor;

/**
 * Created by moonwatcher on 1/6/15.
 */
public class SplendorCard {
    final Color color;
    final int[] cost;
    final int deckID;
    final int pointValue;

    public SplendorCard(Color color, int[] cost, int deckID, int pointValue) {
        this.color = color;
        this.cost = cost;
        this.deckID = deckID;
        this.pointValue = pointValue;
    }
}
