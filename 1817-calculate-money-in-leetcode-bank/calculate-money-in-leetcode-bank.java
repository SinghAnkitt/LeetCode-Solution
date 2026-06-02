class Solution {
    public int totalMoney(int n) {
        int money = 0;
        int monday = 1;
        while(n > 0) {
            for(int day = 0; day < 7 && n > 0; day++) {
                money += monday + day;
                n--;
            }
            monday++;
        }
        return money;
    }
}