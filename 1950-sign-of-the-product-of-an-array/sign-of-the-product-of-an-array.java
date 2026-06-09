class Solution {
    public int arraySign(int[] nums) {
        int count = 0;
        int answer = -5;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0) count++;
            else if(nums[i] == 0) return 0;
            else if(nums[i] > 0) break;
        }
        if(count % 2 == 0) answer = 1;
        else answer = -1;
        return answer;
    }
}