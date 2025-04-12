class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr =  new ArrayList<>();
        generate(nums,0,curr , ans);
        return ans;
    }
    public static void generate(int[] nums , int i,ArrayList<Integer> curr ,
        List<List<Integer>> ans){
            if(i==nums.length){
                ans.add(new ArrayList<>(curr));
                return ; // stop the recursion
            }
            curr.add(nums[i]);
            generate(nums,i+1,curr,ans);
            curr.remove(curr.size()-1);
            generate(nums,i+1,curr,ans);
            
    }
}
