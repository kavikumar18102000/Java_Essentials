package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericRuntimeCheck {
    public static void main(String[] args) {
        List<String > name = new ArrayList<>();

        addToNames(name,"Name1");
        addToNames(name,"Name2");
        System.out.println(name);

        //We are trying to add an Integer to the "names" list, and we do it.
        /*But how, does this work???
        --> The genetic type 'String' is not associated with the instance, it is only associated with the variable.
            "List<String> ", is not a property of the instance created, it is a property of the variable "names".
            So, where ever "names" goes, the compiler checks it is a "List<String>" inside a context. So only string can be added to the list.

            When we take the "names" variable out of the context and assign it to other type like "List list", the compiler will not check for the type.
            That is why we can add an integer to the "names" list.

            The Core instance doesn't have the property of "List<String>", only the variable has, but here the instance is pointed by list variable, in
            inCorrectAddToNames function. Here we are passing the instance of "names" points to.
        */
        incorrectAddToNames(name,10);
        System.out.println(name);
       // String s = name.get(2); //--> this will throw an type cast error as an integer in cast to String.
//        Integer s = name.get(2); //--> this will throw a compile time error, saying requited type is Integer, but provided String

    }

    public static void addToNames(List<String> names, String name){
        names.add(name);
    }

    public static void incorrectAddToNames(List list, Integer s){
        list.add(s);
    }
}
