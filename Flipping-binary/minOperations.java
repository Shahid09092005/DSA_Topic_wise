class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        int times=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0 && times%2==0 || nums[i]==1 && times%2!=0){
                nums[i]=1;
                count++;
                times++;
            }
        }
        return count;
        
    }
}
