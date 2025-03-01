class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2= nums2.length;
        int n1_idx = 0;
        int n2_idx =0;
        if((n1==0 || n2==0)) return -1;
        while(n1_idx<n1 && n2_idx<n2){
            if(nums1[n1_idx]==nums2[n2_idx]) return nums1[n1_idx];
            if(nums1[n1_idx]<nums2[n2_idx]){
                n1_idx++;
            }else{
                n2_idx++;
            }
        }
        return -1;

        
    }
}
