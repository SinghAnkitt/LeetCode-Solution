class Solution {
    public static int maximum(int num){
        int max = Integer.MIN_VALUE;
        while(num > 0){
            max = Math.max(max, num % 10);
            num /= 10;
        }
        return max;
    }
        public static int minimum(int num){
        int min = Integer.MAX_VALUE;
        while(num > 0){
            min = Math.min(min, num % 10);
            num /= 10;
        }
        return min;
    }
    public int maxDigitRange(int[] nums) {
        int maxdigitRange = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
           int dif = maximum(nums[i]) - minimum(nums[i]);
            maxdigitRange = Math.max(maxdigitRange, dif);
        }
        for(int i = 0; i < nums.length; i++){
            int dif = maximum(nums[i]) - minimum(nums[i]);
            if(dif == maxdigitRange) sum += nums[i];
        }
        return sum;
    }
}