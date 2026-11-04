class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        int answer = 0;
        long volume = (long) length * width * height;
        if(length >= 10000 || width >= 10000 ||height >= 10000 || volume >= 1000000000L)answer += 1;
        if(mass >= 100) answer += 2;
        if(answer == 3) return "Both";
        if(answer == 1) return "Bulky";
        if(answer == 2) return "Heavy";
        return "Neither";
    }
}