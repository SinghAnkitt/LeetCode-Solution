class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (index < k || nums[i] != nums[index - k]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return Arrays.copyOf(nums, index);
    }
}