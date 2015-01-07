package com.example.moonwatcher.splendor;

/**
 * Created by moonwatcher on 1/6/15.
 */
public class SplendorGame {
    Board board;
    Player player1;
    Player player2;
    int turn;


    public SplendorGame(String nobleFile, String deckFile1, String deckFile2, String deckFile3) {
        player1 = new Player();
        player2 = new Player();

        board = new Board(nobleFile, deckFile1, deckFile2, deckFile3);

        turn = 0;
    }
}
