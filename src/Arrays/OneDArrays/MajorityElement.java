package Arrays.OneDArrays;

import java.util.HashMap;

public class MajorityElement {
    // element that occurs more than n/2 times

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 2, 2, 2, 2, 4, 2, 2, 2, 2, 2, 2, 2};
        findMajorityElement(array);
    }

    static public void findMajorityElement(int[] array) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int i : array) {
            frequency.put(i, frequency.getOrDefault(i, 0) + 1);
            if (frequency.get(i) > array.length / 2) {
                System.out.println(i + " is the majority element");
                break;
            }
        }

    }
}
