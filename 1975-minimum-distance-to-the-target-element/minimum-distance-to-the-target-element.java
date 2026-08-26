class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int index = -1;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                index = i;
                int dif = Math.abs(i - start);
                min = Math.min(min, dif);
            }
        }
        return min;
    }
}