class Solution {
    public int findDuplicate(int[] nums) 
    {
        /*MY 1st Method👇

        I solved it using the sum of natural numbers approach, by subtraction of the expected sum from actual sum.*/


        /*MY 2nd Method👇
        
        I solved it by sorting using cyclic sort and returning nums[lastindex] cuz at the end the duplicate would always end up at the last--->     
        
        BECAUSE, 
        
        the total length (no. of nums in array) is n+1 and 1 to n numbers are present so the xtra 1 is nothing but the duplicate and after sorting 1 to n will come at its desired place and the extra "+1" index will have nothing but the duplicate. */

        //MY 3rd Method👇
        // Using cyclic sort - same method as Kunal's , just the inner if-else conditions are flipped.

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

        return -1;

        
    }
}