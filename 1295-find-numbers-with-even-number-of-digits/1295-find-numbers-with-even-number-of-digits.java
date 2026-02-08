class Solution {
    public int findNumbers(int[] nums) {
       int count = 0;
       

        for(int i : nums)
        {
            int dummy = 0;
            while(i>0)
            {
                i = i/10;
                dummy+=1;
            }
            if(dummy%2 == 0)
            {
                count+=1;
            }
        }
        return count;
    }
}