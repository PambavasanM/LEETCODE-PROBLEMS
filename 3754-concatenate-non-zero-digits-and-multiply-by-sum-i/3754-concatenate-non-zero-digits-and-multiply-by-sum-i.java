class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        int m = n;
        while(m != 0)
        {
            int temp = m%10;
            sum += temp;
            m/=10;
        }

        String s = String.valueOf(n);

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != '0')
            {
                list.add(s.charAt(i) - '0');
            }
        }

        long num = 0;
        for(int digit : list)
        {
            num = num * 10 + digit;
        }

    return (long) sum * num;
    }
}