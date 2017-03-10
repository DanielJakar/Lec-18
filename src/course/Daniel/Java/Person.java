package course.Daniel.Java;

import course.Daniel.Java.race.Driver;

/**
 * Created by Jakars on 10/03/2017.
 */
public class Person implements Comparable<Person> {
    private String name;
    private String lastName;
    int age;

    private Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    //how to overide a private constructor
    //Static method:
    public static Person moshe() {
        return new Person("Moshe", "Doe", 22);
    }

    public static Person david() {
        return new Person("David", "Cohen", 25);
    }

    public static Person moshe2() {
        return new Person("Moshe", "Cohen", 23);
    }
    public static Person david2() {
        return new Person("David", "Cohen", 29);
    }


//    @Override
//    public int compareTo(Object o) {
//        if (o instanceof Person){
//            Person p2 = (Person) o;
//
//            int diff = name.compareTo(p2.name);
//            return diff;
//        }
//        return 0;
//    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person p2) {
        int namediff = name.compareTo(p2.name);
        if (namediff != 0) return namediff;

        int lastnamediff = lastName.compareTo(p2.lastName);
        if (lastnamediff != 0) return lastnamediff;

        int agediff = age - p2.age;
        return agediff;


    }
}
