class Solution {
    public boolean checkGoodInteger(int n) {
        int sum = 0;
        int squareSum = 0;
        int num = n;
        while(n > 0){
            int temp = n % 10;
            sum += temp;
            squareSum += temp*temp;
            n /= 10;
        }
        if((squareSum - sum) >= 50) return true;
        return false;
    }
}