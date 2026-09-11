class Solution {
    public boolean search(int[] nums, int target) 
    {
        int start=0;
        int end =nums.length-1;
        int mid;
        boolean ans=false;
        int middle=0;

            while(start<=end)
            {
                mid = start+(end-start)/2;
                middle=nums[mid];


                if(middle==target)
                {
                    ans=true;
                    break;
                }

                if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
                }

                else if(nums[start]<=middle)
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

                else
                {
                    if(target<=nums[end] && target>middle)
                    {
                        start=mid+1;
                    }
                    else
                    {
                        end=mid-1;
                    }
                }


                

            }



        
         
            return ans;

        

        

        
        
    }
}

        