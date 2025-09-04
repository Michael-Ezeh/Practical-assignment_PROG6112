/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.card;

/**
 *
 * @author michael
 */
public class Card {
    
    String suit;
    String value;
    
    public static void main(String[] args) {
        
    }
    public Card(String n, String m){
        this.suit = n;
        this.value = m;
    }
    
    public String getvalue(){
        return value;
    }
    
    public String getSuit(){
        return suit;
    }
    
    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
    
    
    
