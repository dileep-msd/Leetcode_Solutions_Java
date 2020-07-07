package EPI;

import java.util.Arrays;

public class Rearrange {
    /* write a program that takes an array A of n numbers, and rearranges A's elements
    to get a new array B having the property that B[0] < B[l] > B[2] < B[3] > B[4] < B[5] >
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i - 1] > array[i]) {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            }
            if (array[i] % 2 != 0 && array[i - 1] < array[i]) {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            }

        }

        System.out.println(Arrays.toString(array));
    }
}
