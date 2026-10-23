class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        int sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans.add(nums[i]);
            sum += nums[i];
            total -= nums[i];
            if (sum > total) {
                break;
            }
        }
        return ans;
    }
}
