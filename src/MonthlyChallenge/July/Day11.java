package MonthlyChallenge.July;

import java.util.ArrayList;
import java.util.List;

public class Day11 {
    public static void main(String[] args) {
        // Generate Subsets
        int[] array = {1, 2, 3};
        generateSubsets(array);
    }

    public static void generateSubsets(int[] array) {

        List<List<Integer>> output = new ArrayList<>();

        output.add(new ArrayList<>());

        if (array.length == 0 || array == null) {
            System.out.println(output);
            return;
        }

        int s = 0;
        for (int n : array) {
            s = output.size();
            for (int i = 0; i < s; i++) {
                List<Integer> set = new ArrayList<>(output.get(i));
                set.add(n);
                output.add(set);
            }
        }

        System.out.println(output);


    }
}
