package EPI;

import java.util.Arrays;
import java.util.Collections;

public class NextPermutaion {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = nums.length - 2;
        int n = nums.length - 1;
        while (k >= 0 && nums[k] > nums[k + 1]) {
            k--;
        }

        if (k == nums.length) {
            return;
        }

        for (int i = nums.length - 1; i > k; i--) {
            if (nums[i] > nums[k]) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                break;
            }
        }

        Collections.reverse(Arrays.asList(nums).subList(k + 1, nums.length));
        System.out.println(Arrays.toString(nums));
    }
}
