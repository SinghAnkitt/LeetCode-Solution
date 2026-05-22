// class Solution {
//     public int sumOddLengthSubarrays(int[] arr) {
//         int n = arr.length;
//         int sum = (n*n+1)/2;
//         for(int i = 0; i < n; i++){
//             int count = 0;
//             int k = i+1;
//             for(int j = i; j < n; j++){
                
//             }
//         }
//     }
// }
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int total = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int contribution = ((i + 1) * (n - i) + 1) / 2;
            total += arr[i] * contribution;
        }

        return total;
    }
}