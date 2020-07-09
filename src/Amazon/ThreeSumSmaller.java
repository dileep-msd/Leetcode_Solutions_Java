package Amazon;

import java.util.Arrays;

public class ThreeSumSmaller {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 1, 3};
        int target = 2;
        Arrays.sort(nums);

        int count = 0;
        int n = nums.length - 1;
        for (int i = 0; i < nums.length - 2; i++) {
            count += findSumSmaller(i + 1, n, target - nums[i], nums);
        }
        System.out.println(count);
    }

    private static int findSumSmaller(int left, int right, int target, int[] nums) {
        int sum = 0;
        while (left < right) {
            int temp = nums[left] + nums[right];
            if (temp < target) {
                sum += right - left;
                left++;
            } else {
                right--;
            }
        }

        return sum;
    }
}
