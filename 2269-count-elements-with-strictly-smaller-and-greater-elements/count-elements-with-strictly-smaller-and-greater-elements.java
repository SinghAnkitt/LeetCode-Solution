class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        if(nums[0] == nums[nums.length-1]) return 0;
        int start = 1;
        int end = 1;
        int j = nums.length;
        for(int i = 1; i < j; i++){
            if(nums[0] == nums[i]) start++;
        }
        for(int k = j-2; k >= 0; k--){
            if(nums[j-1] == nums[k]) end++;
        }
        return nums.length - (start + end);
    }
}