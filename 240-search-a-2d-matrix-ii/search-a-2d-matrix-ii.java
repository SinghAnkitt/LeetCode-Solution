class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;
        int i = 0, j = n-1;
        while(j >= 0 && i < m){
            if(arr[i][j] < target) i++;
            else if(arr[i][j] > target) j--;
            else return true;
        }
        return false;
    }
}