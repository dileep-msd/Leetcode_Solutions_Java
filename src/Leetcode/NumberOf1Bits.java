package Leetcode;

public class NumberOf1Bits {
    public static void main(String[] args) {
        // solution 1:
        int n = 111111111;
        String s = String.valueOf(Integer.toBinaryString(00000000000000000000000000001011));
        s = s.replaceAll("0", "");
        System.out.println(s.length());

        // solution 2:
        System.out.println(Integer.bitCount(n));
    }
}
