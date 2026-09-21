class Solution {
    public int maxSubArray(int[] nums) 
    {
        int currentsum=nums[0];
        int maxsofar=nums[0];

        //KADANE's Algorithm

        for(int i=1;i<nums.length;i++)
        {
            if (nums[i]>(currentsum+nums[i]))
            {
                currentsum=nums[i];
            }

            else
            {
                currentsum+=nums[i];
            }

            if(maxsofar<currentsum)
            {
                maxsofar=currentsum;
            }

        }


        return maxsofar;
        
    }
}