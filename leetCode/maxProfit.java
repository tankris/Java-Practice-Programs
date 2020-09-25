/*
Question: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*/

import java.util.List;
import java.util.ArrayList;

class maxProfit {
    public int profit(int[] prices) {
        if(prices.length > 1) {
        int profit = Integer.MIN_VALUE;
        
        for(int i = 0; i < prices.length - 1; i++) {
            List<Integer> list = new ArrayList<>();
            
            for(int j = i + 1; j < prices.length; j++) {
                list.add(prices[j] - prices[i]);
            }
            
            if(Collections.max(list) > profit)
                profit = Collections.max(list);
        }
        
        return (profit <= 0) ? 0 : profit;
        }
        
        return 0;
    }

    public static void main(String[] args) {
    	profit(new int[]{1,2,3});
    }
}
