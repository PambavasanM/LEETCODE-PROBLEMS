class Solution {
    public int thirdMax(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        if (list.size() < 3) {
            return list.get(list.size() - 1);
        }

        return list.get(list.size() - 3);
    }
}