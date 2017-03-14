package course.Daniel.Java.zoo;

/**
 * Created by Jakars on 07/03/2017.
 */
public enum Food {
    GRAINS(1), MEAT(2), GRASS(3);

    private int aVal;

    Food(int aVal) {
        this.aVal = aVal;
    }

    public int getaVal() {
        return aVal;
    }

    public void setaVal(int aVal) {
        this.aVal = aVal;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
