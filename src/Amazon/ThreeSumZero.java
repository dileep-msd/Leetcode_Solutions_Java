package Amazon;

import java.util.Arrays;

public class ThreeSumZero {
    // Leetcode
    public static void main(String[] args) {
        int[] array = {-1, 0, 1, 2, -1, -4};
        int target = 0; // default zero. variant : any other target.
        Arrays.sort(array);
        for (int i = 0; i < array.length && array[i] <= 0; i++) {
            if (i == 0 || array[i] != array[i - 1]) {
                int low = i + 1;
                int high = array.length - 1;
                while (low < high) {
                    int sum = array[i] + array[low] + array[high];

                    if (sum < target || (low > i + 1 && array[low] == array[low - 1])) {
                        low++;
                    } else if (sum > target || (high < array.length - 1 && array[high] == array[high + 1])) {
                        high--;
                    } else {
                        System.out.println(array[i] + " " + array[low] + " " + array[high]);
                        low++;
                        high--;
                    }
                }
            }
        }


    }
}
