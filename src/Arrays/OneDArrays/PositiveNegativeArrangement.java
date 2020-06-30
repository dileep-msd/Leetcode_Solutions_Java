package Arrays.OneDArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PositiveNegativeArrangement {
    public static void main(String[] args) {
        int[] array = {-1, 6, 9, -4, -10, -9, 8, 8, 4};

        arrangeTheValues(array);
    }

    public static void arrangeTheValues(int[] array) {

        List<Integer> positiveValues = new ArrayList<>();
        List<Integer> negativeValues = new ArrayList<>();

        for (int i : array) {
            if (i > 0) {
                positiveValues.add(i);
            } else {
                negativeValues.add(i);
            }
        }
        int i = 0;
        int index = 0;
        while (i < array.length) {
            if (!positiveValues.isEmpty()) {
                array[i++] = positiveValues.remove(index);
            }
            if (!negativeValues.isEmpty()) {
                array[i++] = negativeValues.remove(index);
            }

            //   index++;
        }


        System.out.println(Arrays.toString(array));

    }
}
