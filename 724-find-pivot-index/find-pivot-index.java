class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        int left = 0;
        for(int i = 0; i < nums.length; i++){
            total += nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            int right = 0;
            left += nums[i];
            right = total - (left - nums[i]);
            if(left == right) return i;
        }
        return -1;
    }
}