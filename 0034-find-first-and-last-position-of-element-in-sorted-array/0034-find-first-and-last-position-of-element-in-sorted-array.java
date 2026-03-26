class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = -1;
        int right = -1;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
            {
                if(left == -1)
            {
                left = i;
            }
             right = i;
            }
        }

        return new int[] {left,right};
    }
}