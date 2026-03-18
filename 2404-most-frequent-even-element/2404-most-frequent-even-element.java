class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : nums)
        {
            if(n%2 == 0)
            {
                map.put(n, map.getOrDefault(n, 0)+1);
            }
        }

        int max = 0;
        int result = -1;

        for(int key : map.keySet())
        {
            int freq = map.get(key);

            if(freq > max || (freq == max && key < result))
            {
                max = freq;
                result = key;
            }
        }
        return result;
    }
}