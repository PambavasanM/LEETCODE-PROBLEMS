class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int key : map.keySet())
        {
           if(map.get(key) > nums.length/2)
           {
            return key;
           }
        }
        return -1;
    }
}