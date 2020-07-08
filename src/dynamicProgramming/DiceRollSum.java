package dynamicProgramming;

public class DiceRollSum {
    public static void main(String[] args) {
        int dice = 2;
        int target = 7;
        int faces = 6;

        findSum(dice, target, faces);
    }

    public static void findSum(int dice, int target, int faces) {
        // dp solution:
        int[][] dpTable = new int[dice + 1][target + 1];
        int MOD = 1000000007;
        dpTable[0][0] = 1;

        for (int i = 1; i <= dice; i++) {
            for (int j = 1; j <= target; j++) {
                if (j > i * faces) {
                    break;
                }

                for (int k = 1; k <= faces && k <= j; k++) {
                    dpTable[i][j] = (dpTable[i][j] + dpTable[i - 1][j - k]) % MOD;
                }
            }
        }

        System.out.println(dpTable[dice][target]);

    }
}
