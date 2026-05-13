class Solution {
    public void reverseString(char[] s) {
        int j = s.length;
        int i = 0;
        while(i < j){
            char temp = s[i];
            s[i] = s[j-1];
            s[j-1] = temp;
            i++;
            j--;
        }
    }
}