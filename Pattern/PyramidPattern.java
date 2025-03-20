package Com.Ali.LearningDSA.Pattern;

public class PyramidPattern {
    public static void main(String[] args) {
        pattern(4);
    }
    public static void pattern (int n) {
        for (int i = 1; i <= 5; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
