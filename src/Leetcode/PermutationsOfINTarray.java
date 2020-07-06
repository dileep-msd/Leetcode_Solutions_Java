package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfINTarray {
    private static List<List<Integer>> output = new ArrayList<>();

    public static <list> void main(String[] args) {
        int[] array = {1, 2, 3};

        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }

        List<Integer> temp = new ArrayList<>();
        permutation(temp, list);
        System.out.println(output);
    }

    public static void permutation(List<Integer> temp, List<Integer> lists) {

        if (lists.size() == 0) {
            output.add(temp);
            return;
        } else {
            for (int i = 0; i < lists.size(); i++) {
                List<Integer> tempp = new ArrayList<>();
                tempp.add(lists.remove(i));
                List<Integer> list = new ArrayList<>(lists);
                permutation(tempp, list);
            }
        }


    }
}
