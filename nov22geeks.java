class Solution {
    public int maximumProfit(int prices[]) {
        int maxProfit = 0;
        int minPrice = prices[0];
        
        for (int price: prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        
        return maxProfit;
    }
}
