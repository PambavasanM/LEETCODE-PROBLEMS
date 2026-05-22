class Solution {
    public int[] concatWithReverse(int[] nums) {
        int nums2[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            nums2[nums.length-1-i] = nums[i];
        }
        int arr[] = new int[nums.length+nums2.length];
        System.arraycopy(nums, 0, arr, 0, nums.length);
        System.arraycopy(nums2, 0, arr, nums.length, nums2.length);
        return arr;
    }
}