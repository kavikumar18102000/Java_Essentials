package Generics.WildCards;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildCards {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Mary");

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);

        List<Double> doubles = new ArrayList<>();
        doubles.add(1.0);
        doubles.add(2.0);

//        printNumbers(names); --> this is not going to work

        printNumbers(numbers);
        printNumbers(doubles);
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
