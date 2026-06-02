class Solution {
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
    public int countBalls(int lowLimit, int highLimit) {
        int[] arr = new int[46];
        int max = 0;
        for(int i = lowLimit; i <= highLimit; i++){
            int sum = sumOfDigits(i);
            arr[sum]++;
            max = Math.max(max, arr[sum]);
        }
        return max;
    }
}