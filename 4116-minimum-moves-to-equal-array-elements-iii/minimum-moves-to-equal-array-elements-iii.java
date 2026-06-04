class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int check = nums[nums.length-1];
        int count = 0;
        for(int i = 0; i < nums.length-1; i++){
            count += check-nums[i];
        }
        return count;
    }
}