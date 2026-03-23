class Solution {
    public int countDigits(int num) {
        int count = 0;
        int og = num;
        while(num > 0)
        {
            int temp = num % 10;
            if(og % temp == 0 && temp != 0)
            {
                count +=1;
            }
            num = num / 10;
        }
        return count;
    }
}