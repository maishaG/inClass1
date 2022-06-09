
package exercise1;

/**
 *This is about the CardTrick class so that it models a “hand” of seven cards
 * as a array which is filled with random cards
 * 
 * @author maishaghannoo
 */
public class Card {
    
     //declare variable
    private String suit;//c,s,d,h
    private int value;//1-13
    
    public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
    
    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }
    
    @Override
    public String toString(){
    return "Card{" + "suit='" + suit + '\'' + ", value=" + value +'}';
    }
    
}
