package Generics;

import java.util.ArrayList;
import java.util.List;

import static Generics.GenericRuntimeCheck.addToNames;

public class Generic_List_VS_Typed_Arrays {
    public static void main(String[] args) {
        List<String > nameList = new ArrayList<>();

        addToNames(nameList,"Name1");
        addToNames(nameList,"Name2");

        String[] namesArray = new String[5];
        addToNamesArray(namesArray,"Name1");

        incorrectAddtoNamesArray(namesArray,10);
    }

    //Now lets, cheat the compiler, and change the String type to object, this will work
    //The compiler says, it ok, and no error
    //But in runtime, we will catch up with an error
    private static void incorrectAddtoNamesArray(Object[] namesArray, int i) {
        namesArray[0]=i; //Here, the error shows up in adding the element, not at retrieving like in Generics using collections.
        //Here the namesArray, is a runtime context, not a compile time context like List<Generics>. The String type associated with the instance itself.
    }

    private static void addToNamesArray(String[] namesArray, String name) {
        namesArray[0]=name;
    }
}
