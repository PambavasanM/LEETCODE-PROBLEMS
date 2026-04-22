class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0; i< nums.length; i++)
        {
            int c = nums[i];
            if(map.containsKey(c))
            {
                return true;
            }
            map.put(i, c);
        }
        return false;
    }
}