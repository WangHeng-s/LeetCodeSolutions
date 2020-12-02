package normal;

public class Solution_122 {
    public int maxProfit(int[] prices) {
        int result = 0;
        for(int i = 0; i < prices.length-1; i++){
            result += Math.max(0, prices[i+1]-prices[i]);
        }
        return result;
    }
}
