class Solution {
    public int[] getConcatenation(int[] nums) {
     int nums2[] = new int[nums.length*2];
     int i;
     for( i =0; i<nums.length; i++)
     {
        nums2[i] = nums[i];
         
     }
     for(int j =0; j<nums.length; j++)
     {
        nums2[i] = nums[j];
      i++;   
     }
     return nums2;
   
    }
}