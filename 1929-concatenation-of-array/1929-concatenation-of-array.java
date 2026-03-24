class Solution {
    public int[] getConcatenation(int[] nums) {
        int nums2[] = new int[nums.length];

        for(int i=0; i<nums.length; i++)
        {
            nums2[i] = nums[i];
        }

        int result[] = new int[nums.length*2];

        System.arraycopy(nums, 0, result, 0, nums.length);
        System.arraycopy(nums2, 0, result, nums.length, nums2.length);

        return result;
    }
}