class Solution {
    public int maxNumberOfBalloons(String text) {
        int count = 0;
        while(true)
        {
            String word = "balloon";
            for(char ch : word.toCharArray())
            {
                int idx = text.indexOf(ch);

                if(idx == -1)
                {
                    return count;
                }
                text = text.substring(0, idx) + text.substring(idx + 1);
            }
            count++;
        }
    }
}