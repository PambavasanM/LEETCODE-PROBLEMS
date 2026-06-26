class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++)
        {
            if(Character.isLetter(s.charAt(i)))
            {
                stack.push(s.charAt(i));
            }
            else
            {
                char ch = stack.pop();
            }
        }
        
        StringBuilder str = new StringBuilder();

        for(char ch : stack)
        {
            str.append(ch);
        }
        return str.toString();
    }
}