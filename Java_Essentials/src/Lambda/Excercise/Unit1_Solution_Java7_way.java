package Lambda.Excercise;

import java.util.*;

public class Unit1_Solution_Java7_way {

    public static void main(String[] args) {

        List<Person> peoples = Arrays.asList(
                new Person(10,"sanjay","Banglore"),
                new Person(20,"Dinesh","Rajasthan"),
                new Person(30,"sandeep","Mysore")
        );

//        step 1 : sort all person by city
        Collections.sort(peoples, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
               return o1.getName().compareTo(o2.getName());
            }
        });

//        step 2: Create a method that prints all the elements in the list
          printAll(peoples);

//        step 3: Create a method that prints all the name starting "s"
            printName(peoples);
    }

    public static void printAll(List<Person> peoples){
        for (Person p : peoples){
            System.out.println(p);
        }
    }

    public static void printName(List<Person> people){
        for (Person p: people){
            if (p.getName().startsWith("s")){
                System.out.println(p);
            }
        }
    }
}
