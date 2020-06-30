package Arrays.OneDArrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {0, 2, 4, 6,};

        mergeTwoSortedArrays(array1, array2);
    }

    public static void mergeTwoSortedArrays(int[] array1, int[] array2) {
        int i = 0;
        int j = 0;
        int index = 0;

        int[] mergedArray = new int[array1.length + array2.length];

        while (i < array1.length && j < array2.length) {

            if (array1[i] < array2[j]) {
                mergedArray[index++] = array1[i++];
            } else {
                mergedArray[index++] = array2[j++];
            }
        }

        if (i == array1.length) {
            while (j < array2.length) {
                mergedArray[index++] = array2[j++];
            }
        } else {
            while (i < array1.length) {
                mergedArray[index++] = array1[i++];
            }
        }

        System.out.println(Arrays.toString(mergedArray));
    }
}
