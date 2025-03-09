class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n= colors.length;
        int c=0;
        int left=0;
        for(int r=1;r<n+k-1;r++){
            if(colors[r%n]==colors[(r-1)%n]){
                left = r; // skipping the subArray
            }
            if(r-left+1==k){ // len of subarray equals to K
                left++;
                c++;
            }
        }
        return c;
        
    }
}
