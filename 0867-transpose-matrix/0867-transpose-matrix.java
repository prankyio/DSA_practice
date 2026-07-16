class Solution {
    public int[][] transpose(int[][] matrix) {

        int row =matrix.length;
        int col=matrix[0].length;
        int[][] ans = new int[col][row];



        for(int i =0 ; i<row; i++)
        {
            for(int k=0; k<col;k++)
            {
                ans[k][i]=matrix[i][k];
            }
        }

        return ans;
        
    }
}