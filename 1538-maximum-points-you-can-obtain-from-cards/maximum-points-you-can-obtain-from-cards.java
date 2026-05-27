class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        int totalSum = 0;

        for(int num : cardPoints){
            totalSum += num;
        }

        // if taking all cards
        if(k == n) return totalSum;

        int windowSize = n - k;

        int windowSum = 0;

        // first window
        for(int i = 0; i < windowSize; i++){
            windowSum += cardPoints[i];
        }

        int minWindowSum = windowSum;

        // sliding window
        for(int i = windowSize; i < n; i++){
            windowSum += cardPoints[i];
            windowSum -= cardPoints[i - windowSize];

            minWindowSum = Math.min(minWindowSum, windowSum);
        }

        return totalSum - minWindowSum;
    }
}