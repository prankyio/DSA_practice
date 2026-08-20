class Solution {
    public int mySqrt(int x) 
    {
        if(x==0)
        {
            return 0;
        }

        int ans=1;

        for(int i=1;i<x;i++)
        {
            if(i*i==x)
            {
                ans=i;
                break;

            }

            else if((long)i*i>(long)x)
            {
                ans=i-1;
                break;
            }
        }


        return ans;

        
    }
}