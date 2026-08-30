class Solution {
    public int findMin(int[] nums) 
    {

        int start=0;
        int end =nums.length-1;
        int mid;
        int ans=nums[0];

        if(nums[start]>nums[end])
        {
            while(start<end)
            {
                mid = start+(end-start)/2;

                if(nums[mid]>nums[start])
                {
                   start=mid;
                }

                else if(nums[mid]<nums[start])
                {   
                    end=mid;
                }

                else
                {
                    ans=nums[end];
                    break;
                    
                }



            }

            return ans;

        }

        else
        {
            return ans;
        }


        
        
    }
}