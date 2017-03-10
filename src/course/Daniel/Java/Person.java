package course.Daniel.Java;

import course.Daniel.Java.race.Driver;

/**
 * Created by Jakars on 10/03/2017.
 */
public class Person implements Comparable {
    private String name;

    private Person(String name) {this.name = name; }

    //how to overide a private constructor
    //Static method:
    public static Person moshe() {
        return new Person("Moshe");
    }

    public static Person david() {
        return new Person("David");
    }

    public static Person itzik() {
        return new Person("Itzik");
    }


    @Override
    public int compareTo(Object o) {
        if (o instanceof Person){
            Person p2 = (Person) o;

            int diff = name.compareTo(p2.name);
            return diff;
        }
        return 0;
    }

    @Override
    public String toString() {
        return name;
    }
}
