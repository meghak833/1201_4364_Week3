/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 * Modified: Bradley Persaud
 * Student number: 991360032
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        
        
        for (int i=0; i<magicHand.length; i++)
        {
            Random rand = new Random();
            Card c = new Card();
            
            c.setValue(rand.nextInt(13)+1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand [i] = c;
            
            System.out.println("Your card was added: " + c);
        }

   
            Card playerCard = new Card();
            playerCard.setSuit(Card.SUITS[1]);
            playerCard.setValue(8);
            
        for(int i = 0; i < magicHand.length; i++)
        {
            if(magicHand[i].getSuit().equals(playerCard.getSuit()) && magicHand[i].getValue()==playerCard.getValue())
            {
                System.out.println("Your card was" + playerCard);
            }
        }
            
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
