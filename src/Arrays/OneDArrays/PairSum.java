package Arrays.OneDArrays;

import java.util.Arrays;
import java.util.HashSet;

public class PairSum {

    public static void main(String[] args) {

        int[] array = {2, 8, 1, 3, 7, 4};
        int sum = 6;

        pairSum(array, sum);

    }

    public static void pairSum(int[] array, int sum) {

        HashSet<Integer> map = new HashSet<>();
        int[] output = new int[2];
        for (int i : array) {
            int difference = sum - i;
            if (map.contains(difference)) {
                output[0] = i;
                output[1] = difference;
            }
            map.add(i);
        }

        System.out.println(Arrays.toString(output));
    }


}
