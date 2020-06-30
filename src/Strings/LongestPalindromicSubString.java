package Strings;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        String s = "as";
        findLongestPalindrome(s);
    }

    // solution: expansion algorithm
    public static void findLongestPalindrome(String s) {
        if (s.length() < 2) {
            System.out.println(s);
            return;
        }
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = findPalindrome(s, i, i);
            String s2 = findPalindrome(s, i, i + 1);

            String max = s1.length() > s2.length() ? s1 : s2;
            result = max.length() > result.length() ? max : result;

        }

        System.out.println(result);

    }


    public static String findPalindrome(String s, int begin, int end) {
        while (begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }

        return s.substring(begin + 1, end);

    }
}
