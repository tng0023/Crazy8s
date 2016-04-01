package com.tommy;

import java.util.ArrayList;
import java.util.Random;

//creates a deck of cards
public class Deck {
    ArrayList<Card> deck;
    ArrayList<Integer> cardsDelt;

    public Deck(){
        deck = new ArrayList<>();
        cardsDelt = new ArrayList<>();
        buildDeck();
    }
    public void buildDeck(){

        for(int i = 0 ; i < Card.suits.length ; i++){
            for(int j = 1 ; j < Card.largestCardValue; j++){
              this.deck.add(new Card(i, j));
            }
        }

    }
    //gives size of deck
    public Card dealCard(){
        if(cardsDelt.size() < 52) {
            Random deal = new Random();
            int r = deal.nextInt(52);
            while (cardsDelt.contains(r)) {
                r = deal.nextInt(52);
            }
            cardsDelt.add(r);
            return deck.get(r);
        } else {
            // return empty card (card with zero value)
            return new Card();
        }
    }
}
