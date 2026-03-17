class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] % 2 == 0)
            {
                a.add(nums[i]);
            }
            else
            {
                b.add(nums[i]);
            }
        }

        int arr[] = new int[nums.length];

        for(int i = 0; i < a.size(); i++)
        {
            arr[i] = a.get(i);
        }
        for(int i = 0; i <b.size(); i++)
        {
            arr[a.size()+i] = b.get(i);
        }

        return arr;
    }
}