class Solution {
    public int maximumDifference(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if((nums[j]-nums[i])> max) max=(nums[j]-nums[i]);
            }
        }
        return max > 0 ? max : -1;
    }
}