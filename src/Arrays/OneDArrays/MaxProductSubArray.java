package Arrays.OneDArrays;

import java.util.Arrays;

public class MaxProductSubArray {
    // refer: https://www.youtube.com/watch?v=HbIA1z1ySvo
    public static void main(String[] args) {

        int[] array = {2, 3, -2, 0};
        findMaxProduct(array);


    }

    public static void findMaxProduct(int[] array) {
        int[] negativeProduct = Arrays.copyOfRange(array, 0, array.length);
        int j = array.length - 2;

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] != 0) {
                array[i] = array[i - 1] * array[i];
            }
            if (negativeProduct[j + 1] != 0) {
                negativeProduct[j] = negativeProduct[j + 1] * negativeProduct[j];
            }
            j--;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(negativeProduct));
        int maxProduct = Math.max(Arrays.stream(array).max().getAsInt(), Arrays.stream(negativeProduct).max().getAsInt());
        System.out.println(maxProduct);
    }
}
