class Solution {
    public int findClosestNumber(int[] nums) {
        int dif = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            int distance = Math.abs(nums[i]);
            if(distance < dif) {
                dif = distance;
                ans = nums[i];
            }
            else if(distance == dif) {
                ans = Math.max(ans, nums[i]);
            }
        }
        return ans;
    }
}