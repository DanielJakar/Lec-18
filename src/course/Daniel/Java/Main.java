package course.Daniel.Java;

import course.Daniel.Java.cards.Suit;
import course.Daniel.Java.race.DriverInspector;
import course.Daniel.Java.zoo.Cow;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(Person.moshe());
        people.add(Person.david());
        people.add(Person.moshe());
        people.add(Person.david());

        Collections.sort(people);

        System.out.println(people);













        String aba = "Aba";
        String o = "Bama";

        int diff = aba.compareTo(o);
        System.out.println(diff);


        Cow cow = new Cow("Matilda");
        DriverInspector.tester(cow);





        Colors c = Colors.BLUE;
//        Suit[] suits = Suit.values();
//        for (Suit suit : suits) {
//            System.out.println(suit);
//        }

//        for (Suit suit : Suit.values()) {
//            System.out.println(suit);
//
//        }

        //Will not use these:
//        //init with value
//        Colors c2 = Colors.valueOf("GREEN");
//
//        //init with a class...
//        Enum red = Enum.valueOf(Colors.class, "RED");

        //iterate all the values:
//        Colors[] values = Colors.values();
//        for (Colors val : values) {
//            System.out.println(val);
//        }

        //how to change a list to an array:
//        //Array->list
//        List<Colors> cList = Arrays.asList(values);



    }
}
