class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;  // Use length without parentheses for arrays
        ArrayList<Integer> arrList = new ArrayList<>();
        // Initialize index list
        for(int i=0;i<n;i++){
            arrList.add(i);
        }
        // Sort the array based on the second column (end time) using indexes
        Collections.sort(arrList,(a,b)->(intervals[a][1]-intervals[b][1]));
        int overlap = 0;
        //Initialize endVal with the first sorted interval's end time
        int endVal = intervals[arrList.get(0)][1];
        for(int i=1;i<n;i++){
            int idx = arrList.get(i);
            if(intervals[idx][0]>=endVal){ // non-overlapping condition
            endVal = intervals[idx][1];   
            }else{
                overlap++; // Count the overlapping interval
            }
        }
        return overlap; 
    }
}
