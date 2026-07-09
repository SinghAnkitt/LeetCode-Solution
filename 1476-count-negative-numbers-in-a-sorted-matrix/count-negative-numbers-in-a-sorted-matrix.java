class Solution {
    public int countNegatives(int[][] grid) {
        int rowLength = grid.length;
        int colLength = grid[0].length;
        int row = rowLength - 1;
        int col = 0;
        int count = 0;
        while(row >= 0 && col < colLength){
            if(grid[row][col] < 0){
                count += colLength-col;
                row--;
            }else{
                col++;
            }
        }
        return count;
    }
}