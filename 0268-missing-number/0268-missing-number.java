class Solution {
    public int missingNumber(int[] nums) 
    {
        int i=0;
        int length=nums.length;

        int answer=0;
        int temp=0;

        boolean lastelementfound=false; 

        while(i<length)
        {
            int currentnum=nums[i];

            if(currentnum==length)
            {
                answer=i;
                i++;
                lastelementfound=true;

            }
            else if(currentnum!=i)
            {
                nums[i]=nums[currentnum];//storing the number present at the correct index of currentnum on the wrong index of currentnum (which is the current index in the loop)
                nums[currentnum]=currentnum;//storing the currentnum at its correct index;
                
            }
            else
            {
                i++;
            }

        }

        if(!lastelementfound)
        {
            answer=nums.length;
        }


        return answer;
        
    }
}