class Solution {
    public static int enc(int val){
        int k = val;
        int max = 0;
        int digits = 0;

        while(val > 0){
            int digit = val % 10;
            if(digit > max) max = digit;
            val /= 10;
            digits++;
        }

        int encrypted = 0;
        while(digits > 0){
            encrypted = encrypted * 10 + max;
            digits--;
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