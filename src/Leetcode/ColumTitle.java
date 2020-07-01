package Leetcode;

public class ColumTitle {
    public static void main(String[] args) {
        int a = 701;
        StringBuilder output = new StringBuilder();

        while (a > 0) {
            a--;
            output.append((char) (a % 26 + 'A'));
            //   System.out.println(a);
            a = a / 26;
        }

        System.out.println(new String(output.reverse()));
    }
}

