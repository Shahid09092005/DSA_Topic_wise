class Solution {
    public long coloredCells(int n) {
        double inc = Math.pow(n,2);
        double dec = Math.pow(n-1,2);
        long res = (long)inc + (long)dec;
        return res;

        
    }
}
