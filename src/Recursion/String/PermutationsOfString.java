package Recursion.String;

public class PermutationsOfString {

    public static void main(String[] args) {
        String s = "JSP";
        findPermutation(s, "");
    }

    public static void findPermutation(String s, String word) {

        if (s.length() == 0) {
            System.out.println(word);
            return;
        } else {

            for (int i = 0; i < s.length(); i++) {
                findPermutation(s.substring(0, i) + s.substring(i + 1, s.length()), word + s.charAt(i));
            }


        }
    }

}
