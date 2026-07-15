class Solution {
    public int diagonalSum(int[][] mat) {

        int lastindex=mat.length - 1;

        int sum=0;

        for(int i=0;i<=lastindex;i++)
        {
            sum+= mat[i][i];

            sum+= mat[lastindex-i][i];
        }

        if(lastindex%2==0) //this means that matrix is odd order
        {
            int i = lastindex /2;

            sum-=mat[i][i];
        }

        return sum;
        
    }

}