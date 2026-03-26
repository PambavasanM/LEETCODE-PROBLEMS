class Solution {
    public int search(int[] nums, int target) {
       int r = Arrays.binarySearch(nums, target);
       if(r >= 0)
       {
        return r;
       }
       return -1;
    }
}