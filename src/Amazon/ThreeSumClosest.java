package Amazon;

import java.util.Arrays;

public class ThreeSumClosest {
    // variant : 3 sum smaller.
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 2;
        int difference = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, high = nums.length - 1;
            while (left < high) {
                int sum = nums[i] + nums[left] + nums[high];
                if (sum == target) {
                    System.out.println("closest sum: " + target);
                    break;
                }

                if (Math.abs(target - sum) < Math.abs(difference)) {
                    difference = target - sum;
                }

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    high--;
                }
            }
        }

        System.out.println(target - difference);
    }


}
