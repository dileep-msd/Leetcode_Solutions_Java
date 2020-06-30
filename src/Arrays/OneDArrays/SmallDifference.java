package Arrays.OneDArrays;

import java.util.Arrays;

// find the minimum difference of a pair from the array
public class SmallDifference {
    public static void main(String[] args) {

        int[] array = {4, 9, 1, 32, 13};

        findSmallDifference(array);
    }

    public static void findSmallDifference(int[] array) {
        Arrays.sort(array);
        int minDifference = array[1] - array[0];

        for (int i = 2; i != array.length; i++) {
            minDifference = Math.min(minDifference, array[i] - array[i - 1]);
        }

        System.out.println(minDifference);
    }
}
