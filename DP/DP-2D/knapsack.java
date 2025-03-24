class Solution {
    static int knapsack(int W, int val[], int wt[]) {
        int[][] dp = new int[val.length+1][W+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 && j==0){
                    dp[i][j]=0;
                }else if (i==0 || j==0){
                    dp[i][j]=0;
                }else{
                    if(wt[i-1]<=j){ // able to pick up
                        dp[i][j] = Math.max(val[i-1]+dp[i-1][j-wt[i-1]] , dp[i-1][j]);
                        //  dp[i][j] = Math.max(dp[i-1][j],val[i-1]+dp[i-1][j-wt[i-1]]) ;
                    }else{
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }
            return dp[val.length][W];
        
    }
}
