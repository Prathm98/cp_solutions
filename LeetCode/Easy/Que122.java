public class Que122 {
    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
    public int maxProfit(int[] prices) {
        int res = 0;
        for(int i=0; i<prices.length-1; i++){
            if(prices[i] < prices[i+1]){
                res += prices[i+1] - prices[i];
            }
        }
        return res;
    }
}
