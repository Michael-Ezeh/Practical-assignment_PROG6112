/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.card;

/**
 *
 * @author michael
 */
public class Poker extends CardGame{
     public Poker() {
        super(5); // Poker deals 5 cards
    }

    @Override
    public void displayDescription() {
        System.out.println("Poker: Each player is dealt 5 cards.");
    }

    @Override
    public void deal() {
        System.out.println("Dealing " + cardsPerPlayer + " cards in Poker:");
        for (int i = 0; i < cardsPerPlayer; i++) {
            System.out.println(deck[topCardIndex++]);
        }
    }
}
