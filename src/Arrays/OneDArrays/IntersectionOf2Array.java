package Arrays.OneDArrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOf2Array {
    public static void main(String[] args) {

        int[] array1 = {21, 34, 41, 22, 35};
        int[] array2 = {61, 34, 45, 21, 11};

        findIntersection(array1, array2);

    }

    public static void findIntersection(int[] array1, int[] array2) {

        Set<Integer> map = new HashSet<>();
        List<Integer> output = new ArrayList<>();

        for (int i : array1) {
            map.add(i);
        }

        for (int i : array2) {
            if (map.contains(i)) {
                output.add(i);
            }
        }

        System.out.println(output);
    }

}
