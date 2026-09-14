class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>();
        int max = 0;
        for(int nums : candies){
            max = Math.max(nums, max);
        }
        for(int candy : candies){
            ans.add(candy + extraCandies >= max);
        }
        return ans;
    }
}