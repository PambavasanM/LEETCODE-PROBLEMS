class Solution {
    public int minimumDifference(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        if(nums.length == 1)
        {
            return 0;
        }
        else
        {
            int diff = 0;
            for(int i = 0 ; i <= nums.length - k; i++)
            {
                min = Math.min(min, nums[i + k -1] - nums[i]);
            }
        }
        return min;
    }
}