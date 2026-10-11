class Solution {
    public int vowelConsonantScore(String s) {
        int vowels = 0;
        int consonants = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        if (consonants == 0) {
            return 0;
        }

        return vowels / consonants;
    }
}