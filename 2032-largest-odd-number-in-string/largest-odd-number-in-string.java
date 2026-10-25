class Solution {
    public String largestOddNumber(String num) {
        int len = num.length();
        for(int i = 0; i < len; i++){
            if((num.charAt(len-i-1) - '0') % 2 != 0){
                return num.substring(0, len-i);
            }
        }
        return "";
    }
}