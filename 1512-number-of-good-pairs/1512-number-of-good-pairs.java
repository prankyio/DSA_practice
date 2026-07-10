class Solution {
    public int numIdenticalPairs(int[] nums) 
    
    {
        int good=0;

        for (int i=0;i<nums.length;i++)
        {
            for(int k=i+1;k<nums.length;k++)
            {
                if (nums[i]==nums[k])
                {
                    good++;
                }
            }
        }

        return good;

        
    }
}