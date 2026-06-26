class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb = new StringBuilder(s);

        while(sb.length() > 2)
        {
            StringBuilder nxt = new StringBuilder();
        for(int i = 1; i < sb.length(); i++)
        {
            int sum = (sb.charAt(i) - '0') + (sb.charAt(i-1) - '0');
            nxt.append(sum % 10);
        }
        sb = nxt;
        }
        return sb.charAt(0) == sb.charAt(1);
    }
}