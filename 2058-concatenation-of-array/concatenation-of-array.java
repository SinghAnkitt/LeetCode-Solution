// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         int n = 2 * nums.length;
//         int[] ans = new int[n];
//         int i = 0;
//         int j = 0;
//         while(i < n){
//             if(i < nums.length){
//                 ans[i] = nums[i];
//             }else{
//                 ans[i] = nums[j];
//                 j++;
//             }
//             i++;
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
}