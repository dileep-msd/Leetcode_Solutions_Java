package Amazon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (int i : map.keySet()) {
            queue.add(i);
            if (queue.size() > k) {
                queue.remove();
            }
        }

        int[] array = new int[k];
        for (int i = 0; i < array.length; i++) {
            array[i] = queue.remove();
        }

        System.out.println(Arrays.toString(array));
    }
}
