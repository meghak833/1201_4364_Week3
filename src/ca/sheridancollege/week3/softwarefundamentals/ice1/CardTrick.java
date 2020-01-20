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
 */
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author (Modified) Brandon Martins
 * Student ID:991572898
 */
public class CardTrick {
 public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String card[] = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String suit[] = {"Hearts", "Diamonds","Clubs","Spades"};
        
        Card[] magicHand = new Card[7];

     for (int i=0; i<magicHand.length; i++) {
         Card c = new Card();
         //c.setValue(insert call to random number generator here)
         Random random = new Random(13);
         //c.setSuit(Card.SUITS[insert call to random number between 0-3 here]
         int Setvalue = random.nextInt(card.length * suit.length);
     }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        System.out.println("Enter your lucky card!");
        String luckyCard = input.next(); //Assume the user inputs correct information
        
        
        //Then report the result here
        System.out.println("Your lucky card was " + luckyCard + ", and your hand is" + magicHand);
    }
}
