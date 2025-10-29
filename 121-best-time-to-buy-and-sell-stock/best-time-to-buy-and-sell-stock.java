class Solution {
    public int maxProfit(int[] prices) {
        int n = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < n){
                n = prices[i];
            }
            pist = prices[i] - n;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }
}