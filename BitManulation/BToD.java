package Com.Ali.LearningDSA.BitManulation;

public class BToD {
    public static void main(String[] args) {
        String binary = "1100";
//        System.out.println(Integer.parseInt(String.valueOf(binary.charAt(1))));
//        System.out.println(binaryToDecimal(binary));
//        System.out.println(decimalToBinary(12));
        System.out.println(2 << 10-1);
    }
    public static int binaryToDecimal (String binary) {
        int ans = 0;
        int len = binary.length()-1;
        for (int i = 0; i < binary.length(); i++) {
            int val = Integer.parseInt(String.valueOf(binary.charAt(i)));
            ans += (int)Math.pow(2,len--) * val;
        }
        return ans;
    }
    public static String decimalToBinary (int n) {
        StringBuilder res = new StringBuilder();
        while (n != 0) {
            res.append(n%2);
            n /= 2;
        }

        return res.reverse().toString();
    }
}
