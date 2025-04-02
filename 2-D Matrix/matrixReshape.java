// 566. Reshape the Matrix
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if(row*col!=r*c) return mat;
        int[] Array = new int[row*col];
        int idx=0;
        // converted into an array 
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                Array[idx++] = mat[i][j];
            }
        }
        idx=0;
        // now the array is converted according to r and c.
        int[][] matrix = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=Array[idx++];
            }
        }
        return matrix;
        
        
    }
}
