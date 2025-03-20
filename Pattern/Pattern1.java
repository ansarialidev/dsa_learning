package Com.Ali.LearningDSA.Pattern;

public class Pattern1 {
    public static void main (String[] args) {
//        System.out.println("Ansari Ali");
        Pattern(7);
    }

    public static void Pattern (int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}

