package MonthlyChallenge.July;

public class Day7 {
    public static void main(String[] args) {

        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };

        int result = findPermiter(grid);
        System.out.println(result);

    }

    public static int findPermiter(int[][] grid) {
        int perimeter = 0;
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0)
                    continue;
                if (i == 0 || grid[i - 1][j] == 0) perimeter++;
                if (i == n - 1 || grid[i + 1][j] == 0) perimeter++;
                if (j == 0 || grid[i][j - 1] == 0) perimeter++;
                if (j == m - 1 || grid[i][j + 1] == 0) perimeter++;
            }
        return perimeter;
    }
}
