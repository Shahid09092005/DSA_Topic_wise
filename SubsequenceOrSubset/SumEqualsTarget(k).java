import java.util.*;

public class sum {
    
    public static void main(String[] args) {
        // int[] nums = {1,2,1};
        int[] nums = {2, 3, 5, 6, 8, 10};
        // int k=2;
        int k = 10;
        int sum=0;
        List<List<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        generate(nums,0,k, sum ,curr,ans);
        System.out.println("Output is below");
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i)+" ");
        }
    }
    public static void generate(int[] nums ,  int idx , int k ,int sum,ArrayList<Integer> curr , List<List<Integer>> ans){
        if(idx==nums.length ) {
            if(sum==k) ans.add(new ArrayList<>(curr));
            return ;
        }
        // include
        sum += nums[idx]; // taking in the sum part
        curr.add(nums[idx]);
        generate(nums, idx+1, k, sum, curr, ans);
        // exclude
        sum -=nums[idx]; // not taking in the sum part
        curr.remove(curr.size()-1); 
        generate(nums, idx+1, k, sum, curr, ans);
    }
    
}
