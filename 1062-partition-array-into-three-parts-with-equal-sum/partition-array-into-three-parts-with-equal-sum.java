class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int total = 0;

        for (int num : arr) {
            total += num;
        }

        if (total % 3 != 0) {
            return false;
        }

        int target = total / 3;
        int sum = 0;
        int parts = 0;

        for (int num : arr) {
            sum += num;

            if (sum == target) {
                parts++;
                sum = 0;
            }

            if (parts == 2 && sum == 0) {
                // Continue to ensure a third non-empty part exists.
            }
        }

        return parts >= 3;
    }
}