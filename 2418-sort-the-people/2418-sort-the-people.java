class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> arr = new HashMap<>();

        for(int i=0; i<names.length; i++)
        {
            arr.put(heights[i],names[i]);
        }

        Arrays.sort(heights);

        int a = 0;
        String s[] = new String[names.length];

        for(int i=heights.length-1; i>=0; i--)
        {
            s[a++] = arr.get(heights[i]);
        }

        return s;
        
    }
}


       