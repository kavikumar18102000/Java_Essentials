package Lambda.StreamAPI;

import Lambda.Excercise.Person;

import java.util.Arrays;
import java.util.List;

public class StreamAPI_Example {
    public static void main(String[] args) {
        List<Person> peoples = Arrays.asList(
                new Person(10,"sanjay","Banglore"),
                new Person(20,"Dinesh","Rajasthan"),
                new Person(30,"sandeep","Mysore")
        );

        System.out.println(peoples.stream()
                        .filter(p->p.getName().startsWith("s"))
                                .count());

        peoples.stream()
                .filter(p->p.getName().startsWith("s"))
                .filter(p->p.getAddress().equals("Banglore"))
                .forEach(p-> System.out.println(p.getName()));
    }
}
