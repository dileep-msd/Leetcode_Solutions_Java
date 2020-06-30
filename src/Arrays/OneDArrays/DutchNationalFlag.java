package Arrays.OneDArrays;

import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] array = {1, 2, 0, 1, 2, 0, 0, 2, 1, 1, 1, 1, 2, 0, 0};
        solveDutchFlag(array);
    }


    public static void solveDutchFlag(int[] array) {

        int low = 0, mid = 0, hi = array.length - 1;

        while (mid <= hi) {
            int colour = array[mid];

            if (colour == 0) {
                int temp = array[low];
                array[low] = array[mid];
                array[mid] = temp;
                mid++;
                low++;
            } else if (colour == 1) {
                mid++;
            } else if (colour == 2) {
                int temp = array[mid];
                array[mid] = array[hi];
                array[hi] = temp;
                hi--;
            }
        }


        System.out.println(Arrays.toString(array));
    }


    // another solution to solve this: https://www.techiedelight.com/sort-array-containing-0s-1s-2s-dutch-national-flag-problem/
}
