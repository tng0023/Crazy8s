package com.tommy;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //creates a new deck of cards
        Deck d = new Deck();
        Random rand = new Random();

        //creates 2 players with 7 cards to start
        Player Tommy = new Player();
        Player Com = new Player();
        for (int i = 0; i < 8; i++) {
            Tommy.addCardtoHand(d.dealCard());
            Com.addCardtoHand(d.dealCard());
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to play Crazy 8s? (Y/N)");
        if (scan.nextLine().equalsIgnoreCase("y")) {
            System.out.println("Let's begin");
        } else if (scan.nextLine().equalsIgnoreCase("n")) {
            System.out.println("Goodbye!");
            System.exit(0);
        }

        //starts the game with linkedlist used to show last played card
        LinkedList playedCards = new LinkedList();
        System.out.println("Here is your hand: ");
        while (true) {
            System.out.println("Player's Hand: ");
            Tommy.viewHand();
            System.out.println("Which card would you like to play?");


            playedCards.push(Tommy.playCard(scan.nextInt()));
            System.out.println("Last played card: " + playedCards.peek());
            System.out.println("Computer's Hand: ");
            Com.viewHand();
            playedCards.push(Com.playCard(0));
            System.out.println("Last played card: " + playedCards.peek());
            if (Tommy.hand.isEmpty()) {
                System.out.println("You win!");
                System.exit(0);
            } else if (Com.hand.isEmpty()) {
                System.out.println("Com wins!");
                System.exit(0);
            }
        }
    }
}


