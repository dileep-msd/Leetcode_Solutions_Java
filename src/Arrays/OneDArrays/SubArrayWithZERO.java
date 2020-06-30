package Arrays.OneDArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SubArrayWithZERO {
    public static void main(String[] args) {

        int[] array = {1, 2, -5, 1, 2, -1};
        findSubArrayWithSumZero(array);

    }

    public static void findSubArrayWithSumZero(int[] array) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        // hashMap.put(0,-1);
        int sum = 0;
        List<int[]> output = new ArrayList<>();
        for (int i = 0; i <= array.length; i++) {

            Integer oldIndex = hashMap.get(sum);
            if (oldIndex == null && i == array.length) {
                return;
            } else if (oldIndex == null) {
                hashMap.put(sum, i);
                sum += array[i];

            } else {
                output.add(Arrays.copyOfRange(array, oldIndex, i));
            }
        }

        for (int[] i : output) {
            System.out.println(Arrays.toString(i));
        }

    }
}
