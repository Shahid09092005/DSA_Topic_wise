class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        if(len==1) return;
        int[] freq = new int[3];
        for(int i=0;i<len;i++){
            freq[nums[i]]++; // storing the frequency of the numbers
        }
        // now change the nums value 
        int idx =0 ;
        int freq_len = 0;
        for(int j=0;j<freq.length;j++){
            int t = freq[j];
            while(t>0){
                nums[idx++] = j;
                t--;
            }
        }
        
    }
}
