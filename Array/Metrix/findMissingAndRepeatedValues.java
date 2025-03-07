// Optimize version is given below
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len = grid.length;
        int[] arr = new int[len*len];
        int t=0;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                arr[t++] = grid[i][j];
            }
        }
        Arrays.sort(arr);
        int dup = 0 , missing =0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                dup = arr[i];
            }
            if (arr[i] != arr[i - 1] + 1 && arr[i] != arr[i - 1]) {
                missing = arr[i - 1] + 1;
            }
        }
         // Check for missing number at the end
         // Edge case: If the missing number is 1
        if (arr[0] != 1) {
            missing = 1;
        }
         // Edge case: If the missing number is the largest number
        if (missing == 0) {
            missing = len * len;
        }
    
        return new int[]{dup,missing};
        
    }
}

                                                    // Optimize version { for more optimization use xor)
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len =grid.length;
        int[] arr = new int[len*len+1];
        // Hashset bcz it doesn't take duplicate values
        HashSet<Integer> hashset = new HashSet<>();
        int dup=0,missing=0;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                int num = grid[i][j];
                // finding duplicate value
                if(hashset.contains(num)){
                    dup = num;
                }
                hashset.add(num);
            }
        }
        // Finding missing value
        for(int i=1;i<=len*len;i++){
            if(hashset.contains(i)==false){
                missing = i;
                break;
            }
        }
        // return the result
        return new int[]{dup,missing};
    }
}
