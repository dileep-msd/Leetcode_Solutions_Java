package MonthlyChallenge.July;

import java.util.Arrays;

public class Day3 {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 1, 1, 0, 0, 1};
        int[] output = prisonAfterNDays(array, 7);
        System.out.println(Arrays.toString(output));

    }

    public static int[] prisonAfterNDays(int[] cells, int N) {
        if (N > 14) {
            N = (N % 14);
        }
        if (N == 0) {
            N = 14;
        }
        for (int k = 0; k < N; k++) {
            int[] temp = new int[cells.length];
            for (int i = 1; i < cells.length - 1; i++) {
                if ((cells[i - 1] == 0 && cells[i + 1] == 0) || (cells[i - 1] == 1 && cells[i + 1] == 1)) {
                    temp[i] = 1;
                } else {
                    temp[i] = 0;
                }
            }

            cells = temp;

        }

        return cells;
    }
}
