package Arrays.OneDArrays;

import java.util.HashMap;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {

        int[] array = {10, 5, 2, 7, 1, 9};
        int k = 15;
        findLongestSubArray(array, k);
    }


    public static void findLongestSubArray(int[] array, int k) {

        int sum = 0;
        int Longest = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {

            sum += array[i];

            if (sum == k) {
                Longest = i + 1;
            }

            map.putIfAbsent(sum, i);

            if (map.containsKey(sum - k)) {
                if (Longest < i - map.get(sum - k)) {
                    Longest = i - map.get(sum - k);
                }
            }
        }


        System.out.println(Longest);


    }
}


