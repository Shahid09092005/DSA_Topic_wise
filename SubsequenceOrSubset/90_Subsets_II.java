class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr =  new ArrayList<>();
        int idx =0;
        generate(nums,idx,curr,ans);
        return ans;
        
    }
    public static void generate(int[] nums , int idx,List<Integer> curr,List<List<Integer>> ans){

        // Base case 
        if(idx==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        // Include
            curr.add(nums[idx]);
            generate(nums,idx+1,curr,ans);
        // exclude
            curr.remove(curr.size()-1); // it will remove the value not the index from curr.
            // hanlde duplicate value
            while(idx+1<nums.length && nums[idx]==nums[idx+1]) idx++;
            generate(nums,idx+1,curr,ans);

    }
}
