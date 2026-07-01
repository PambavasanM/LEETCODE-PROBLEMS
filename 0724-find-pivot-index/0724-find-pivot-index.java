class Solution {
    public int pivotIndex(int[] nums) {
        
       
        for(int i = 0; i < nums.length; i++)
        {
            int Lsum = 0;
            int Rsum = 0;
            int p = i;

          for(int j =0; j < nums.length; j++)
          {
            if(j < p)
            {
                Lsum+=nums[j];
            }
            else if( j > p)
            {
                Rsum += nums[j];
            }
          }
          if(Lsum == Rsum)
          {
            return p;
          }
        }
        return -1;
    }
}