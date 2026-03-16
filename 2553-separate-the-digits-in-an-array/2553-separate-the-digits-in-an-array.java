class Solution {
    public int[] separateDigits(int[] nums) {
        String s = Arrays.toString(nums);
        s = s.replaceAll("[^0-9]", "");
        int arr[] = new int[s.length()];

        for(int i = 0; i < s.length(); i++)
        {
            arr[i] = s.charAt(i) - '0';
        }

        return arr;
    }
}