package Leetcode;

public class ValidateDouble {
    public static void main(String[] args) {
        String s = "959440.94f";
        try {
            // check if it can be parsed as any double
            double x = Double.parseDouble(s);
            boolean isValidInt = false;
            // check if the double can be converted without loss to an int
            if (x == (int) x) {
                isValidInt = true;
            }
            boolean isValidDouble = Double.isNaN(x);

            boolean output = isValidDouble || isValidInt;
            System.out.println(output);
        } catch (NumberFormatException e) {
            System.out.println("False");
        }

    }
}
