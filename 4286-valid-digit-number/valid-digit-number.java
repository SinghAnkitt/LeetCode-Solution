class Solution {
    public boolean validDigit(int n, int x) {
        String n1 = Integer.toString(n);
        String x1 = Integer.toString(x);
        int len = n1.length();
        for(int i = 0; i < len; i++){
            if(n1.charAt(i) == x1.charAt(0) && n1.charAt(0) != x1.charAt(0)) return true;
        }
        return false;
    }
}