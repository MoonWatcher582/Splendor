package com.example.moonwatcher.splendor;

/**
 * Created by moonwatcher on 1/6/15.
 */
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<SplendorCard> deck;
    //final int deckId;

    public Deck(String deckFile){
        /*TODO
        * FILE I/O, create deck
        * First line of file will be deckID
        * All subsequent lines will be cards
        * Color, pointValue, cost
         */
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public SplendorCard draw(){
        SplendorCard nextCard = deck.remove(deck.size());
        return nextCard;
    }

    public boolean isEmpty(){
        return deck.isEmpty();
    }
}