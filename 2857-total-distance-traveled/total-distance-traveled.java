class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;
        while (mainTank >= 5) {
            distance += 50; // 5 liters = 50 km
            mainTank -= 5;
            if (additionalTank > 0) {
                mainTank++;
                additionalTank--;
            }
        }
        distance += mainTank * 10;
        return distance;
    }
}