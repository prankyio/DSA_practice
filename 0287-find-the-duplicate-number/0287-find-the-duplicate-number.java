class Solution {
    public int findDuplicate(int[] nums) 
    {
        /*MY 1st Method👇

        I solved it using the sum of natural numbers approach, by subtraction of the expected sum from actual sum.*/


        //MY 2nd Method👇
        int i=0;
        int correctindex;
        int temp=0;


        while(i<nums.length)
        {
            correctindex=nums[i]-1;
            
            if(nums[i]!=i+1) //if current element is present at wrong index (i.e. not at an index 1 greater than itself )
            {
                if(nums[correctindex]==nums[i]) //then check if that same element is ALREADY present at its CORRECT INDEX
                {
                    return nums[i];   //if yes then return it, cuz its the duplicate
                }
                else  //else swap
                {
                temp=nums[i];
                nums[i]=nums[correctindex];
                nums[correctindex]=temp;

                }

            }
            else
            {
                i++;
            }
        }

        return nums[nums.length-1];
        
    }
}