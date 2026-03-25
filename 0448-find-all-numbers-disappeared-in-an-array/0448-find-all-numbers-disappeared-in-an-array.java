class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();

        int expected = 1;

        for(int i = 0; i < nums.length; i++) {
            while(expected < nums[i]) {
                list.add(expected);
                expected++;
            }
            expected = nums[i] + 1;
        }
        while(expected <= nums.length) {
            list.add(expected);
            expected++;
        }

        return list;
    }
}