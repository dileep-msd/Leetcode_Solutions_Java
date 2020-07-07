package EPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApplyPermutation {
    public static void main(String[] args) {
        // O(n) solution with O(n) space complexity.
        List<Integer> perm = new ArrayList<>();
        perm.add(2);
        perm.add(0);
        perm.add(1);
        perm.add(3);
        List<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");

        List<String> temp = new ArrayList<>(arr);

        for (int i = 0; i < arr.size(); i++) {
            int x = perm.get(i);
            String s = arr.get(i);
            temp.set(x, s);
        }

        System.out.println(temp);

    }

    public static void applyPermutation(List<Integer> perm, List<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            int next = i;
            while (perm.get(next) >= 0) {
                Collections.swap(array, i, perm.get(next));
                int temp = perm.get(next);
                perm.set(next, perm.get(next) - perm.size());
                next = temp;
            }

        }

        // Restore perm;
        for (int j = 0; j < perm.size(); j++) {
            perm.set(j, perm.get(j) + perm.size());
        }

        System.out.println(array);
    }
}
