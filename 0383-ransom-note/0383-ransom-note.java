class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char a[] = ransomNote.toCharArray();
        char b[] = magazine.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0;
        int j = 0;

        while(i < a.length && j < b.length)
        {
            if(a[i] == b[j])
            {
                i++;
            }
            j++;
        }
        return i == a.length;
    }
}