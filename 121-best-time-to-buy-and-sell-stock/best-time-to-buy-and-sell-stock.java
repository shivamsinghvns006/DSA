
class Solution {
    public int maxProfit(int[] prices) {
        // Track minimum price and maximum profit
        int min_price = prices[0];
        int max_profit = 0;

        for (int price : prices) {
            // Calculate profit if selling on this day
            int profit = price - min_price;
            // Update maximum profit if this profit is greater
            max_profit = Math.max(max_profit, profit);
            // Update minimum price seen so far
            min_price = Math.min(min_price, price);
        }

        return max_profit;
    }
}