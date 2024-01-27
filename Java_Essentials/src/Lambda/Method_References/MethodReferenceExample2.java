package Lambda.Method_References;

import Lambda.Excercise.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
    public static void main(String[] args) {

        List<Person> peoples = Arrays.asList(
                new Person(10,"sanjay","Banglore"),
                new Person(20,"Dinesh","Rajasthan"),
                new Person(30,"sandeep","Mysore")
        );

        printName(peoples,p->true,c-> System.out.println(c.getName()));

        //Using Method Reference
        printName(peoples,p->true,System.out::println);
    }

    public static void printName(List<Person> people, Predicate<Person> p, Consumer<Person> c){
        for (Person b: people){
            if(p.test(b)){
                c.accept(b);
            }
        }
    }

}

