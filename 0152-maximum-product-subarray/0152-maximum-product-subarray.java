class Solution {
    public int maxProduct(int[] nums) 
    {
        int length=nums.length;

        int frontprod=1;
        int frontmax=nums[0];

        int j=length-1;
        int backprod=1;
        int backmax=nums[j];
        

        for(int i=0;i<length;i++)
        {
            frontprod*=nums[i];

            frontmax=Math.max(frontmax,frontprod);

            backprod*=nums[j-i];

            backmax=Math.max(backmax,backprod);

            if(nums[i]==0)
            {
                frontprod=1;
            }
            if(nums[j-i]==0)
            {
                backprod=1;
            }


        }

        return (frontmax>backmax)?frontmax:backmax;



        
    }
}