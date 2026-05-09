class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int n = s.length();
        String str = "";
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') ){
                str += s.charAt(i);
            }
        }
        int length = str.length()-1;
        int i = 0;
        while(i < length){
            if(str.charAt(i) != str.charAt(length)) return false;
            i++;
            length--;
        }
        return true;
    }
}