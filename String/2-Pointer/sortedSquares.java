class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int idx=n-1;
        int i=0;
        int j= n-1;
        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])){ // nums[i]>nums[j]
                arr[idx--] = nums[i]*nums[i];
                i++;

            }else if(Math.abs(nums[i])==Math.abs(nums[j])){ // for equal values
                arr[idx--] = nums[i]*nums[i];
                i++;
            }else{ // nums[i]<nums[j]
                arr[idx--] = nums[j]*nums[j];
                j--;
            }
        }
        return arr;
        
    }
}
