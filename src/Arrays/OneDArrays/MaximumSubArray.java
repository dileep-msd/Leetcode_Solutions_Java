package Arrays.OneDArrays;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int output = maxSubArray(nums);
        System.out.println(output);
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = 0;
        int sum = 0;
        for (int i : nums) {
            sum = Math.max(i, sum + i);
            maxSum = Math.max(maxSum, sum);
        }


        return maxSum;
    }
}
