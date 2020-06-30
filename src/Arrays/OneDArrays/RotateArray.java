package Arrays.OneDArrays;

import java.util.Arrays;

public class RotateArray {
    //   Given an array, rotate the array to the right by k steps,
    //   where k is non-negative

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateArray(array, k);
    }

    // solution : In this approach, we firstly reverse all the elements of the array.
    // Then, reversing the first k elements
    // followed by reversing the rest n-kn−k elements gives us the required result.
    public static void rotateArray(int[] array, int k) {

        k %= array.length;

        reverse(array, 0, array.length - 1);
        reverse(array, 0, k - 1);
        reverse(array, k, array.length - 1);
        System.out.println(Arrays.toString(array));

    }

    public static void reverse(int[] array, int start, int end) {
        while (start < end) {

            int temp = array[start];
            array[start++] = array[end];
            array[end--] = temp;

        }
    }

}
