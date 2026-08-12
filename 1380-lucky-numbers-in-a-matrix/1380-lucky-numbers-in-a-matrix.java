class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) 
    {
        int min;
        boolean check;
        int colindex;

        List<Integer> lucknum= new ArrayList<>();

        for (int i=0;i<matrix.length;i++)
        {
            min=matrix[i][0];
            colindex=0;
            check=true;

            for(int j=0;j<matrix[i].length;j++)
            {
                if (matrix[i][j]<min)
                {
                    min=matrix[i][j];
                    colindex=j;
                }
            }

            for(int k=0;k<matrix.length;k++)
            {
                if (k==i)
                {
                    continue;
                }

                if (matrix[k][colindex]>min)
                {
                    check=false;
                    break;
                }

            
            }

            if(check==true)
            {
                lucknum.add(min);
            }

            
        }

        return lucknum;
        
    }
}