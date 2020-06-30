package Arrays.OneDArrays;

public class LongestSubarrayOf1 {
    // refer:5434. Longest Subarray of 1's After Deleting One Element
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0, 1};
        System.out.println(longestSubarray(nums));
    }

    public static int longestSubarray(int[] A) {
        int start = 0;
        int end = 0;
        int n = A.length;
        int count = 0;

        int maxlength = 0;
        int bestStart = 0;


        while (start < n && end < n) {
            if (A[end] == 0)
                count++;


            while (count > 1) {
                if (A[start] == 0)
                    count--;
                start++;


            }

            maxlength = Math.max(end - start, maxlength);

            end++;

        }
        return maxlength;
    }
}
