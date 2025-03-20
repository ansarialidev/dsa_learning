package Com.Ali.LearningDSA.Pattern;

public class FibonacciPattern {
    public static void main(String[] args) {
//        int a = 0;
//        int b = 1;
//        for (int i = 0; i < 10; i++) {
//            int next = a + b;
//            System.out.println(next);
//            a = b;
//            b =  next;
        fibonacciPattern(5);
        }
    public static void fibonacciPattern (int n) {
        int a = 0, b = 1, c;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a +" ");
                c = a + b;
                a = b;
                b = c;

            }
            System.out.println();
        }
    }
}



