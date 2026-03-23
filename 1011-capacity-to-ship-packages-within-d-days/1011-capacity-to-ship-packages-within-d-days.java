class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;

        for(int i = 0; i < weights.length; i++)
        {
            left = Math.max(left, weights[i]);
             right += weights[i];
        }

        while(left < right)
        {
            int mid = left + (right - left) / 2;

           if (helper(weights, mid) <= days)
           {
            right = mid;
           }
           else
           {
            left = mid + 1;
           }
        }
        return left;
    }

    private int helper(int [] weights, int mid)
    {
        int sum = 0;
        int d = 1;

        for(int n : weights)
        {
            if(sum + n > mid)
            {
                d += 1;
                sum = n;
            }
            else
            {
                sum += n;
            }
        }
        return d;
    }
}