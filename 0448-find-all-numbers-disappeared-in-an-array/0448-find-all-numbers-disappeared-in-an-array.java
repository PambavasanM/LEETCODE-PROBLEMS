class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();

        int expected = 1;

        for (int num : nums) {
            while (expected < num) {
                list.add(expected);
                expected++;
            }

            if (expected == num) {
                expected++;
            }
        }

        while (expected <= nums.length) {
            list.add(expected);
            expected++;
        }

        return list;
    }
}