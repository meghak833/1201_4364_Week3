/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 * modified by: Yanjun Fang(991562361)
 */
import java.util.*;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random()*13+1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i] = c;  
            System.out.print(magicHand[i]+" ");
        }
               
        //insert code to ask the user for Card value and suit, create their card
        System.out.print("Please enter your card value:");
        int v = input.nextInt();
        System.out.print("Please enter your card suit:");
        String s = input.next();
        Card userCard = new Card();
        userCard.setValue(v);
        userCard.setSuit(s);
        System.out.println("the user card is"+userCard);
        // and search magicHand here
        //Then report the result here
    }
    
}
