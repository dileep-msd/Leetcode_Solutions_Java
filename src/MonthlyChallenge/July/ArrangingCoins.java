package MonthlyChallenge.July;

public class ArrangingCoins {
    public static void main(String[] args) {
        int coin = 8;
        System.out.println(arrangeCoins(coin));
        System.out.println(arrangeCoins1(coin));
    }

    // Naive Solution.
    public static int arrangeCoins(int n) {

        if (n == 1) {
            return 1;
        }

        if (n <= 0) {
            return 0;
        }

        int count = 0;
        int num = 1;

        while (n >= 0) {
            if (n - num >= 0) {
                count++;
                num++;
                n = n - count;
            } else {
                return count;
            }
        }

        return count;
    }

    //Binary Search
    // Find the maximum kk such that k(k+1) <= N

    public static int arrangeCoins1(int n) {
        long left = 0, right = n;
        long k, curr;
        while (left <= right) {
            System.out.println("left " + left);
            System.out.println("Right " + right);

            k = left + (right - left) / 2;
            System.out.println(k);
            curr = k * (k + 1) / 2;
            System.out.println(curr);

            if (curr == n) return (int) k;

            if (n < curr) {
                right = k - 1;
            } else {
                left = k + 1;
            }

        }

        return (int) right;
    }

}
