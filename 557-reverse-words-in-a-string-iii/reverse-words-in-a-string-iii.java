class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (ans.length() > 0) {
                ans.append(" ");
            }
            StringBuilder sb = new StringBuilder(arr[i]);
            ans.append(sb.reverse());
        }
        return ans.toString();
    }
}