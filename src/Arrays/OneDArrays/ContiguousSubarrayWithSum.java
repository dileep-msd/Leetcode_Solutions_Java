package Arrays.OneDArrays;

public class ContiguousSubarrayWithSum {

    public static void main(String[] args) {
        int[] array = {2, 6, 1, 2, 4, 4};
        int k = 7;
        findSubArray(array, k);
    }

    public static void findSubArray(int[] array, int k) {

        int start = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            while (start < i && sum > k) {
                sum -= array[start++];
            }

            if (sum == k) {
                int end = i - 1;
                System.out.println("Subarray found at : " + start + " " + end);
            }

            if (i < array.length) {
                sum += array[i];
            }
        }


    }
}
