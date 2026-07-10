//This below code is written by me. but it is not optimized. 

//In order to improve the time complexity, we can sort the array and get the answer for each array element.



class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int[] result=new int[nums.length];

        for (int i=0;i<nums.length;i++)
        {
            int count=0;
            for (int j =0;j<nums.length;j++)
            {
                if(j==i)
                {
                    continue;
                }

                else if (nums[i]>nums[j])
                {
                    count++;
                }
            }

            result[i]=count;

        }

        return result;

        
    }
}