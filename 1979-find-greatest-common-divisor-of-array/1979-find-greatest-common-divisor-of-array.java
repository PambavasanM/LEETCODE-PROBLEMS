import java.math.BigInteger;
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length-1];

       
      return BigInteger.valueOf(min).gcd(BigInteger.valueOf(max)).intValue();
    }

    
}