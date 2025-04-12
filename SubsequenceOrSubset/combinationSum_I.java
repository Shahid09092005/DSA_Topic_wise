class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        generate(candidates,0,target,curr,ans); // calling the function
        return ans;
    }

    // function
    public static void generate(int[] nums ,  int idx , int target ,ArrayList<Integer>
    curr , List<List<Integer>> ans){
        if(target<0 || idx==nums.length) return;
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        // include 
            curr.add(nums[idx]);
            generate(nums, idx, target-nums[idx], curr, ans);
        // exclude
            curr.remove(curr.size()-1); 
            generate(nums, idx+1, target, curr, ans);

        }
    }
