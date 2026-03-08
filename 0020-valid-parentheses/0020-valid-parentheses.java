class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        //int count = 0;

        for(char ch : s.toCharArray())
        {
            if(ch == '(' || ch == '[' || ch == '{')
            {
                stack.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}')
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                char top = stack.peek();

                    if(top == '(' && ch == ')' || top == '[' && ch == ']' || top == '{' && ch == '}')
                    {
                        stack.pop();
                        //count++;
                        
                    }
                    else
                    {
                        return false;
                    }
                
            }
        }
        return stack.isEmpty();
    }
}