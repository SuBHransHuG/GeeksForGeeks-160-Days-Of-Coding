class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            int profit = prices[i] - min;
            if(profit>ans){
                ans = profit;
            }
        }
        return ans;
    }
}
