class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int common = 10;
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    common = Math.min(common, nums1[i]);
                }
            }
        }
        if(common != 10){
            return common;
        }
        int min1 = 10;
        int min2 = 10;
        for(int num1 : nums1){
            min1 = Math.min(min1, num1);
        }
        for(int num2 : nums2){
            min2 = Math.min(min2, num2);
        }
        if(min1 > min2){
            return (min2 * 10 + min1);
        }else{
            return (min1 * 10 + min2);
        }
    }
}