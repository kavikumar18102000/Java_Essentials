package Generics.WildCards;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildCards {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Mary");

        List<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);

        List<Double> doubles = new ArrayList<>();
        doubles.add(1.0);
        doubles.add(2.0);


        printNumbers(integers);
        printNumbers(doubles);

        List<Number> numbers = new ArrayList<Number>();
        numbers.add(1);
        numbers.add(5.4);
    }

    /*
    Here the <? super Number>, what does that mean?
    * the wildcard type should be of type Number, or the super class of Number.
    * wild card should be not the type which extends Number like the subclass of Number, like Integer, Doubles etc...
    * In this eg; the super class of Number will be Object class.
    * By using this, we can add write into the wild card list or collections.
    * Here, Number class can hold the object of Integer, Double etc., so we can write into the list.
    * But we can't pass a List<Integer>, as it is the subclass of Number, class.
    */

    public static void addNumbers(List<? super Number> numbers) {
        numbers.add(1);
        numbers.add(5.4);
    }


    /*Here the ? extends Number, what does that mean?
    --> '?' will take the type which is extends the Number class, like Integer, Double etc., but not allow other than those
    */

    public static void printNumbers(List<? extends Number> list){
        list.forEach(System.out::println);
        Number n = list.get(0); // here the return type will be Number not an Object type, as the wild card type mostly will be of type which extends Number class.
//        list.add(10); --> still this is not going to work
//        list.add(new Number()); --> this is not going to work
    }
}
