class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = numOnes+numZeros;
        int dif = k-sum;
        if(k <= numOnes) return k;
        if( k <= sum) return numOnes;
        else return numOnes-dif;
    }
}