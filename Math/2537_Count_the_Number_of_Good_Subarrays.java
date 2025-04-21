class Solution {
    public long countGood(int[] nums, int k) {
        if(nums.length==0) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int l=0;// left
        long  count =0; // it will store the ans
        int pairCount =0; // count the no. of good pair
        for(int r=0;r<nums.length;r++){ // r--> points to right
            // below line return 0 if not in the map otherwise give the freq that element
            int freq = map.getOrDefault(nums[r],0);
            pairCount +=freq;
            // now put the freq or incrase the freq in the map
            map.put(nums[r],freq+1); // becuase we are getting the null value so we take the above freq that we find out for that element if not get freq default is 0.
            // shrink the window 
            while(pairCount>=k){ // check until pairCount>=k 
                // count the res for valid good pair
                count +=nums.length-r;
                // decrease the freq of left element bcz we are shrinking the window
                map.put(nums[l],map.get(nums[l])-1); 
                pairCount = pairCount-map.get(nums[l]); // count pairCount
                l++;            // increment of left pointer
            } 
        }
        return count;
    }
}
// this is happen because the return type is long long and we uses int .
