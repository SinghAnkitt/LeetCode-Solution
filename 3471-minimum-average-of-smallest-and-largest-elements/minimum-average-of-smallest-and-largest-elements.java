class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double min = Integer.MAX_VALUE;
        double average = 0;
        int i = 0, j = nums.length-1;
        while(i < j){
            average = (nums[i] + nums[j])/2.0;
            if(average < min) min = average;
            i++;
            j--;
            average = 0;
        }
        return min;
    }
}