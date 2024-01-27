package Lambda.Exception_Handling;

import javax.crypto.spec.PSource;
import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};
//        process(a,1,(v,k)-> System.out.println(v+k));
        process(a,0,wrapperLambda((v,k)-> System.out.println(v/k)));
    }

    public static void process(int[] a, int k, BiConsumer<Integer, Integer> consumer)
    {
        for (int i : a){
            consumer.accept(i,k);
        }
    }

    //this is true wrapper lambda
    public static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer){
//        return (v,k) -> System.out.println(v+k);

        //Here we are wrapping the consumer lambda in another lambda and we are returning it
        /*return (v,k)->{
            System.out.println("Executing Lambda Expression");
            consumer.accept(v,k); //execute whatever passed in as lambda
        };*/

        //Exception Handling using Lambda
        return (v,k)->{
          try {
              consumer.accept(v,k);
          }
          catch (ArithmeticException e){
              System.out.println("Exception caught in Lambda");
          }
        };
    }
}
