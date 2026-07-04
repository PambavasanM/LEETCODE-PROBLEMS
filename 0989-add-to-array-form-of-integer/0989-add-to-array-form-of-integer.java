import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder sb = new StringBuilder();

        for(int i : num)
        {
            sb.append(i);
        }

        BigInteger n = new BigInteger(sb.toString());
        BigInteger sum = n.add(BigInteger.valueOf(k));

        ArrayList<Integer> list = new ArrayList<>();

        for(char c : sum.toString().toCharArray())
        {
            list.add(c - '0');
        }
        return list;
    }
}