package MonthlyChallenge.July;

public class Day12 {
    public static void main(String[] args) {
        // Reverse the bits;
        int x = 266305;
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            ans = ans | (x & 1);
            x >>= 1;

        }
    }
}
