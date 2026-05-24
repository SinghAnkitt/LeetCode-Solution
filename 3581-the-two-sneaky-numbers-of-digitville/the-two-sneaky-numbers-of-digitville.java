// class Solution {
//     public int[] getSneakyNumbers(int[] nums) {
//         Arrays.sort(nums);
//         int[] ans = new int[2];
//         int count = 0;
//         for(int i = 0; i < nums.length-1; i++){
//             if(nums[i] == nums[i+1]) {
//                 ans[count] = nums[i];
//                 count++;
//             }
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] freq = new int[nums.length];
        int[] ans = new int[2];
        int idx = 0;

        for (int num : nums) {
            freq[num]++;

            if (freq[num] == 2) {
                ans[idx++] = num;
            }
        }

        return ans;
    }
}