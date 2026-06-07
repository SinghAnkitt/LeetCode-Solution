class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        char digitMax = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '9') {
                digitMax = s.charAt(i);
                break;
            }
        }
        String maxStr = s;
        if (digitMax != ' ') {
            maxStr = s.replace(digitMax, '9');
        }
        char digitMin = s.charAt(0);
        String minStr = s.replace(digitMin, '0');
        return Integer.parseInt(maxStr) - Integer.parseInt(minStr);
    }
}