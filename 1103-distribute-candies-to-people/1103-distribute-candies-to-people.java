class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        
        int result[] = new int[num_people];
        int count = 0;
        int i = 0;
       while(candies > 0) {
            count++;
            int min = Math.min(count, candies);
            result[i % num_people] += min;
            candies -= min;
            i++;
        }
        return result;
    }
}