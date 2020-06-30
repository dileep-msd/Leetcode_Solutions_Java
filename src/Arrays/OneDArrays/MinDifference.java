package Arrays.OneDArrays;

import java.util.Arrays;

public class MinDifference {
    public static void main(String[] args) {
        int[] array = {5, 6, 3, 2, -7, 12, -8, -9};
        findMinDifference(array);
    }

    public static void findMinDifference(int[] array) {
        Arrays.sort(array);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < array.length; i++) {
            min = Math.min(min, array[i] - array[i - 1]);
        }

        System.out.println(min);
    }
}
