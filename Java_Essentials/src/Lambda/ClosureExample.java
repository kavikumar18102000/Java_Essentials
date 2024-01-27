package Lambda;

public class ClosureExample {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        /*process(a, new Process() {
            @Override
            public void test(int i) {
                //Here is available only side this scope but how it is access in the process function??
                //JVM keeps track of the b, but u cannot modify the value of b, it should be final or effectively final.
                System.out.println(i+b);
            }
        });*/

        process(a,c-> System.out.println(c+b));

    }

    public static void process(int i, Process p){
        p.test(i);
    }
}

interface Process{
    void test(int i);
}
