class Solution {
    public boolean detectCapitalUse(String word) {
        boolean lower = false;
        boolean upper = false;
        if(Character.isUpperCase(word.charAt(0)) &&
            word.substring(1).equals(word.substring(1).toLowerCase()))
        {
            return true;
        }
        for(char ch : word.toCharArray())
        {
            if(Character.isLowerCase(ch))
            {
                lower = true;
            }
            else
            {
                upper = true;
            }
        }
        if(lower && upper)
        {
            return false;
        }
        return true;
    }
}