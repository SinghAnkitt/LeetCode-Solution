import java.util.*;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int[][] rows = new int[m][2];

        for (int i = 0; i < m; i++) {
            int left = 0, right = mat[i].length;

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (mat[i][mid] == 1) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            rows[i][0] = left;
            rows[i][1] = i;
        }

        Arrays.sort(rows, (a, b) ->
            a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]
        );

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = rows[i][1];
        }

        return ans;
    }
}