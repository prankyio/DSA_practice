class Solution {
    public boolean findRotation(int[][] mat, int[][] target) 
    {
        int l=mat.length-1;
        int count=0;
        int elements= (l+1)*(l+1);

        int[][] ans= new int[l+1][l+1];

        
        for(int k=0;k<4;k++) //outermost loop for 3 times rotation 
        {
            count=0;

            for (int i=l;i>=0;i--) //loop for iterating on rows of mat from last --to--> start
            {
                for(int x=0;x<=l;x++) //loop for iterating on specific index element of each row from first --to--> last
                {
                    ans[x][l-i]= mat[i][x];

                    if(ans[x][l-i]==target[x][l-i])
                    {
                        count++; //increasing each time a matching element is found
                    }

                }

            }

            //checking for true or false

            if(count==elements)
            {
                return true;
            }

            //for setting mat = ans
            for(int i=0;i<=l;i++)
            {
                for(int j=0;j<=l;j++)
                {
                    mat[i][j]=ans[i][j];
                }


            }

        }

        return false;
        
        
    }

}