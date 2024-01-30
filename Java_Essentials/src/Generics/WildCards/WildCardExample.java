package Generics.WildCards;

import java.util.ArrayList;
import java.util.List;

public class WildCardExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Mary");

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);

        printList(names);
        printList(numbers);

        //this works fine, as we used the wild card
        List<?> temp = names;
        temp=numbers;
    }

    //'?' is the wildcard, where the type is unknown, but it knows something is passed to the list type.
    //when the type is not specified, we can only read but can't write into the list.
    //if the compiler does not know what the type of '?', it doesn't allow to write into the list.
    public static void printList(List<?> list) {
        list.forEach(System.out::println);
//        list.add("kevin"); --> this not going to work

        Object o = list.get(0); // return type of wildcard is an object.
//        list.add(new Object()); // --> this is not allowed
    }
}
