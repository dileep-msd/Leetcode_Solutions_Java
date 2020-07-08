package Leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class SlidingWindowMedian {
    static int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
    static int k = 3;

    public static void main(String[] args) {

        Comparator<Integer> comparator = (a, b) ->
                nums[a] != nums[b] ?
                        Integer.compare(nums[a], nums[b]) : a - b;

        TreeSet<Integer> small = new TreeSet<>(comparator);
        TreeSet<Integer> big = new TreeSet<>(comparator);
        int n = nums.length;

        double[] result = new double[n - k + 1];
        for (int i = 0; i < nums.length; i++) {
            addNums(i, small, big);
            if (i + 1 >= k) {
                int start = i - k + 1;
                result[start] = findMedian(small, big, nums);


                if (!small.remove(start)) {
                    big.remove(start);
                }

                if (small.size() < big.size()) {
                    small.add(big.pollFirst());
                }
                System.out.println("Small-");
                for (int x : small) {
                    System.out.print(nums[x] + " ");
                }
                System.out.println();

                System.out.println("big-");
                for (int x : big) {
                    System.out.print(nums[x] + " ");
                }
                System.out.println();

            }
        }

        System.out.println(Arrays.toString(result));
    }

    private static double findMedian(TreeSet<Integer> small, TreeSet<Integer> big, int[] nums) {
        if (small.isEmpty()) { // ideally should never happen
            return 0;
        } else if (small.size() == big.size()) {
            return ((double) nums[small.last()] + nums[big.first()]) / 2;
        } else {
            return nums[small.last()];
        }
    }

    private static void addNums(int i, TreeSet<Integer> small, TreeSet<Integer> big) {
        if (small.size() == big.size()) {
            big.add(i);
            small.add(big.pollFirst());
        } else if (small.size() > big.size()) {
            small.add(i);
            big.add(small.pollLast());
        }

        System.out.println("Small-");
        for (int x : small) {
            System.out.print(nums[x] + " ");
        }
        System.out.println();
        System.out.println("big-");
        for (int x : big) {
            System.out.print(nums[x] + " ");
        }
        System.out.println();
    }
}
