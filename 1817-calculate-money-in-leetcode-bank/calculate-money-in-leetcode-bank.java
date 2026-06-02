// class Solution {
//     public int totalMoney(int n) {
//         int money = 0;
//         int monday = 1;
//         while(n > 0) {
//             for(int day = 0; day < 7 && n > 0; day++) {
//                 money += monday + day;
//                 n--;
//             }
//             monday++;
//         }
//         return money;
//     }
// }

class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;
        int days = n % 7;

        int completeWeeks =
                28 * weeks + (7 * weeks * (weeks - 1)) / 2;

        int remainingDays =
                days * (weeks + 1) + (days * (days - 1)) / 2;

        return completeWeeks + remainingDays;
    }
}