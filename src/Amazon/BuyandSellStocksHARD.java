package Amazon;

import java.util.ArrayList;
import java.util.List;

public class BuyandSellStocksHARD {
    public static void main(String[] args) {
        // at most twice.
        int[] array = {12, 11, 13, 9, 12, 8, 14, 13, 15};
        // Solution from EPI;
        findMaxProfit(array);
    }

    private static void findMaxProfit(int[] array) {
        List<Integer> T1profits = new ArrayList<>();
        int t1Min = Integer.MAX_VALUE;
        int t1Profit = 0;

        for (int i : array) {
            t1Min = Math.min(t1Min, i);
            t1Profit = Math.max(t1Profit, i - t1Min);
            T1profits.add(t1Profit);
        }
        System.out.println(t1Profit);
        System.out.println(T1profits);


        t1Min = Integer.MIN_VALUE;
        for (int i = array.length - 1; i > 0; i--) {
            t1Min = Math.max(t1Min, array[i]);
            t1Profit = Math.max(t1Profit, t1Min - array[i] + T1profits.get(i - 1));
        }

        System.out.println(t1Profit);


    }

}
