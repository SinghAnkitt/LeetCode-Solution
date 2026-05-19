class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = sb.length() - 1;
        while (i < j) {
            char left = sb.charAt(i);
            char right = sb.charAt(j);
            if (Character.isLetter(left) && Character.isLetter(right)) {
                sb.setCharAt(i, right);
                sb.setCharAt(j, left);
                i++;
                j--;
            }
            else if (!Character.isLetter(left)) {
                i++;
            }
            else {
                j--;
            }
        }
        return sb.toString();
    }
}