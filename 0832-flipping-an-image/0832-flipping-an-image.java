class Solution {
    public int[][] flipAndInvertImage(int[][] image) 
    {
        int j =image[0].length;

        int ans[][]= new int[j][image.length];


       for (int i=0 ;i<image.length ;i++)
       {
            for(int k=j-1;k>=0;k--)
            {
                ans[i][j-1 - k]= (image[i][k]==1)? 0 : 1 ; 
            }
       } 

       return ans;
    }
}