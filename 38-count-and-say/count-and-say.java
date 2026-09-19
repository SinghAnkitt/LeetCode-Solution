class Solution {
    public String countAndSay(int n) {
        String result = "1";

        for (int k = 1; k < n; k++) {
            StringBuilder next = new StringBuilder();

            int i = 0;

            while (i < result.length()) {
                int count = 1;

                while (i + 1 < result.length() &&
                       result.charAt(i) == result.charAt(i + 1)) {
                    count++;
                    i++;
                }

                next.append(count);
                next.append(result.charAt(i));

                i++;
            }

            result = next.toString();
        }

        return result;
    }
}