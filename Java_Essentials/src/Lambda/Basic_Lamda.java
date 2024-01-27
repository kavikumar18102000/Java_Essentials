package Lambda;


public class Basic_Lamda {

    interface myLambda{
        public int foo(int a, int b);
    }

    public static void main(String[] args) {
        myLambda l = (a,b) -> a+b;
        process(l);
    }

    public static void process(myLambda l){
        System.out.println(l.foo(10,20));
    }
}
