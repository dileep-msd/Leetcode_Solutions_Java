package Arrays.OneDArrays;

import java.util.Arrays;
import java.util.TreeMap;

public class MockTest2 {
    public static void main(String[] args) {
        int[] arr1 = {2, 21, 43, 38, 0, 42, 33, 7, 24, 13, 12, 27, 12, 24, 5, 23, 29, 48, 30, 31};
        int[] arr2 = {2, 42, 38, 0, 43, 21};
        relativeSortArray(arr1, arr2);

    }

    public static void relativeSortArray(int[] arr1, int[] arr2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i : arr1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int[] output = new int[arr1.length];

        int index = 0;
        for (int i : arr2) {
            int count = map.remove(i);
            for (int j = 0; j < count; j++) {
                output[index++] = i;
            }
        }

        for (int i : map.keySet()) {
            output[index++] = i;
        }


        System.out.println(Arrays.toString(output));


    }
}
