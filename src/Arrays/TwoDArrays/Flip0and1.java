package Arrays.TwoDArrays;

// {{{{{{{{{{{{{{{ leetCode hard: yet to practice }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}

// A 2d array has 0 and 1 as values.
// In one flip, 0's are changed to 1 if and only if any of the neighbors (left, right, top, bottom) is 1.
// Return the total number of flips required to convert the whole grid to 1's

public class Flip0and1 {
    private static int count;

    public static void main(String[] args) {

        int[][] array = {
                {1, 0},
                {1, 0},
                {0, 1},
                {0, 1}

        };

        flipValues(array);
    }

    public static void flipValues(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] == 0) {
                    depthFirstSearch(array, i, j);
                    if (array[i][j] == 1) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);

    }

    public static void depthFirstSearch(int[][] array, int i, int j) {

        if (i < 0 || i >= array.length || j < 0 || j >= array[i].length ||
                array[i + 1][j] == 0
                        && array[i - 1][j] == 0
                        && array[i][j + 1] == 0 && array[i][j - 1] == 0) {
            return;
        }

        array[i][j] = 1;
        depthFirstSearch(array, i + 1, j);
        depthFirstSearch(array, i - 1, j);
        depthFirstSearch(array, i, j + 1);
        depthFirstSearch(array, i, j - 1);

    }

}
