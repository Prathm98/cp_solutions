public class Que121 {
    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
    public int maxProfit(int[] prices) {
        int res = 0, temp = 0;
        int max = prices[prices.length-1];
        for(int i=prices.length-1; i>=0; i--){
            temp = max;
            if(prices[i] > max){
                max = prices[i]; 
            }
            if((temp - prices[i]) > res){
                res =  temp - prices[i];
            }
        }
        return res;
    }
}
