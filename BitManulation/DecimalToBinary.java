package Com.Ali.LearningDSA.BitManulation;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(19));
        System.out.println(decimalToBinary(21));
        System.out.println(decimalToBinary(2));
    }
    public static String decimalToBinary (int n) {
        StringBuilder res = new StringBuilder();
        while (n > 0) {
            res.append(n % 2);
            n /= 2;
        }
        return res.reverse().toString();
    }
}
