package EPI;

import java.util.Arrays;

public class ReverseCharArray {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', ' ', 'x', 'y', 'z'};
        reverse(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                reverse(arr, start, i);
                start = i + 1;
            }
        }
        // reverse the last word
        reverse(arr, start, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(char[] arr, int startIndex, int end) {
        int endIndex = end - 1;
        while (startIndex < endIndex) {
            char c = arr[startIndex];
            arr[startIndex++] = arr[endIndex];
            arr[endIndex--] = c;
        }
    }
}
