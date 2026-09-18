class Solution {
    public boolean search(int[] nums, int target) 
    {
        int start=0;
        int end=nums.length-1;
        int mid;
        int middle;

        while(start<=end)
        {
            mid=start + (end-start)/2;
            middle=nums[mid];

            if (middle==target)
            {
                return true;
            }

            
            if(middle==nums[start] && middle==nums[end] && start!=end)
            {
                start++;
                end--;
                continue;
            }

            if (middle>=nums[start])
            {
                if(target>=nums[start] && target<middle)
                {
                    end=mid-1;
                }

                else
                {
                    start=mid+1;
                }
            }

            else if(middle<nums[start])
            {
                if(target>middle && target<=nums[end])
                {
                    start=mid+1;
                }

                else
                {
                    end=mid-1;
                }
            }


        } 

        return false;       
    }
}