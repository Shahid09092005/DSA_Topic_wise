// 2022. Convert 1D Array Into 2D Array
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int size = original.length;
        if(size!=m*n) return new int[0][0];
        int[][] mat = new int[m][n];
        int idx=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=original[idx++];
            }
        }
        return mat;
        
    }
}
