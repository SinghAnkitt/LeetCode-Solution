class Solution {
    public int findDelayedArrivalTime(int aT, int dT) {
        int ans = (aT+dT)%24;
        return ans;
    }
}