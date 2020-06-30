package Leetcode;

public class CountandSay {
    // refer: https://leetcode.com/problems/count-and-say/
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countAndSay(n));
    }

    public static String countAndSay(int n) {

        if (n == 1) return "1";

        StringBuilder output = new StringBuilder("11");

        for (int i = 2; i < n; i++) {
            StringBuilder curr = new StringBuilder();
            char c = output.charAt(0);
            int freq = 1;
            for (int j = 1; j < output.length(); j++) {

                if (output.charAt(j) == c) {
                    freq++;
                } else {
                    curr.append(freq).append(c);
                    freq = 1;
                    c = output.charAt(j);
                }
            }
            curr.append(freq).append(c);
            output = new StringBuilder(curr);
        }

        return output.toString();
    }
}