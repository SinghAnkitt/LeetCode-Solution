class Solution {
    public int numPrimeArrangements(int n) {
        int primes = 0;
        long MOD = 1_000_000_007;

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes++;
            }
        }

        long result = 1;

        for (int i = 1; i <= primes; i++) {
            result = (result * i) % MOD;
        }

        for (int i = 1; i <= n - primes; i++) {
            result = (result * i) % MOD;
        }

        return (int) result;
    }
}