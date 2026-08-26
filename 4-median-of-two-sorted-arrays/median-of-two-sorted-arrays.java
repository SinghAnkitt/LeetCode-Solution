class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int i = 0;
        int j = 0;
        int k = 0;
        int sum = 0;
        int[] ans = new int[len1+len2];
        while(k < ans.length){
            if (i < len1 && (j >= len2 || nums1[i] <= nums2[j])) {
                ans[k] = nums1[i];
                i++;
                k++;
            }
            else{
                ans[k] = nums2[j];
                j++;
                k++;
            }
        }
        int mid = ans.length/2;
        if(ans.length % 2 != 0) return (double)ans[mid];
        else return (double)(ans[mid-1]+ans[mid])/2;
    }
}