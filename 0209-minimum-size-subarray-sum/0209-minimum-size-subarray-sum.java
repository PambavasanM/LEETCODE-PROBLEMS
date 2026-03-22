class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int Min_Len = Integer.MAX_VALUE;
        for(int right = 0; right < nums.length; right++)
        {
            sum+=nums[right];
            while(sum >= target)
            {
                Min_Len = Math.min(Min_Len, right - left +1);

                sum -= nums[left];
                left++;
            }
        }
        if(Min_Len == Integer.MAX_VALUE)
        {
            return 0;
        }
        
    
    return Min_Len;
}
}