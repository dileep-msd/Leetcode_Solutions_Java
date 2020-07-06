package Leetcode;

public class searchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target == nums[mid]) System.out.println(mid);
            if (target < nums[mid]) right = mid - 1;
            else {
                left = mid + 1;
            }
        }

        System.out.println(left);

    }
}
