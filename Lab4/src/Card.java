import java.util.Random;

public class Card {

    private String suit; //declaring the suit variable with String
    private String faceValue; //declaring the faceValue variable with String

  
    public Card(String suit, String faceValue) { //constructor
        this.suit = suit;
        this.faceValue = faceValue;
    }

   
    public String getSuit() { //set return String
        return suit;
    }

    public void setSuit(String suit) { //using 'this.' object belongs to
        this.suit = suit;
    }

    public String getFaceValue() { //set return String
        return faceValue;
    }

    public void setFaceValue(String faceValue) { //using 'this.' object belongs to
        this.faceValue = faceValue;
    }

   
    public String toString() { //return String for given suit and face value numbers
        return faceValue + " of " + suit;
    }

    public static void main(String[] args) { //main method generate 5 random cards


    	System.out.println("Your five random cards will be: ");
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] faceValues = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        Random random = new Random(); //random cards
        for (int i = 1; i <= 5; i++) {
            Card card = new Card(suits[random.nextInt(suits.length)], faceValues[random.nextInt(faceValues.length)]);
            System.out.println(card);
        }
    }
}