class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int num : nums)
        {
            total += num;
        }
        int Lsum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            total -= nums[i];
        if(total == Lsum)
        {
            return i;
        }
        Lsum += nums[i];
        }
        return -1;
    }
}