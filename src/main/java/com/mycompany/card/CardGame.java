/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.card;

import java.util.Random;

/**
 *
 * @author michael
 */
public abstract class CardGame {
    protected Card[] deck;            // array of 52 cards
    protected int cardsPerPlayer;
    protected int topCardIndex;       // keeps track of the next card to deal

    public CardGame(int cardsPerPlayer) {
        this.cardsPerPlayer = cardsPerPlayer;
        this.deck = new Card[52];
        this.topCardIndex = 0;

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"2","3","4","5","6","7","8","9","10",
                           "Jack","Queen","King","Ace"};

        // Fill deck with 52 cards
        int index = 0;
        for (String suit : suits) {
            for (String value : values) {
                deck[index++] = new Card(suit, value);
            }
        }
    }

    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int j = rand.nextInt(deck.length);
            // swap deck[i] and deck[j]
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        topCardIndex = 0; // reset dealing position
    }

    // Abstract methods
    public abstract void displayDescription();
    public abstract void deal();
}
