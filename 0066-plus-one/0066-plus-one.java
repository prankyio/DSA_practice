class Solution {
    public int[] plusOne(int[] digits) {

        int inc=0;// variable to count no of 9's and how much to increase the size of array

        int diglen=digits.length;

        for (int i=diglen-1;i>=0;i--)
        {
            if(digits[i]==9)
            {
                inc++;
                break;
            }
        }

        int[] ans=new int[diglen+inc]; //we will get the required size of array

        int k=1;

        int j=diglen-1;

        for (int i=ans.length-1;i>=0;i--)
        {
            if (j>=0)
            {
                k=digits[j]+k;
                j--;
            }
            
            ans[i]=k%10;

            k=k/10;
        }

        if(ans[0]==0)
        {
            int[] res= new int[ans.length-1];
            int m=1;
            for(int i=0;i<res.length;i++)
            {
                res[i]=ans[m];
                m++;

            }

            return res;
        }

        
        return ans;

        
    }
}