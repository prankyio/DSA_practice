class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int m=0;
        int e=0;
        int count=0;

        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;

        int mid=0;

        if(nums.length==0)
        {
            return ans;
        }


        int start=0;
        int end= nums.length-1;

        //for first-occurence

        while(start<=end)
        {
            mid=start+(end-start)/2;

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

                if(count==0)
                {
                    m=mid;
                    e=end;

                    count=1;
                }
                ans[0]=mid;
                end=mid-1;
               
            }

            
        }


        //For Last Occurence

        start=m;
        end =e;
        
        while(start<=end)
        {
            
            mid=start+(end-start)/2;

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
                ans[1]=mid;
                start=mid+1;
               
            }

            
        }





        return ans;


        
    }
}