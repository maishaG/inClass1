
package exercise1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *This is about the CardTrick class so that it models a “hand” of seven cards
 * as a array which is filled with random cards
 * 
 * @author maishaghannoo
 */
public class CardTrick {
    
    public static void main(String[] args) {

        Card hand[] = new Card[7];
        Random generator = new Random();
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();

            //generating a value b/w 1-13 randomly
            card.setValue(generator.nextInt(13) + 1);

            //generating a num b/w 0-3
            card.setSuit(Card.SUITS[generator.nextInt(4)]);

            hand[i] = card;

            //default user card
            Card defaultCard = new Card();
        
            //declaring variable
            int val;
            String suit;
            boolean flag = false;

            //creating scanner to get input from user
            Scanner input = new Scanner(System.in);

            System.out.println("Enter value for the card: ");
            val = input.nextInt();

            //prompting the user to enter suit
            System.out.print("Enter suit of the card" + Arrays.toString(Card.SUITS)+ ": ");
            suit = input.next();

            defaultCard.setValue(val);
            defaultCard.setSuit(suit);
            

            //loop-verify if defCard is present
            //for (Card hand1 : hand) {
              for (int i = 0; i < hand.length; i++){

                if (defaultCard.getValue() == defaultCard.getValue() && defaultCard.getSuit().equalsIgnoreCase(defaultCard.getSuit())) {
                    //System.out.println("The card is being found in hand at index" + (i + 1));
                    flag = true;
                    break;
                }
            }

            if (flag) 
                System.out.println("The card is found");
             else 
                System.out.println("The card is not found");
            
            
            flag= false;
            Card winCard = new Card();
            winCard.setValue(9);
            winCard.setSuit(Card.SUITS[2]);

            //loop-verify if defCard is present
            for (int i = 0; i < hand.length; i++)
            //for (Card hand1 : hand) {
                if (winCard.getValue() == winCard.getValue() && winCard.getSuit().equalsIgnoreCase(winCard.getSuit())) {
                    //System.out.println("The card is being found in hand at index" + (i + 1));
                    flag = true;
                    break;
                }
            }
            
            if (flag) 
                System.out.println("The win card is found ");
             else 
                System.out.println("The win card is not found");
            
           
            generator.setSeed(System.currentTimeMillis());

            System.out.println("The cards in the magic hands are: ");

            card.setValue(generator.nextInt(13) + 1);
            card.setSuit(Card.SUITS[generator.nextInt(4)]);

            hand[i] = card;
            System.out.println(card);

        }         
        
      
    }
    
}
