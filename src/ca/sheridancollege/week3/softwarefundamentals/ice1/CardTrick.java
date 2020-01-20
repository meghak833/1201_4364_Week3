/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.*;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 */
public class CardTrick {
    public static void main(String[] args)
    {   Random rd = new Random();
        Scanner sc = new Scanner (System.in); 
        
        Card [] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rd.nextInt(13));       
            c.setSuit(Card.SUITS[rd.nextInt(3)]);
            
            magicHand[i] = c;
        }

       
         for (int i = 0; i<magicHand.length; i++)
        {
            System.out.println(magicHand[i].getSuit()+" "+magicHand[i].getValue());
        }

        //insert code to ask the user for Card value and suit, create their card
        int number;
        do
        {
            System.out.println("Pick a number from 1-13");
            number = Integer.parseInt(sc.nextLine());
            if (number <= 0 || number > 13)
            System.out.println("Wrong input! Please try again!");
        }
        while (number <= 0 || number > 13);
        int suit;
        String suitValue = "";
        do
        {
            
            System.out.println("Pick a suit: (1 for Hearts, 2 for Diamonds, 3 for Spades, 4 for Clubs): ");
            suit = sc.nextInt();
            if (suit == 1)
            suitValue = "Heart";
            else if(suit == 2)
            suitValue = "Diamonds";
            else if (suit == 3)
            suitValue = "Spades";
            else if (suit == 4)
            suitValue = "Clubs";
        }
        while (suit < 0 || suit > 4);
        System.out.println("Pick your lucky Card!");
        System.out.println ("Your card is: "+number+" "+suitValue);
        
    }
    
}
