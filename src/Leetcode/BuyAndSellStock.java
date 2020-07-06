package Leetcode;

public class BuyAndSellStock {
    public static void main(String[] args) {
        double[] doubles = {62.352, 753.14, 462564.242, 1, 252, 7};
        double minPrice = Double.MAX_VALUE;
        double maxProfit = 0.0;

        for (double price : doubles) {
            maxProfit = Math.max(maxProfit, price - minPrice);
            minPrice = Math.min(minPrice, price);
        }

        System.out.println(maxProfit);
    }
}
