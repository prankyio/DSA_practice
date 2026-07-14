class Solution {
    public int oddCells(int m, int n, int[][] indices) 
    {
        int[][] matrix=new int[m][n];

        for (int i=0;i<indices.length;i++)
        {
            //for row
            for(int k=0;k<n;k++)
            {
                matrix[indices[i][0]][k]++;
            }
            //for column
            for(int k=0;k<m;k++)
            {
                matrix[k][indices[i][1]]++;
            }
            
        }

        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j] % 2!=0)
                {
                    count++;
                }
            }
        }

        return count;
        
    }
}