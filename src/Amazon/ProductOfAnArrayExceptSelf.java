package Amazon;

import java.util.Arrays;

public class ProductOfAnArrayExceptSelf {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] output = new int[array.length];

        output[0] = 1;

        for (int i = 1; i < output.length; i++) {
            output[i] = output[i - 1] * array[i - 1];
        }

        System.out.println(Arrays.toString(output));

        int r = 1;

        for (int i = array.length - 1; i >= 0; i--) {
            output[i] = output[i] * r;
            r *= array[i];
        }

        System.out.println(Arrays.toString(output));
    }
}
