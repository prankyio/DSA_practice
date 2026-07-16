class Solution {
    public int findNumbers(int[] nums) {

        int numdig;
        int count=0;

        for(int i=0;i<nums.length;i++)
        {
            numdig=0;

            numdig= digcounter(nums[i]);

            if(numdig%2==0)
            {
                count++;
            }

        }

        return count;
        
    }

    int digcounter(int x)
    {
        int digits=0;

        while(x!=0)
        {
            x/=10;
            digits++;
        }

        return digits;
    }


}