/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.card;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author michael
 */
public class CardGameIT {
    private Poker poker;
    private Bridge bridge;

    @BeforeEach
    void setUp() {
        poker = new Poker();
        bridge = new Bridge();
    }

    @Test
    void testPokerCardsPerPlayer() {
        assertEquals(5, poker.cardsPerPlayer, "Poker should deal 5 cards per player");
    }

    @Test
    void testBridgeCardsPerPlayer() {
        assertEquals(13, bridge.cardsPerPlayer, "Bridge should deal 13 cards per player");
    }

    @Test
    void testDeckSizeInitial() {
        assertEquals(52, poker.deck.length, "Deck should contain 52 cards initially");
    }

    @Test
    void testShuffleChangesOrder() {
        // copy first card before shuffle
        String before = poker.deck[0].toString();
        poker.shuffle();
        String after = poker.deck[0].toString();
        // There's a tiny chance the first card is the same, but usually not
        assertNotEquals(before, after, "Shuffle should change the order of cards");
    }

    @Test
    void testDealReducesDeck() {
        poker.shuffle();
        int topBefore = poker.topCardIndex;
        poker.deal();
        assertEquals(topBefore + 5, poker.topCardIndex,
                     "Poker deal should move topCardIndex forward by 5");
    }

    @Test
    void testDealBridge13Cards() {
        bridge.shuffle();
        int topBefore = bridge.topCardIndex;
        bridge.deal();
        assertEquals(topBefore + 13, bridge.topCardIndex,
                     "Bridge deal should move topCardIndex forward by 13");
    }
}