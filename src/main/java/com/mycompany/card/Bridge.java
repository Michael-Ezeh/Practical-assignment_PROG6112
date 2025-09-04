/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.card;

/**
 *
 * @author michael
 */
public class Bridge extends CardGame{
    public Bridge() {
        super(13); // Bridge deals 13 cards
    }

    @Override
    public void displayDescription() {
        System.out.println("Bridge: Each player is dealt 13 cards.");
    }

    @Override
    public void deal() {
        System.out.println("Dealing " + cardsPerPlayer + " cards in Bridge:");
        for (int i = 0; i < cardsPerPlayer; i++) {
            System.out.println(deck[topCardIndex++]);
        }
    }
}
