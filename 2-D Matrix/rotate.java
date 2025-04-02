// 48. Rotate Image
class Solution {
    public void rotate(int[][] matrix) {
        int row =  matrix.length;
        int col=matrix.length;
        // but row==col so use any one 
        // step 1. Calculating the transpose of the metrix
        for(int i=0;i<row;i++){
            for(int j=i+1;j<row;j++){
                int t=matrix[i][j];
                matrix[i][j] =  matrix[j][i];
                matrix[j][i]= t;
            } // inner loop end
        } // outer loop end
        // now below is reverse code of columns
        for(int i=0;i<row;i++){
            int left=0;
            int right=row-1;
            while(left<right){
                int t = matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=t;
                left++;
                right--;
            }
        }
    }
}
