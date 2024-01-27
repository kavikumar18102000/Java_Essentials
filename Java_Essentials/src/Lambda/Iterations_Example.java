package Lambda;

import Lambda.Excercise.Person;

import java.util.Arrays;
import java.util.List;

public class Iterations_Example {
    public static void main(String[] args) {
        List<Person> peoples = Arrays.asList(
                new Person(10,"sanjay","Banglore"),
                new Person(20,"Dinesh","Rajasthan"),
                new Person(30,"sandeep","Mysore")
        );

        System.out.println("Using for loop");
        for (int i = 0; i < peoples.size(); i++) {
            System.out.println(peoples.get(i));
        }

        System.out.println("Using for in loop");
        for(Person p  :peoples){
            System.out.println(p);
        }

        System.out.println("Using for each loop");
        peoples.forEach(p-> System.out.println(p.getName()));
        peoples.forEach(System.out::println); //method referencing
    }
}
