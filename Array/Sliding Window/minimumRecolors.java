class Solution {
    public int minimumRecolors(String blocks, int k) {
        int len=blocks.length();
        int cntW=0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                cntW++;
            }
        }
        min = cntW;
        for(int right = k;right<len;right++){
            if(blocks.charAt(right)=='W'){
                cntW++;
            }
            // for left
            if(blocks.charAt(right-k)=='W'){
                cntW--;
            }
            min = Math.min(min,cntW);
        }
        return min;
        
    }
}
