class Solution {
    public int[][] flipAndInvertImage(int[][] image) 
    {
        int ans[][]= new int[image[0].length][image.length];
       for (int i=0 ;i<image.length ;i++)
       {
            for(int k=image[i].length -1;k>=0;k--)
            {
                ans[i][image[i].length-1 - k]= (image[i][k]==1)? 0 : 1 ; 
            }
       } 

       return ans;
    }
}