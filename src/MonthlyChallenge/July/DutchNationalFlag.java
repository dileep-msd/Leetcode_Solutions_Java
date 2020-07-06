package MonthlyChallenge.July;


import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {

        int[] array = new int[]{0, 1, 0, 2, 2, 1, 0, 1};

        int begin = 0, mid = 0, high = array.length - 1;

        while (mid < high) {
            if (array[mid] == 0) {
                int temp = array[begin];
                array[begin] = array[mid];
                array[mid] = temp;
                begin++;
                mid++;
            } else if (array[mid] == 1) {
                mid++;
            } else {
                int temp = array[mid];
                array[mid] = array[high];
                array[high] = temp;
                high--;
            }

        }

        System.out.println(Arrays.toString(array));

    }
}
