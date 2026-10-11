class Solution {
    public static int square(int n){
        return n*n;
    }
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        int len = nums.length;
        for(int i = 1; i <= len; i++){
            if(len % i == 0){
                sum += square(nums[i-1]);
            }
        }
        return sum;
    }
}