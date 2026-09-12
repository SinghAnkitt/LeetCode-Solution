class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int len = nums.length;
        int mid = len/2;
        int digit = nums[mid];
        int count = 0;
        for(int i = 0; i < len; i++){
            if(nums[i] == digit) count++;
        }
        if(count == 1) return true;
        return false;
    }
}