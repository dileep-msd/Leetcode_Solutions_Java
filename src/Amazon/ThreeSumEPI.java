package Amazon;

public class ThreeSumEPI {
    // Target can be any value between 0 to n;
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6};
        int target = 10;

        for (int i : array) {
            findTwoSum(array, target - i, i);
        }

    }

    public static void findTwoSum(int[] array, int target, int i) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == target) {
                System.out.println(array[left] + " " + array[right] + " " + i);
                break;
            } else if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            }
        }
    }


}
