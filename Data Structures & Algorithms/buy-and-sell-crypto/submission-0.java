class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int [] rightMax= new int[n];

        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                rightMax[i]=0;
                continue;
            }

            rightMax[i]=Math.max(rightMax[i+1],prices[i+1]);
            
        }

        int profit=0;

        for(int i=0;i<n;i++){
            profit=Math.max(profit,rightMax[i]-prices[i]);
        }

        return profit;
    }
}
