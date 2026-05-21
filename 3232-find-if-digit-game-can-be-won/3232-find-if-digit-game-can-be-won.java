class Solution {
    public boolean canAliceWin(int[] nums) {
        int a = 0;
        int b = 0;
        for(int num : nums)
        {
            if(num < 10)
            {
                a+=num;
            }
            else
            {
                b+=num;
            }
        }
        int alice = Math.max(a, b);
        int bob = Math.min(a, b);

        if(alice > bob)
        {
            return true;
        }
        return false;
    }
}