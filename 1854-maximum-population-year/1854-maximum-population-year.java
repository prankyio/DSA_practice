class Solution {
    public int maximumPopulation(int[][] logs) 
    {
        int x=0;
        int max=0;
        int pop=0;


        //The answer in ALL POSSIBLE CASES will be any of the Birth year

        for(int i=0;i<logs.length;i++)
        {
            pop=0;
            for(int j=0;j<logs.length;j++)
            {
                if(logs[i][0]>=logs[j][0] && logs[i][0]<logs[j][1])
                {
                    pop++;

                }
            }

            if (pop>max)
            {
                max=pop;
                x=logs[i][0];
            }

            else if(pop==max && logs[i][0]<x)
            {
                x=logs[i][0];

            }
            
        }

        return x;




        
    }
}