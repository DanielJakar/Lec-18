package course.Daniel.Java;

/**
 * Created by Jakars on 10/03/2017.
 */
public enum Colors {
    RED(1), GREEN(2), BLUE(3); //values  Colors,values()-> Colors [].
    //Associated value is added to the "Value".

    private int aVal; //-> for the constructor.

    //alt + insert -> generate constructor:
    //no access modifier. is always private.
    Colors(int aVal) {
        this.aVal = aVal;
    }

    //fromString:
    public static Colors fromString (String n){
        for (Colors o : values()) {
            if (n.equalsIgnoreCase(String.valueOf(o))){
                return o;
            }

        }
        return null;
    }

    public static Colors fromint (int n) {
        // return new Colors(n);
        for (Colors  c: values()) {
            if (c.aVal == n)
                return c;

        }
        return null; //throw exception.

    }
}

