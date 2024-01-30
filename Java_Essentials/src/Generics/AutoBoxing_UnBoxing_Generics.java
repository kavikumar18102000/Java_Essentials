package Generics;

public class AutoBoxing_UnBoxing_Generics {
    public static void main(String[] args) {
        //Auto Boxing
        int i=10;
        Integer a = i; //converts primitive to wrapper class automatically

        //UnBoxing
        Integer b =20;
        int x = b; //unboxing wrapper class to primitive type
        System.out.println(x);
    }
}
