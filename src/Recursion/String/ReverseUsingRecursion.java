package Recursion.String;

public class ReverseUsingRecursion {

    public static void main(String[] args) {

        String s = "varnaa";

        reverseUSingRecursion(s.toCharArray(), 0, s.length() - 1);

    }

    public static void reverseUSingRecursion(char[] s, int start, int end) {

        if (start < end) {
            swap(s, start, end);
            reverseUSingRecursion(s, start + 1, end - 1);
        } else {
            System.out.println(new String(s));
            return;
        }


    }

    public static void swap(char[] s, int start, int end) {

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

    }

}
