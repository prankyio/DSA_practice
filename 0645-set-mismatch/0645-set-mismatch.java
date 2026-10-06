class Solution {
    public int[] findErrorNums(int[] nums) {

        int i=0;
        int temp=0;
        int correctindex;

        while(i<nums.length)
        {
            correctindex=nums[i]-1;

            if(nums[i]!=nums[correctindex]) 
            {
                temp=nums[i];
                nums[i]=nums[correctindex];
                nums[correctindex]=temp;//current element (nums[i]) gets stored at its desired index
            }
            else
            {
                i++;
            }
        }

        int[] result = new int[2];


        for(int j=0;j<nums.length;j++)
        {
            if(j != nums[j]-1)
            {
                result[0]=nums[j];
                result[1]=j+1;
                break;
            }
        }

        return result;
        
    }
}