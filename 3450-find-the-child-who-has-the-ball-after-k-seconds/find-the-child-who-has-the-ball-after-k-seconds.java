class Solution {
    public int numberOfChild(int n, int k) {
        int pos = k % (2 * (n - 1));

        if (pos < n) {
            return pos;
        }

        return 2 * (n - 1) - pos;
    }
}