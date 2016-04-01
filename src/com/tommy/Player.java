package com.tommy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

//to create player and computer card hands
public class Player {
    ArrayList<Card> hand;

    public Player() {
        this.hand = new ArrayList<Card>();
    }

    void addCardtoHand(Card card) {
        this.hand.add(card);
    }

    void viewHand() {
        System.out.println(hand);
    }

    public Card playCard(int card) {
        return this.hand.remove(card);
    }
}
