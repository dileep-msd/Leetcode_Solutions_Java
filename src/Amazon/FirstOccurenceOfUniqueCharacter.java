package Amazon;

public class FirstOccurenceOfUniqueCharacter {
    public static void main(String[] args) {
        String s = "afasag";
        int result = Integer.MAX_VALUE;
        for (char i = 'a'; i <= 'z'; i++) {
            int n = s.indexOf(i);
            if (n != -1 && n == s.lastIndexOf(i)) result = Math.min(result, n);
        }

        System.out.println(result);

    }
}
