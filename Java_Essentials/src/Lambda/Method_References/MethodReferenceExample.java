package Lambda.Method_References;

import javax.crypto.spec.PSource;

public class MethodReferenceExample {
    public static void main(String[] args) {

        //Basic way of passing a method in a lambda function
        Thread thread = new Thread(()->printMessage());
        thread.start();

        //Using Method Reference for lambda
        /*
        Rules for Method Referencing:
        * if the lambda arguments and the method we are referencing to have same method signature, we use method reference.
        * In the below ex, the Runnable method have the same method signature as the printMessage has, so we can reference it.
        * We can use the class name where the method is present and double colon to reference the function.
         */
        //MethodReferenceExample::printMessage === ()->printMessage();
        Thread thread1 = new Thread(MethodReferenceExample::printMessage); //This acts as a lambda function
        thread1.start();
    }

    private static void printMessage() {
        System.out.println("Hello");
    }
}
