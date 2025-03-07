class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // When you try to shift elements directly in the array without using extra space, you will break the relative order of elements.
        int[] res = new int[nums.length];
        int idx=0;
        for(int x : nums){ // for small element
            if(x<pivot){
                res[idx++]=x;
            }
        }
        for(int x : nums){ // for equal element
            if(x==pivot){
                res[idx++]=x;
            }
        }
        for(int x : nums){ // for greater element
            if(x>pivot){
                res[idx++]=x;
            }
        }
        return res;
        
    }
}
