package EPI;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "LXVII";
        Map<Character, Integer> values = new HashMap<>();

        {
            values.put('M', 1000);
            values.put('D', 500);
            values.put('C', 100);
            values.put('L', 50);
            values.put('X', 10);
            values.put('V', 5);
            values.put('I', 1);
        }

        int sum = s.charAt(s.length() - 1);
        for (int i = s.length() - 2; i >= 0; i--) {
            if (values.get(s.charAt(i)) < values.get(s.charAt(i + 1))) {
                sum -= values.get(s.charAt(i));
            } else {
                sum += values.get(s.charAt(i));
            }
        }

        System.out.println(sum);
    }
}
