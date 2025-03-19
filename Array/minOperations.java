class Solution {
    public int minOperations(int[] nums) {
        int count=0; // count the mini. flips
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==0){ // first , // Flip current and next two elements
                nums[i]=1; 
                if(nums[i+1]==0){ // sec
                    nums[i+1]=1;
                }else{
                    nums[i+1]=0;    
                }
                if(nums[i+2]==0){//third
                    nums[i+2]=1;
                }else{
                    nums[i+2]=0;    
                }
                count++;
            }
        } // for loop exit
        // check all values
        for(int x : nums){
            if(x==0) return -1; // not possible to make all ele. 1 in nums
        }
        return count;
    }
}
