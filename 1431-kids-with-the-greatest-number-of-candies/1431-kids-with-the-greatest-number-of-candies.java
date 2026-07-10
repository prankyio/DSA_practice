class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {

        List<Boolean> result=new ArrayList<>();

        int max=0;
        int sum;
        boolean r;

        for (int k=0;k<candies.length;k++)
        {
            if (max<candies[k])
            {
                max=candies[k];
            }
        }

        for (int i=0;i<candies.length;i++)
        {
            r=true;
            sum=candies[i]+ extraCandies;

            if (sum<max)
            {
                r=false;
            }

            result.add(r);

        }
        
        return result ;
        
    }
}