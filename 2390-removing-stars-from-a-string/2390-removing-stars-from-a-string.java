class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch: s.toCharArray())
        {
            if(Character.isLetter(ch))
            {
                st.push(ch);
            }
            else
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
            }
        }
        StringBuilder str = new StringBuilder();
        for(char ch : st)
        {
            str.append(ch);
        }
        return str.toString();
    }
}