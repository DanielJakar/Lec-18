package course.Daniel.Java.cards;

import course.Daniel.Java.utils.StringUtils;

/**
 * Created by Jakars on 10/03/2017.
 */
public enum Ranks {
    TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
    EIGHT(8), NINE(9), TEN(10), JACK(10),
    QUEEN(10), KING(10), ACE(11);

    int aVal;

    Ranks(int i) {
        aVal = i;
    }

    @Override
    public String toString() {
        switch (this){
            case TWO:
            case THREE:
            case FOUR:
            case FIVE:
            case SIX:
            case SEVEN:
            case EIGHT:
            case NINE:
            case TEN:
                return aVal +"";
            case JACK:
            case QUEEN:
            case KING:
            case ACE:
                String upper = super.toString();
                return StringUtils.Capitalize(upper);


            default:
                return null; //throw exception
        }


    }

    public int getaVal() {
        return aVal;
    }

    public int get2Val() {
        if (this == ACE)
            aVal = 1;
        return aVal;
    }
}
