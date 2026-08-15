class Solution {
    public int removeDuplicates(int[] nums) {

        int unique=nums[0];

        int len=nums.length;
        int j=1;
        for(int i=0;i<len;i++)
        {
            if (unique!=nums[i])
            {  
                nums[j]=nums[i];
                j++;
            }

            unique=nums[i];

        }

        return j;
        
    }
}