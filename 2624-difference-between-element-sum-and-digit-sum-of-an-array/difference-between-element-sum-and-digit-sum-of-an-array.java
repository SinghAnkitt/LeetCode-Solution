// class Solution {
//     public int differenceOfSum(int[] nums) {
//         int sum = 0;
//         int sum1 = 0;
//         for(int i = 0; i < nums.length; i++){
//             sum += nums[i];
//         }
//         for(int i = 0; i < nums.length; i++){
//             if(nums[i] < 10) sum1 += nums[i];
//             else{
//             while( nums[i] > 0){
//                 int digit = nums[i] % 10;
//                 sum1 += digit;
//                 nums[i] /= 10;
//                 }
//             }
//         }
//         return sum - sum1;
//     }
// }

class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for(int num : nums){
            elementSum += num;
            int n = num;
            while(n > 0){
                digitSum += n % 10;
                n /= 10;
            }
        }
        return Math.abs(elementSum - digitSum);
    }
}