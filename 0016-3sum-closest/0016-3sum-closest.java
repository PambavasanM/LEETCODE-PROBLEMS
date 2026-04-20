class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
int left = 0;
int right = nums.length-1;
int s=0;
for(int i = 0; i< right; i++)
{
    for(int j = i+1; j< right; j++)
    {
        for(int k = j+1; k< right; k++)
        {
            s = nums[i]+nums[j]+nums[k];
            
        }
    }
    
}    
return s;
}
}
