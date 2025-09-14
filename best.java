public class best-time-to-buy-and-sell-stock {
      public int maxProfit(int[] prices) {
        int minPrice = prices[0],maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            minPrice = Math.min(prices[i],minPrice);
            maxProfit = Math.max(prices[i]-minPrice,maxProfit);
        }
        return maxProfit;
}
