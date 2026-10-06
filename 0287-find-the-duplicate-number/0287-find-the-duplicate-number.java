class Solution {
    public int findDuplicate(int[] nums) 
    {
        int i=0;
        int correctindex;
        int temp=0;


        while(i<nums.length)
        {
            correctindex=nums[i]-1;

            if(nums[i]!=nums[correctindex])
            {
                temp=nums[i];
                nums[i]=nums[correctindex];
                nums[correctindex]=temp;

            }
            else
            {
                i++;
            }
        }

        return nums[nums.length-1];
        
    }
}