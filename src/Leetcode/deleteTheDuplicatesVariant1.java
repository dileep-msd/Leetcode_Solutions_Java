package Leetcode;

import java.util.Arrays;

public class deleteTheDuplicatesVariant1 {
    public static void main(String[] args) {
        int[] array = {9, 2, 3, 5, 9, 1, 9};
        int k = 9;

        int index = 0;
        int end = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != k) {
                array[index++] = array[i];
                array[i] = 0;
            } else {
                array[i] = 0;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
