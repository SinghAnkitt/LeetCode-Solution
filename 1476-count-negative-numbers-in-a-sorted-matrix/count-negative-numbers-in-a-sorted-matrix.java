class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int[] a : grid){
            for(int ele : a){
                if(ele < 0) count++;
            }
        }
        return count;
    }
}