class Solution {
    public int[] sumZero(int n) 
    {

        int[] ans=new int[n];
        int num=-(n/2);
        int i=0;
        while(i<n)
        {
            if (num==0 && n%2==0)//if number is even then skip zero
            {
                num++;
                continue;
            }
            ans[i]=num;
            
            num++;
            i++;
        }

        return ans;
        
    }
}