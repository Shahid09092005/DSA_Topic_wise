class Solution {
    public int activitySelection(List<Integer> start, List<Integer> end) {
        // code here.
        int n=end.size(); // size of the end or start bcz they have same size
        ArrayList<Integer> sortList = new ArrayList<>();
        for(int i=0;i<n;i++){
            sortList.add(i);  // add index like [0,1,2,3,4,5]
        }
        // sortList contains indices sorted based on the end times of the activities 
        Collections.sort(sortList,(a,b) -> (end.get(a)-end.get(b)));
        // The first activity is always selected before the loop starts, and that activity corresponds
        // to the one with the earliest end time.
        int maxActivity = 1;
        int lastEnd = end.get(sortList.get(0));
        for(int i=1;i<n;i++){
            int index = sortList.get(i);
            if(start.get(index)>lastEnd){
                maxActivity++;
                lastEnd = end.get(index);
            }
        }
        return maxActivity;
        
        // sorting on the end bases
        
    }
}
