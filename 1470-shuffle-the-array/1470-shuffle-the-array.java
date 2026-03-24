class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        List<Integer> list = new ArrayList<>();
        int result[] = new int[nums.length];

        for(int i = 0; i < n; i++)
        {
            list.add(nums[i]);
            list.add(nums[i + n]);
        }
        for(int i = 0; i < list.size(); i++)
        {
            result[i] = list.get(i);
        }

        return result;
    }
}