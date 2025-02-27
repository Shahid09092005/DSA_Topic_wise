class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        // -231 <= xstart < xend <= 231 - 1 so we will compare
        // Sorting the intervals by their end points
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int endval = points[0][1];
        int arrows = 1;
        for(int i=1;i<n;i++){
            if(endval<points[i][0]){
                arrows++;
                endval = points[i][1];
            }
        }
        return arrows;
    }
}
