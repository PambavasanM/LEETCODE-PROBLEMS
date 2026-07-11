class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = " ";
        String s2 = " ";

    for(String str : word1)
    {
        for(char ch : str.toCharArray())
         {
            s1 += ch;
         }
    }
    for(String str : word2)
    {
        for(char ch : str.toCharArray())
         {
            s2 += ch;
         }
    }
        return s1.equals(s2);
    }
}