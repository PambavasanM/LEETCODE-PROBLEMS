class Solution {
    public int trap(int[] height) {
        int leftMax = height[0];
        Stack<Integer> rightMax = new Stack<>();

        rightMax.push(height[height.length-1]);
        for(int i = height.length-2; i>=2; i--)
        {
            int temp = Math.max(rightMax.peek(), height[i]);
            rightMax.push(temp);
        }

        int total = 0;

        for(int i = 1; i < height.length-1; i++)
        {
            int min = Math.min(rightMax.peek(), leftMax);
            int temp = min - height[i];
            total += Math.max(0, temp);

            rightMax.pop();
            leftMax = Math.max(leftMax, height[i]);
        }
        return total;
    }
}