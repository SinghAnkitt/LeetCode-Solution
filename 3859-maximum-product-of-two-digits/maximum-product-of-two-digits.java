class Solution {
    public int maxProduct(int n) {
        String str = Integer.toString(n);
        char[] num = String.valueOf(n).toCharArray();
        Arrays.sort(num);
        int len = num.length;
        return (num[len-1] - '0') * (num[len-2] - '0');
    }
}