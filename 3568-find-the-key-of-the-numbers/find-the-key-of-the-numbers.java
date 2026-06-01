class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String n1 = String.format("%04d", num1);
        String n2 = String.format("%04d", num2);
        String n3 = String.format("%04d", num3);
        StringBuilder key = new StringBuilder();
        for(int i = 0; i < 4; i++) {
            char minDigit = (char)Math.min(n1.charAt(i), Math.min(n2.charAt(i), n3.charAt(i)));
            key.append(minDigit);
        }
        return Integer.parseInt(key.toString());
    }
}