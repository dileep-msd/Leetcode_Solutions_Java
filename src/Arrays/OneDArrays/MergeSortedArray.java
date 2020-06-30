package Arrays.OneDArrays;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        //
        int[] array1 = {1, 2, 3, 0, 0, 0};
        int[] array2 = {2, 5, 6};
        int m = 3, n = 3;
        int k = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while (i >= 0 && j >= 0) {
            array1[k--] = array1[i] > array2[j] ? array1[i--] : array2[j--];
        }

        while (i >= 0) {
            array1[k--] = array1[i--];
        }

        while (j >= 0) {
            array1[k--] = array2[j--];
        }

        System.out.println(Arrays.toString(array1));
    }
}
