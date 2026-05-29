class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        int div = sum/4;
        if(sum % k == 0) return 0;
        else return sum % k;
    }
}