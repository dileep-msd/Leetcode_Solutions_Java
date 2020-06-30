package Arrays.OneDArrays;

import java.util.*;

public class FindTheDuplicate {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 2, 5, 1, 7};

        List<Integer> output = findDuplicates(array);
        System.out.println(output);

        List<Integer> output2 = findDuplicates2(array);
        System.out.println(output2);


    }

    // solution 1: O( nlogn * n ) time complexity.  space complexity O(1)
    public static List<Integer> findDuplicates(int[] array) {

        long function1Start = System.currentTimeMillis();
        Arrays.sort(array);
        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                output.add(array[i]);
            }
        }

        long function1End = System.currentTimeMillis();
        System.out.println(function1End - function1Start);
        return output;
    }

    //Solution 2: O(n) time complexity. but space complexity is O(n)

    public static List<Integer> findDuplicates2(int[] array) {
        long func2Start = System.currentTimeMillis();
        List<Integer> output = new ArrayList<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int i : array) {
            if (duplicates.contains(i)) {
                output.add(i);
            } else {
                duplicates.add(i);
            }
        }
        long fun2End = System.currentTimeMillis();
        System.out.println(fun2End - func2Start);
        return output;
    }
}
