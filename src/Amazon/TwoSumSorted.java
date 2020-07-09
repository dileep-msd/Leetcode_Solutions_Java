package Amazon;

public class TwoSumSorted {
    // Two pointers approach
    // Each input will have exactly one input.
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6};
        int target = 7;
        findTwoSum(array, target);
    }


    public static void findTwoSum(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == target) {
                System.out.println(array[left] + " " + array[right]);
                break;
            } else if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            }
        }
    }
}
