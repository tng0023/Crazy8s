package com.tommy;

import java.util.*;

//creates the 52 cards with their suits
public class Card {
    public int suit;
    public int value;
    public static final String[] suits = {"D", "C", "H", "S"};
    public static final String[] ranks = {"0", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    static final int largestCardValue = ranks.length;

    public Card(int suit, int value){
        this.suit = suit;
        this.value = value;
    }

    public Card(){
        this.suit = 0;
        this.value = 0;
    }
    public int getSuit(){
        return this.suit;
    }
    public int getValue(){
        return this.value;
    }

    public String getSuitString() {
        return suits[this.suit];
    }

    public String getValueString(){
        return ranks[this.value];
    }
    public String toString(){
        return suits[this.suit] + " " + ranks[this.value];
    }
}
