package EPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeneratePermOfArray {
    private static List<List<Integer>> output = new ArrayList<>();

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        for (int i : nums) {
            temp.add(i);
        }

        do {
            output.add(new ArrayList<>(temp));
            temp = nextPermutation(temp);
        } while (!temp.isEmpty());

        System.out.println(output);


    }


    public static List<Integer> nextPermutation(List<Integer> nums) {
        int k = nums.size() - 2;
        while (k >= 0 && nums.get(k) >= nums.get(k + 1)) {
            k--;
        }

        if (k == -1) {
            return Collections.emptyList();
        }

        for (int i = nums.size() - 1; i > k; i--) {
            if (nums.get(i) > nums.get(k)) {
                Collections.swap(nums, k, i);
                break;
            }
        }
        Collections.reverse(nums.subList(k + 1, nums.size()));


        return nums;
    }
}
