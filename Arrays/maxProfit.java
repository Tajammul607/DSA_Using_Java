class Solution {
    public int maxProfit(int[] prices) {
        int min_buy =prices[0];
    int max_profit = 0;

     for(int i =0; i< prices.length; i++){
        if(prices[i] < min_buy){
          min_buy = prices[i];
        }

      int currentProfit = prices[i] - min_buy;
      max_profit = Math.max(currentProfit, max_profit);
     }
return max_profit;
    }
}
