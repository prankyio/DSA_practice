class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {

        List<Boolean> result=new ArrayList<>();

        for (int k=0;k<candies.length;k++)
        {
            boolean r=true;
            int sum = candies[k]+extraCandies;

            for (int i=0;i<candies.length;i++)
            {
                if (sum<candies[i])
                {
                    r=false;
                    break;
                }
            }

            result.add(r);

        }
        
        return result ;
        
    }
}