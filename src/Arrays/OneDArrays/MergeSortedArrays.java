package Arrays.OneDArrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 4, 5, 9};
        int[] array2 = {2, 3, 4, 8};

        mergeSortedArray(array1, array2);
    }

    public static void mergeSortedArray(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];

        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] > array2[j]) {
                mergedArray[k++] = array2[j++];
            } else {
                mergedArray[k++] = array1[i++];
            }
        }

        if (i == array1.length) {
            for (int i1 = j; i1 < array2.length; i1++) {
                mergedArray[k++] = array2[i1];
            }
        } else if (j == array2.length) {
            for (int i1 = i; i1 < array1.length; i1++) {
                mergedArray[k++] = array1[i1];
            }
        }

        System.out.println(Arrays.toString(mergedArray));

    }
}
