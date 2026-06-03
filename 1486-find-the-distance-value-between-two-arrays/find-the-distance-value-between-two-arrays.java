class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        int i = 0;
       
        while(i < arr1.length){
             boolean check = true;
            for(int j = 0; j < arr2.length; j++){
                if(Math.abs(arr1[i] - arr2[j]) <= d){
                    check = false;
                    break;
                }
            }
            i++;
            if(check == true) count++;
        }
        return count;
    }
}