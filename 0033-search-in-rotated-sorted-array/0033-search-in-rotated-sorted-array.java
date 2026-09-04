class Solution {
    public int search(int[] nums, int target) 
    {
        int start=0;
        int end =nums.length-1;
        int mid;
        int ans=-1;
        int middle=0;

        if(nums[start]>nums[end])
        {

            while(start<=end)
            {
                mid = start+(end-start)/2;
                middle=nums[mid];


                if(middle==target)
                {
                    ans=mid;
                    break;
                }


                if(middle>=nums[start])
                {
                   if(target>middle || (target<middle && target<nums[start]))
                   {
                    start=mid+1;
                   }
                   else if (target<middle && target>=nums[start] )
                   {
                    end=mid-1;
                   }
                   
                }

                else if(middle<nums[start])
                { 
                   if(target<middle || (target>middle && target>nums[end]))
                   {
                    end=mid-1;
                   }
                   else if (target>middle && target<=nums[end])
                   {
                    start=mid+1;
                   }
                    
                }

                else
                {
                    end=mid-1;
                }


            }
        }



        else
        {
            while(start<=end)
            {
                mid = start+(end-start)/2;
                middle=nums[mid];

                if(target<middle)
                {
                    end=mid-1;
                }

                else if(target>middle)
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