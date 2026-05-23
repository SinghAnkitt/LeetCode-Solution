class Solution {
    public boolean canAliceWin(int[] nums) {
        int len = nums.length;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < len; i++){
            if(nums[i] <= 9) sum1 += nums[i];
            else sum2 += nums[i];
        }
        return (sum1 == sum2) ? false : true ;
    }
}