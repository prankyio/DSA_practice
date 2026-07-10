class Solution {
    public int[] shuffle(int[] nums, int n) 
    {
        int[] arr=new int[nums.length];

        int j=0;
        for (int i = 0;i<nums.length;i+=2)
        {
            
            

            arr[i] = nums[j];

            j++;

            if (j==n)
            {
                i=-1;
            }

        }

        return arr;
    }
}