class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] ans = new int[n];
        boolean[] used = new boolean[n];
        int index = 0;

        // Add elements according to arr2
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < n; j++) {
                if (!used[j] && arr1[j] == arr2[i]) {
                    ans[index++] = arr1[j];
                    used[j] = true;
                }
            }
        }

        // Collect remaining elements
        int[] temp = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                temp[k++] = arr1[i];
            }
        }

        // Sort remaining elements
        java.util.Arrays.sort(temp, 0, k);

        // Add them to answer
        for (int i = 0; i < k; i++) {
            ans[index++] = temp[i];
        }

        return ans;
    }
}