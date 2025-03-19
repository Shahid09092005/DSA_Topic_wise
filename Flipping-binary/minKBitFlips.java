class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int count=0;//count the mini. no. of k-bits flip
        for(int i=0;i<nums.length-k;i++){
            if(nums[i]==0){ // flip the values in nums for k terms
                // nums[i]=1;
                int idx=i;
                int t=0;
                while(t<k){
                    nums[idx++]=(nums[idx]==0)?1:0;
                    t++;
                } // while loop exit
            }
                count++;
        } // for loop exit
        // check all the element of nums
        for(int x:nums){
            if(x==0) return -1; // not possible to make all ele. 1's
        }
        return count;
    }
}
