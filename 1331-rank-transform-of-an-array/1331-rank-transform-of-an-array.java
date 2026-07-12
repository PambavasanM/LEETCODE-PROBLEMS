class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int nums[] = arr.clone();
        Arrays.sort(nums);
        int rank = 1;
        for(int i = 0; i < nums.length; i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i], rank);
                rank++;
            }
        }

        int ans[] = new int[arr.length];

        for(int i = 0; i < arr.length; i++)
        {
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}