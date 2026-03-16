class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            while(nums[i] > 0)
            {
                temp.add(nums[i]%10);
                nums[i]/=10;
            }

            Collections.reverse(temp);
            list.addAll(temp);
        }
        
        int res[] = new int[list.size()];

        for(int i = 0; i < list.size(); i++)
        {
            res[i] = list.get(i);
        }

       return res; 
    }
}