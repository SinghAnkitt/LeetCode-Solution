class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;

        for (int x : aliceSizes) sumA += x;
        for (int y : bobSizes) sumB += y;

        for (int a : aliceSizes) {
            for (int b : bobSizes) {
                if (sumA - a + b == sumB - b + a) {
                    return new int[]{a, b};
                }
            }
        }

        return new int[]{};
    }
}