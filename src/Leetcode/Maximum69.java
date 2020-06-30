package Leetcode;

public class Maximum69 {
    // refer: https://leetcode.com/problems/maximum-69-number/
    public static void main(String[] args) {
        int num = 996996;
        findMaxOf69(num);
    }

    public static void findMaxOf69(int num) {
        String output = String.valueOf(num).replaceFirst("6", "9");
        // int x = Integer.valueOf(String.valueOf(num).replaceFirst("6","9"));
        System.out.println(output);
    }
}
