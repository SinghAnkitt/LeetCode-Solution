class Solution {
    public int distMoney(int money, int children) {
        if (money < children) {
            return -1;
        }

        money -= children; // Give each child $1

        int ans = Math.min(money / 7, children);

        money -= ans * 7;
        children -= ans;

        // If all children got $8 but money is still left
        if (children == 0 && money > 0) {
            ans--;
        }
        // Remaining money = $3, which would make one child get $4
        else if (children == 1 && money == 3) {
            ans--;
        }

        return ans;
    }
}