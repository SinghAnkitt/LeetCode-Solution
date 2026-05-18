class Solution {

    public long countDistinct(long n) {

        return countNumbers(n);
    }

    private long countNumbers(long n) {

        String s = String.valueOf(n);

        int len = s.length();

        long ans = 0;

        // Count numbers with smaller length
        for (int l = 1; l < len; l++) {
            ans += power(9, l);
        }

        // Count numbers with same length
        for (int i = 0; i < len; i++) {

            int digit = s.charAt(i) - '0';

            int start = (i == 0) ? 1 : 0;

            for (int d = start; d < digit; d++) {

                if (d == 0) continue;

                ans += power(9, len - i - 1);
            }

            // If current digit is 0, stop
            if (digit == 0) {
                return ans;
            }
        }

        // Include n itself
        return ans + 1;
    }

    private long power(int a, int b) {

        long res = 1;

        while (b-- > 0) {
            res *= a;
        }

        return res;
    }
}