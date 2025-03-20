package Com.Ali.LearningDSA.BitManulation;

public class BinaryToDecimal {
    public static void main(String[] args) {
//        System.out.println(Math.pow(8, 2));
//        String str = "abc";
//        System.out.println(str.charAt(2));
        String str = "10001";
        System.out.println(binaryToDecimal(str));

    }
    public static int binaryToDecimal (String n) {
        int len = n.length()-1;
        int res = 0;
        for (int i = 0; i < n.length(); i++) {
            int bit = Character.getNumericValue(n.charAt(len--));
            res += bit * (int)Math.pow(2, i);
        }
        return res;
    }

}
