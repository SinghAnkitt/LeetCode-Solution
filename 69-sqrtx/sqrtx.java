class Solution {
    public int mySqrt(int x) {
        if(x == 0 ) return x;
        for(int i = 1; i <= x; i++){
            if((long)i*i == x) return i;
            if((long)i * i > x){
                return i-1;
            }
        }
        return -1;
    }
}



// class Solution {
//     public int mySqrt(int x) {
//         int low = 1; int high = x;
//         while(low <= high){
//             int mid = low + (high - low)/2;
//             if(mid == x/mid) return mid;
//             else if(mid > x/mid) high = mid - 1;
//             else low = mid + 1;
//         }
//         return high;
//     }
// }