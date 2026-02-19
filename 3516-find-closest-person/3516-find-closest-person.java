class Solution {
    public int findClosest(int x, int y, int z) {
        int sum1 = Math.abs(z-x);
        int sum2 = Math.abs(z-y);
        if(sum1 < sum2)
        {
            return 1;
        }
        else if(sum2 < sum1)
        {
            return 2;
        }
        return 0;
    }
}