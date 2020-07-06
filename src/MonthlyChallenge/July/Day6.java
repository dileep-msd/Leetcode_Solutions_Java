package MonthlyChallenge.July;

import java.util.Arrays;

public class Day6 {
    // Plus One
    public static void main(String[] args) {
        int[] array = {9, 9, 9, 9};

        int n = array.length - 1;
        array[n] = array[n] + 1;

        for (int i = n; i > 0 && (array[i] == 10); i--) {
            array[i] = 0;
            array[i - 1] = array[i - 1] + 1;
        }

        if (array[0] == 10) {
            int[] temp = new int[array.length + 1];
            temp[0] = 1;
            int index = 1;
            for (int i = n; i > 0; i--) {
                temp[index++] = array[i];
            }

            System.out.println(Arrays.toString(temp));
        }

        System.out.println(Arrays.toString(array));
    }
}
