class Solution {
    public int searchInsert(int[] nums, int target) {
        int r = Arrays.binarySearch(nums, target);
        if(r >= 0)
        {
            return r;
        }
        return -(r + 1);
    }
}