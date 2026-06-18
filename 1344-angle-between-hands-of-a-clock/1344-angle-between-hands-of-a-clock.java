class Solution {
    public double angleClock(int hour, int minutes) {
        double theta = Math.abs(30*(hour%12) - 5.5*(minutes));
        double min = Math.min(theta, 360 - theta);
        return min;
    }
}