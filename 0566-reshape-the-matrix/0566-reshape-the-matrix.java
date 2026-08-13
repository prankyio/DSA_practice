class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int rows=mat.length;
        int cols=mat[0].length;

        if ((r*c)<(rows*cols))
        {
            return mat;

        }


        //assuming all inputs passed will be valid.
        int row=0;
        int col=0;

        int[][] ans= new int[r][c];

        if(r>=rows && c>=cols)
        {
            return mat;
        }


        for(int i=0;i<rows;i++)
        {   
        
            for(int j=0;j<cols;j++)
            {
                if (col==c)
                {
                    col=0;
                    row++;

                }

                ans[row][col]=mat[i][j];

                col++;

            }
        }

        return ans;
        
    }
}