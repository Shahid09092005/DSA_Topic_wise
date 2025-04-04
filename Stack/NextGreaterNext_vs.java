import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class nextGreater {

    public static int[] nextGreaterGenerate(int[]nums){
        Stack<Integer> monoSt= new Stack<>();
        int len = nums.length-1;
        int[] nextGreat = new int[len+1];
        for(int i=len;i>=0;i--){
            if(!monoSt.isEmpty()){ // stack is not empty
                while(!monoSt.isEmpty() && nums[i]>=monoSt.peek()){
                    monoSt.pop();
                }
                if(!monoSt.isEmpty()){
                    nextGreat[i]=monoSt.peek();
                }else{
                    nextGreat[i]=-1;
                    monoSt.push(nums[i]);
                }
            }else{
                nextGreat[i] = -1;
                monoSt.push(nums[i]);
            }
        }
        return nextGreat;
    }
    public static void main(String[] args){
        int[] nums= {5 ,1, 6, 2, 2, 3}; // o/p [6 ,6, -1, 3, 3, -1,] 
        int[] temp = nextGreaterGenerate(nums);
        for(int x:temp){
            System.out.print(x+" ");
        }

    }
    
}
