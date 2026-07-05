class Solution {
    public List<Integer> spiralOrder(int[][] arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        int m = arr.length, n = arr[0].length;

        int firstRow = 0;
        int firstCol = 0;
        int lastRow = m - 1;
        int lastCol = n - 1;

        while(firstRow <= lastRow && firstCol <= lastCol){

            // left to right
            for(int j = firstCol; j <= lastCol; j++){
                ans.add(arr[firstRow][j]);
            }
            firstRow++;

            // top to bottom
            for(int i = firstRow; i <= lastRow; i++){
                ans.add(arr[i][lastCol]);
            }
            lastCol--;

            if(firstRow > lastRow || firstCol > lastCol)
                break;

            // right to left
            for(int j = lastCol; j >= firstCol; j--){
                ans.add(arr[lastRow][j]);
            }
            lastRow--;

            // bottom to top
            for(int i = lastRow; i >= firstRow; i--){
                ans.add(arr[i][firstCol]);
            }
            firstCol++;
        }

        return ans;
    }
}