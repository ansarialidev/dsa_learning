package Com.Ali.LearningDSA.Recursion.factorial;

public class print1toN {
    public static void main(String[] args) {
//        printOneToN(5);
        printNtoOne(5);
    }
    static void printOneToN (int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printOneToN(n-1);
        System.out.println(n);
    }

    static  void printNtoOne (int n) {
        if  (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNtoOne(n-1);
    }
}
