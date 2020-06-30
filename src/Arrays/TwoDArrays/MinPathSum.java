package Arrays.TwoDArrays;

import java.util.Arrays;

public class MinPathSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 2},
                {4, 3, 1},
                {5, 6, 1}
        };
        FindMinPathSum(matrix);

    }

    public static void FindMinPathSum(int[][] matrix) {

        int dpTable[][] = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                dpTable[i][j] += matrix[i][j];
                if (i > 0 && j > 0) {
                    dpTable[i][j] += Math.min(dpTable[i - 1][j], dpTable[i][j - 1]);
                } else if (i > 0) {
                    dpTable[i][j] += dpTable[i - 1][j];
                } else if (j > 0) {
                    dpTable[i][j] += dpTable[i][j - 1];
                }
            }
        }

        for (int[] i : dpTable) {
            System.out.println(Arrays.toString(i));
        }

    }

}

