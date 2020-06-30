package Strings;

import java.util.Arrays;

public class PalindromicString {
    public static void main(String[] args) {
        String s = "OP";
        System.out.println(findPalindromic(s));
    }

    public static boolean findPalindromic(String s) {
        char[] c = s.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        int i = 0, j = c.length - 1;
        System.out.println(Arrays.toString(c));
        myloop:
        while (i < j) {
            if (c[i] == c[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }

        return true;
    }
}
