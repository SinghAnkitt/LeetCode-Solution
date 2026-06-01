class Solution {
    public static int enc(int val){
        int k = val;
        int max = Integer.MIN_VALUE;
        int count = 0;
        while(val > 0){
            int digit = val % 10;
            if(digit > max) max = digit;
            val /= 10;
            count++;
        }
        int encrypted = 0;
        while(count > 0){
            encrypted = encrypted*10 + max;
            count--;
        }
        return encrypted;
    }
    public int sumOfEncryptedInt(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for(int i = 0; i < len; i++){
            sum += enc(nums[i]);
        }
        return sum;
    }
}