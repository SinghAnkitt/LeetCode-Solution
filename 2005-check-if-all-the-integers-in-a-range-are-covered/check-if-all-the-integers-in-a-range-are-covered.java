class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int num = right - left + 1;
        int[] freq = new int[num];
        for (int[] range : ranges) {
            int start = Math.max(range[0], left);
            int end = Math.min(range[1], right);
            for (int i = start; i <= end; i++) {
                freq[i - left]++;
            }
        }
        for (int value : freq) {
            if (value == 0) {
                return false;
            }
        }
        return true;
    }
}