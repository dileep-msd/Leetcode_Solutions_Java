package Arrays.OneDArrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// notes: naive approach is using 2 loops.

public class FirstNonRepeatingElement {
    public static void main(String[] args) {

        int[] array = {-1, 3, -1, 3, 2};

        int output = findNonRepeating(array);
        int output2 = findNonRepeating2(array);
        System.out.println(output);
        System.out.println(output2);
    }

    // optimized approach.
    public static int findNonRepeating(int[] array) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> x : map.entrySet()) {
            if (x.getValue() == 1) {
                return x.getKey();
            }
        }

        return -1;
    }

    // another approach

    public static int findNonRepeating2(int[] array) {
        int i = 0;
        Arrays.sort(array);
        while (i < array.length) {

            if (i == 0 && array[i + 1] != array[i]) {
                return array[i];
            }

            if (i == array.length - 1 && array[i - 1] != array[i]) {
                return array[i];
            }

            if (array[i++] == array[i + 1]) {
                continue;
            }

            if (i > 0 && i + 1 <= array.length - 1) {
                if (array[i + 1] != array[i] && array[i - 1] != array[i]) {
                    return array[i];
                }
            }


        }

        return -1;
    }
}
