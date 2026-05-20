class Solution {
    public int maximumCount(int[] nums) {
        int Pcount = 0;
        int Ncount = 0;
        for(int num : nums)
        {
            if(num < 0)
            {
                Ncount++;
            }
            else if(num > 0)
            {
                Pcount++;
            }
        }
        return Math.max(Pcount, Ncount);
    }
}