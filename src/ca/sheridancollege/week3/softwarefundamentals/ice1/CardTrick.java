/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 991495299
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Mohammed Al-Kayem
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        int x = (int)((Math.random() * (13 - 1) +1 ));
        int y = (int)((Math.random() * (3 - 1) +1 ));
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(x);
            c.setSuit(Card.SUITS[y]);
        }
        Scanner input = new Scanner(System.in);
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Please enter a card value: ");
        String value = input.nextLine();
        System.out.println("Please enter a suit: ");
        String suit = input.nextLine();
        // and search magicHand here
        //Then report the result here
    }
    
}
