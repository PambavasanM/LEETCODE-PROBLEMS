class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i = 0; i < letters.length; i++)
        {
            if(letters[i] - '0' > target - '0')
            {
                char ch = letters[i];
                return ch;
            }
        }
        return letters[0];
    }
}