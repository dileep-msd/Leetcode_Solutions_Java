package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        List<Integer> list = new ArrayList<>();
        System.out.println(checkIfHappy(n, list));

        System.out.println(chekcIfHappy1(19));
    }

    // solution 1: recursion.
    public static boolean checkIfHappy(int n, List<Integer> list) {
        int sum = 0;
        for (char c : String.valueOf(n).toCharArray()) {
            int temp = c - '0';
            sum = sum + temp * temp;
        }

        if (sum == 1) {
            return true;
        }

        if (list.contains(sum)) {
            return false;
        }
        list.add(sum);

        return checkIfHappy(sum, list);
    }

    public static boolean chekcIfHappy1(int n) {
        List<Integer> list = new ArrayList<>();

        while (n != 1) {
            int current = n;
            int sum = 0;
            while (current != 0) {
                sum += (current % 10) * (current % 10);
                current = current / 10;
            }
            if (list.contains(sum)) {
                return false;
            }
            list.add(sum);
            n = sum;
        }
        return true;
    }
}
