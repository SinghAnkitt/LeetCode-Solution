class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        int j = 1;
        boolean check = true;
        int min = arr[j] - arr[i];
        while(j < arr.length){
            int dif = arr[j] - arr[i];
            if(dif != min){
                check = false;
                break;
            }
            i++;
            j++;
        }
        if(check) return true;
        else return false;
    }
}