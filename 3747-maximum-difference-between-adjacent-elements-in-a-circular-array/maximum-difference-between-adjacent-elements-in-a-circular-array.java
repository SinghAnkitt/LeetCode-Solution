class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int dif = Math.abs(nums[0] - nums[nums.length-1]);
        int i = 0, j = 1;
        while(j < nums.length){
            dif = Math.max(dif, Math.abs(nums[j]-nums[i]));
            i++;
            j++;
        }
        return dif;
    }
};
