class Solution {
    public boolean checkIfPangram(String sentence) 
    {
        boolean[] alpha= new boolean[26];
        int index;

        for (int i=0; i<sentence.length();i++)
        {
            index = sentence.charAt(i) - 'a' ;

            alpha[index]= true;
        }

        
        for (int k=0; k<26;k++)
        {
            if (alpha[k]==false)
            {
                return false;
            }
        }

        return true;

    }
}