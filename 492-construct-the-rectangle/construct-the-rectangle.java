class Solution {
    public int[] constructRectangle(int area) {
        int i = 1;
        int j = area;
        int min = Integer.MAX_VALUE;
        int[] ans = new int[2];
        while( i <= j){
            if(i*j == area){
                int dif = j-i;
                if(dif < min){
                    min = dif;
                    ans[0] = j;
                    ans[1] = i;
                }
                i++;
                j--;
            }
            else if(i*j > area) j--;
            else i++;
        }
        return ans;
    }
}