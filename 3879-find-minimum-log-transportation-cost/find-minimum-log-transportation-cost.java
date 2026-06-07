class Solution {
    public long minCuttingCost(int n, int m, int k) {
        if (n <= k && m <= k) {
            return 0;
        }

        if (n > k) {
            return 1L * k * (n - k);
        }

        return 1L * k * (m - k);
    }
}