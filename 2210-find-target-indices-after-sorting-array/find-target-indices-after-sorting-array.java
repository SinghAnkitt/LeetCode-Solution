class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();

        int low = 0, high = nums.length - 1;
        int left = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        left = low;

        while (left < nums.length && nums[left] == target) {
            ans.add(left);
            left++;
        }

        return ans;
    }
}