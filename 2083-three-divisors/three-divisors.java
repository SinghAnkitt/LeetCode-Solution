class Solution {
    public boolean isThree(int n) {
        int count = 3;
        int check = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0)check++;
        }
        if(count == check) return true;
        else return false;
    }
}