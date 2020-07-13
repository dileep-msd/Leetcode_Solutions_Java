package EPI;

import java.util.Arrays;
import java.util.List;

public class SortAnIncreasingDecreasingArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(57, 131, 493, 294, 221, 339, 418, 452, 442, 190);

        int start = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                start = i;
            }
        }
    }
}
