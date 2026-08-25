class Solution {
    public int search(int[] nums, int target) 
    {
        int start=0;
        int l=nums.length;
        int end =l-1;
        int ans=-1;

        int rindex=0;

        for(int i=1;i<=end;i++)
        {
            if(nums[i]<nums[i-1])
            {
                rindex=i;
            }
        }


        if (target>nums[l-1])
        {
            start=0;
            end=rindex -1;

        while(start<=end)
        {
            int mid = (start+end)/2;

            if(nums[mid]>target)
            {
                end=mid-1;
            }

            else if(nums[mid]<target)
            {
                start=mid+1;
            }

            else
            {
                ans=mid;
                break;
            }



        }

        }

        else
        {
            start=rindex;
            end= l-1;

        while(start<=end)
        {
            int mid = (start+end)/2;

            if(nums[mid]>target)
            {
                end=mid-1;
            }

            else if(nums[mid]<target)
            {
                start=mid+1;
            }

            else
            {
                ans=mid;
                break;
            }



        }

        }

        return ans;
        
    }
}