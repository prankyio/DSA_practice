class Solution {
    public boolean checkIfPangram(String sentence) 
    {
        char[] alpha= new char[26];
        int index;

        for (int i=0; i<sentence.length();i++)
        {
            index = (int)sentence.charAt(i) - 97 ;

            alpha[index]= sentence.charAt(i);
        }

        
        for (int k=0; k<26;k++)
        {
            if (alpha[k]==0)
            {
                return false;
            }
        }

        return true;

    }
}