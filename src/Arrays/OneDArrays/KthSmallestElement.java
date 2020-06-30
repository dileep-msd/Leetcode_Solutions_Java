package Arrays.OneDArrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 9, 4};
        int k = 2;
        findKthSmallest(array, k);
        findKthSmallest2(array, k);

    }

    //solution 1: sorting
    public static void findKthSmallest(int[] array, int k) {

        Arrays.sort(array);
        System.out.println(array[k - 1]);
    }

    // solution 2: maxHeap
    public static void findKthSmallest2(int[] array, int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int i : array) {
            maxHeap.add(i);
            if (maxHeap.size() > k) {
                maxHeap.remove();
            }
        }

        System.out.println(maxHeap.remove());


    }

}
