package Arrays.OneDArrays;

public class KthFactor {
    public static void main(String[] args) {
        int n = 7;
        int k = 2;
        System.out.println(kthFactor(n, k));
    }

    public static int kthFactor(int n, int k) {

        int[] factors = new int[k + 1];
        int index = 0;
        myloop:
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
                continue;
            }

            if (index > k) {
                break myloop;
            }
        }

        return factors[k - 1];

    }
}
