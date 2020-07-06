package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class checkNameInside {
    //refer:no of number min than the current number at index i
    public static void main(String[] args) {
        int[] nums = new int[]{8, 1, 2, 2, 3};
//        List<Integer> list = IntStream.of(array)
//                .boxed().collect(Collectors.toCollection(ArrayList::new));
//        System.out.println(list.toString());
//        Collections.sort(list);
//        int[] result = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            result[i] = list.indexOf(array[i]);
//        }

        int b[] = nums.clone();
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                continue;
            }
            map.put(nums[i], i);
        }
        System.out.println(map.toString());
        for (int i = 0; i < b.length; i++) {
            nums[i] = map.get(b[i]);
        }

        System.out.println(Arrays.toString(nums));
    }
}
