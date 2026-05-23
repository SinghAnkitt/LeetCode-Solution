class Solution {
    public int mirrorDistance(int n) {
        String str = Integer.toString(n);
        String reversed = new StringBuilder(str).reverse().toString();
        int rev = Integer.parseInt(reversed);
        int res = rev-n;
        if(res >= 0) return res;
        else return -1*res;
    }
}