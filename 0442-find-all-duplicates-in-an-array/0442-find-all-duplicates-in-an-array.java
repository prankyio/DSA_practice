class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
        List<Integer> result= new ArrayList<>();


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

        for (int j=0;j<nums.length;j++)
        {
            if(j!=nums[j]-1)
            {
                result.add(nums[j]);

            }

        }

        return result;
        
    
        
    }
}