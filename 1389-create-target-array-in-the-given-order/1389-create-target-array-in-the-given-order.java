class Solution {
    public int[] createTargetArray(int[] nums, int[] index)
    {
        int[] target = new int[nums.length];

        for (int i=0 ; i<target.length ; i++)
        {
            if (index[i]<i)
            {
                for (int k=i;k>index[i];k--)
                {
                   target[k]=target[k-1];
                }
            }

            target[index[i]]=nums[i];

        }

        return target;
        
        
        
        
    }
}