package Arrays.TwoDArrays;

public class RotateMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2},
                {3, 4}};

        rotateBy90Degree(matrix);
    }

    public static void rotateBy90Degree(int[][] matrix) {
        // reverse transpose is the output of rotated matrix at 90 angle
        int indexRow = 0, indexCol = matrix[indexRow].length - 1;

        // tranpose a matrix.
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }


        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[indexRow][indexCol];
                matrix[indexRow][indexCol] = temp;
                indexCol--;
            }
            indexRow++;
            if (indexRow > matrix.length - 1) {
                break;
            }
            indexCol = matrix[indexRow].length - 1;
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
