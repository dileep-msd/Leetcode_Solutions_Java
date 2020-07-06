package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SearchInaSortedArray {
    public static void main(String[] args) {
        // uses array reader api.
        List<Integer> reader = new ArrayList<>();
        int target = 4;
        int left = 0, right = 1;
        while (reader.get(right) < target) {
            left = right;
            right <<= 1;
        }

        while (left <= right) {

            int mid = left + (right - left) / 2;
            int num = reader.get(mid);

            if (target == num) System.out.println(mid);
            if (target > num) left = mid + 1;
            else right = mid - 1;
        }

        System.out.println(-1);
    }
}
