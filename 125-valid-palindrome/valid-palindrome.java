class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int len = s.length();
        String str = "";
        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
                str += ch;
            }
        }
        int j = str.length() - 1;
        int i = 0;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}