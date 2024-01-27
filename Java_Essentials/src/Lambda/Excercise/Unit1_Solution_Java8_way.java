package Lambda.Excercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1_Solution_Java8_way {
    public static void main(String[] args) {

        List<Person> peoples = Arrays.asList(
                new Person(10,"sanjay","Banglore"),
                new Person(20,"Dinesh","Rajasthan"),
                new Person(30,"sandeep","Mysore")
        );

//        step 1 : sort all person by city
        Collections.sort(peoples, (o1, o2)->o1.getName().compareTo(o2.getName()));

//        step 2: Create a method that prints all the elements in the list
        printAll(peoples);

//        step 3: Create a method that prints all the name starting "s"
        Conditionally c = p-> p.getName().startsWith("s");
        printName(peoples,c);

    }

    public static void printAll(List<Person> peoples){
        for (Person p : peoples){
            System.out.println(p);
        }
    }

    public static void printName(List<Person> people,Conditionally c){
        for (Person p: people){
            if (c.test(p)){
                System.out.println(p);
            }
        }
    }

    interface Conditionally{
        boolean test(Person p);
    }
}
