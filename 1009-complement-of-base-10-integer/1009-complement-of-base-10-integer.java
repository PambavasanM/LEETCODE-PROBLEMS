class Solution {
    public int bitwiseComplement(int n) {
        String bin = Integer.toBinaryString(n);
        String ans = "";
        for(char ch : bin.toCharArray())
        {
            if(ch == '0')
            {
                ans += '1';
            }
            else
            {
                ans += '0';
            }
        }
        return Integer.parseInt(ans, 2);
    }
}