package Lambda;

//NOTE : 'this' cannot be accessed inside a static method

import javax.crypto.spec.PSource;

public class This_Reference_Example {

    public void process(int i, Process p){
        p.test(i);
    }

    public void execute(){
        process(20,i->{
            System.out.println("Value of i is : "+i);
            System.out.println(this); //Here 'this' points to the object associated with 'execute' function
        });
    }

    public String toString(){
        return "This is an instance of This_Reference_Example object";
    }

    public static void main(String[] args) {
        This_Reference_Example thisReferenceExample = new This_Reference_Example();

        //'this' reference using anonymous inner class
        //But the code will not the work the same in lambda function
        thisReferenceExample.process(10, new Process() {
            @Override
            public void test(int i) {
                System.out.println("Value i is : "+i);
                System.out.println(this); //Here this refers to the new Process anonymous class.
            }

            public String toString(){
                return "This a an anonymous class of Process interface";
            }
        });

        //'this' reference using lambda expression
        thisReferenceExample.process(20,i->{
            System.out.println("Value of i is : "+i);
//            System.out.println(this); This will not work in lambda expression inside a static block
        });

        thisReferenceExample.execute();
    }
}
