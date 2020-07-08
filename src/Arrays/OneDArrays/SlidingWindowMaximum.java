package Arrays.OneDArrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    //Hard:
    public static void main(String[] args) {

        int[] nums = {34, 13, 1, 4, 3};
        int k = 3;
        double start = System.currentTimeMillis();
        int[] output = maxSlidingWindow(nums, k);
        double end = System.currentTimeMillis();

    }


    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] output = new int[nums.length];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < k; i++) maxHeap.add(nums[i]);

        output[0] = maxHeap.peek();
        maxHeap.remove(nums[0]);

        int index = 1;
        int leftPointer = 1;

        for (int i = k; i < nums.length; i++) {
            maxHeap.add(nums[i]);
            output[index++] = maxHeap.peek();
            maxHeap.remove(nums[leftPointer++]);
        }
        output = Arrays.copyOfRange(output, 0, index);
        return output;
    }
}
