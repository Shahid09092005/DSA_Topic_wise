class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        // int s1=text1.length();
        // int s2=text2.length();
        char[] s1 = text1.toCharArray();
        char[] s2 = text2.toCharArray();
        int s1_len=s1.length;
        int s2_len = s2.length;
        if(s1_len==0||s2_len==0)return 0;
        int[][] dp=new int[s1_len+1][s2_len+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(s1[i-1]==s2[j-1]){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else{
                    dp[i][j] =  Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
        return dp[s1_len][s2_len];
        
    }
}
