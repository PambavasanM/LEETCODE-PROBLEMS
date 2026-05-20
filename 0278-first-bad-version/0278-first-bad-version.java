/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return bs(1, n);
    }
    public int bs(int left, int right)
    {
        while(left <= right)
        {
            int mid = left + (right - left)/2;

            if(isBadVersion(mid))
            return bs(left, mid -1);
            else
            return bs(mid + 1, right);
        }
        return left;
    }
}