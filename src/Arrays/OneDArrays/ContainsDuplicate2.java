package Arrays.OneDArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsDuplicate2 {

    // improvement = remove index values >k; instead of keeping all values.

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        System.out.println(checkContainsDuplicate(nums, k));

    }

    public static boolean checkContainsDuplicate(int[] nums, int k) {

        if (nums == null || nums.length == 0 || k <= 0) {
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                List<Integer> index = new ArrayList<>();
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getKey() == nums[i]) index.add(map.get(entry.getKey()));
                }

                for (int key : index) {
                    if (i - key == k) {
                        return true;
                    }
                }
            }
            map.put(nums[i], i);
        }

        return false;
    }


}

