package course.Daniel.Java.cards;

/**
 * Created by Jakars on 10/03/2017.
 */
public enum Suit {
    HEARTS("♥"), SPADES("♠"), CLUBS("♣"), DIAMONDS("♦");

    String aVal;

    Suit(String aVal) {
        this.aVal = aVal;
    }

    //toString(){}
    //switch case
    public static Suit fromString (String s){
        for (Suit suit : values() ) {
            if (s.equals(suit.aVal))
                return suit;

        }
        return null;
    }

    @Override
    public String toString() {
        return aVal;
    }
}
