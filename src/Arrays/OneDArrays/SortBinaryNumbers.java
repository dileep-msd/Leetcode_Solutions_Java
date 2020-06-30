package Arrays.OneDArrays;

import java.util.Arrays;

public class SortBinaryNumbers {

    public static void main(String[] args) {

        int[] array = {1, 0, 1, 1, 1, 1, 1, 0};
        sortBinaryNumbers(array);
        sortBinarySearch1(array);
    }

    //solution 1 : sorting O(nlogn)
    public static void sortBinaryNumbers(int[] array) {

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    //solution 2: counting O(N)

    public static void sortBinarySearch1(int[] array) {

        int startIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[startIndex++] = 0;
            }
        }

        for (int i = startIndex; i < array.length; i++) {
            array[startIndex++] = 1;
        }

        System.out.println(Arrays.toString(array));

    }
}
