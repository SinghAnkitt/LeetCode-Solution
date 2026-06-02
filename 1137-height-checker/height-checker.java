class Solution {
    public int heightChecker(int[] heights) {
        int len = heights.length;
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = heights[i];
        }
        Arrays.sort(heights);
        int count = 0;
        for(int i = 0; i < len; i++){
            if(arr[i] != heights[i]) count++;
        }
        return count;
    }
}