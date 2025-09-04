/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.card;

/**
 *
 * @author michael
 */
public class PlayCardGames {
    public static void main(String[] args) {
        CardGame poker = new Poker();
        poker.shuffle();
        poker.displayDescription();
        poker.deal();

        System.out.println("\n==============================\n");
        
        CardGame bridge = new Bridge();
        bridge.shuffle();
        bridge.displayDescription();
        bridge.deal();
    }
}
