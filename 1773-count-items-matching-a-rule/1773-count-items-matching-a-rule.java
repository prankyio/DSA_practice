class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) 
    
    {

        int ans =0; 
        if (ruleKey.equals("type"))
        {
            ans = checkrulevalue(items,0,ruleValue);
        }
        if (ruleKey.equals("color"))
        {
            ans = checkrulevalue(items,1,ruleValue);
        }
        if (ruleKey.equals("name"))
        {
            ans = checkrulevalue(items,2,ruleValue);
        }

        return ans;

        
    }

    int checkrulevalue(List<List<String>> items , int key, String value)
    {
        int count=0;
        for(int i=0;i< items.size();i++)
            {
                if (items.get(i).get(key).equals(value))
                {
                    count++;
                }
            }

        return count;
    }
}