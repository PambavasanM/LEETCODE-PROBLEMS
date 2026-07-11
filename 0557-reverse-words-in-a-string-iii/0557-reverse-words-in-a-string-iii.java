class Solution {
    public String reverseWords(String s) {
        String str = " ";
        String st[] = s.split(" ");
        for(String sr : st)
        {
            for(int i = sr.length()-1; i >= 0; i--)
            {
                str += sr.charAt(i);
            }
            str += " ";
        }
        str = str.trim();
        return str;
    }
}