class Solution {
    public int minimumFlips(int n) {
        StringBuilder bin = new StringBuilder(Integer.toBinaryString(n));
        String og = bin.toString();
        String rv = bin.reverse().toString();
        int count = 0;
        if(og.equals(rv))
        {
            return 0;
        }
        else
        {
            for(int i = 0; i < og.length(); i++)
            {
                if(rv.charAt(i) != og.charAt(i))
                {
                    count++;
                }
            }
        }
        return count;

    }
}