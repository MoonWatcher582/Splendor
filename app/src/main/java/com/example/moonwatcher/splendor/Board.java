package com.example.moonwatcher.splendor;

import java.util.ArrayList;
/**
 * Created by moonwatcher on 1/6/15.
 */
public class Board {
    final static int NUMBER_OF_COLORS = 6; //there are six colors

    private Deck deck1; //level 1 deck
    private Deck deck2; //level 2 deck
    private Deck deck3; //level 3 deck

    private ArrayList<SplendorCard> faceUpDeck1; //level 1 available cards
    private ArrayList<SplendorCard> faceUpDeck2; //level 2 available cards
    private ArrayList<SplendorCard> faceUpDeck3; //level 3 available cards

    private Nobles[] nobles; //list of nobles in play

    private int gems[]; //bank

    public Board(String nobleFile, String deckFile1, String deckFile2, String deckFile3) {
        /*TODO
        * Parse noble file
        * 10 total
        * each noble has pointValue, then cost
        * randomly select three numbers in range 10, only read those lines
        *
        * Create the decks
         */

        gems = new int[NUMBER_OF_COLORS];
        for(int i = 0; i < NUMBER_OF_COLORS; i++){
            gems[i] = 4;
        }

        nobles = new Nobles[3];
    }
}
