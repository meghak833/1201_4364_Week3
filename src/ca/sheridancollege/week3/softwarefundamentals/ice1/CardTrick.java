/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 * modified by Varun Vadali, 991580818
 */
public class CardTrick {
    
    public static void main(String[] args)
    {   System.out.println("Creating magic hand");
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random rand = new Random();
            c.setValue(rand.nextInt(13)+1);
            //c.setValue(insert call to random number generator here)
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand [i] = c;
            System.out.println(c);
        }
        System.out.println("Please enter a card value and suit: ");
        Card card = new Card();
        card.setValue(8);
        card.setSuit(Card.SUITS[3]);
        //insert code to ask the user for Card value and suit, create their card
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getSuit().equals(card.getSuit())&&magicHand[i].getValue()==(card.getValue())){
                System.out.println("The card matches!!!");
            }
            else
                System.out.println("The card doesn't match...");
        }
        // and search magicHand here
        //Then report the result here
    }
}